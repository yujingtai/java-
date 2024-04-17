package avltree;

/**
 * @author 吴金辉
 * @version 1.0
 */


import binarytree.Treenode;
import sun.java2d.opengl.OGLContext;

import javax.swing.tree.TreeNode;

/**
 * AVL树
 *  - 二叉搜索树在插入或者删除时，节点可能失衡
 *  - 如果在插入和删除的时候用过旋转，始终让二叉搜索树保持平衡，称为自平衡二叉搜索树
 *  - AVLTree是自平衡二叉搜索树的实现之一
 */
public class AVLTree {
    static class  AVLNode {
        int key;
        Object value;
        AVLNode left;
        AVLNode right;
        int height = 1; //高度

        public AVLNode(int key, Object value) {
            this.key = key;
            this.value = value;
        }

        public AVLNode(int key) {
            this.key = key;
        }

        public AVLNode(int key, Object value, AVLNode left, AVLNode right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    //求节点高度
    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    //更新节点高度(新增，删除，旋转)
    private void updateHeight(AVLNode node) {
        node.height = Integer.max(height(node.left), height(node.right)) + 1;
    }

    //平衡因子(balance factor) = 左子树高度 - 右子树高度
    private int bf(AVLNode node) {
        return height(node.left) - height(node.right);
    } //-1,0,1表示平衡  >1或者 <-1表示不平衡

    /**
     * 四种失衡情况：
     *  LL
     *      -失衡节点的左边更高
     *      -失衡节点的左边也是左边高
     *  LR
     *      -失衡节点的左边更高
     *      -失衡节点的左边的右边高
     *  RR
     *      -失衡节点的右边更高
     *      -失衡节点的右边也是右边高
     *  RL
     *      -失衡节点的右边更高
     *      -失衡节点的右边的左边高
     */
    //参数：要旋转的节点  返回值：新的节点
    private AVLNode rightRotate(AVLNode red) {  //右旋
        AVLNode yellow = red.left; //因为是准备右旋，所以左边的yellow一定不为空
        AVLNode green = yellow.right;
        yellow.right = red; //上位
        red.left = green;   //换爹
        updateHeight(red);  //红为低位，黄为高节点
        updateHeight(yellow); //必须先更新红，再更新黄
        return yellow;
    }

    //参数：要旋转的节点  返回值：新的根节点
    private AVLNode leftRotate(AVLNode red) { //左旋
        AVLNode yellow = red.right;
        AVLNode green = yellow.left;
        yellow.left = red;
        red.right = green;
        updateHeight(red);  //红为低位，黄为高节点
        updateHeight(yellow); //必须先更新红，再更新黄
        return yellow;
    }

    //先左旋左子树，再右旋根节点
    private AVLNode leftRightRotate(AVLNode node) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }

    //先右旋右子树，再左旋根节点
    private AVLNode rightLeftRotate(AVLNode node) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }

    //检查节点是否平衡，并且重新平衡树
    private AVLNode balance(AVLNode node) {
        if (node == null) {
            return null;
        }
        int bf = bf(node); //求得平衡因子
        if (bf > 1 && bf(node.left) >= 0) { //LL
            //进行右旋
            return rightRotate(node);
        } else if (bf > 1 && bf(node.left) < 0) { //LR
            //进行左右旋
            return leftRightRotate(node);
        } else if (bf < -1 && bf(node.right) <= 0) { //RR
            //进行左旋
            return leftRotate(node);
        } else if (bf < -1 && bf(node.right) > 0) { //RL
            //进行右左旋
            return rightLeftRotate(node);
        }
        return node;
    }

    AVLNode root;
    public void put(int key, Object value) {
        root = doPut(root, key, value);
    }
    private AVLNode doPut(AVLNode node, int key, Object value) {
        //1.找到空位，创建新节点
        if (node == null) {
            return new AVLNode(key, value);
        }
        //2.key已存在，更新
        if (key == node.key) {
            node.value = value;
            return node;
        }
        //3.继续查找
        if (key < node.key) {
            node.left = doPut(node.left, key, value);
        } else {
            node.right = doPut(node.right, key, value);
        }
        //更新高度
        updateHeight(node);
        //还需要平衡！
        return balance(node);
    }

    //删除
    public void remove(int key) {
        doRemove(root, key);
    }
    private AVLNode doRemove(AVLNode node, int key) {
        //1.node == null
        if (node == null) {
            return null;
        }
        //2.没找到key
        if (key < node.key) {
            node.left = doRemove(node.left, key);
        } else if (key > node.key) {
            node.right = doRemove(node.right, key);
        } else {
            //3.找到key 1)没有孩子 2）只有一个孩子 3）有两个孩子
            if (node.left == null && node.right == null) {
                //没有孩子
                return null;
            } else if (node.left == null) {
                //因为还要更新高度并且重新balance，所以不宜直接return
                node = node.right;
            } else if (node.right == null) {
                node = node.left; //与上同理
            } else {
                //有两个孩子
                //首先找后继
                AVLNode sur = node.right; //从要删除节点的右子树开始向左找
                while (sur.left != null) {
                    sur = sur.left;
                } //sur 就是后继节点
                //准备替换前，要做好sur的后事
                //sur.left 一定为null ，但是 sur.right 不一定为空
                sur.right = doRemove(node.right, sur.key);
                sur.left = node.left;
                node = sur;
            }
        }
        //4.更新高度
        updateHeight(node);
        //5.balance
        return balance(node);
    }
}
