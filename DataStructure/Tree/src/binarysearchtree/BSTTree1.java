package binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class BSTTree1 {
    BSTNode root;

    static class BSTNode {
        int key;
        Object value;
        BSTNode left;
        BSTNode right;

        public BSTNode(int key) {
            this.key = key;
        }


        public BSTNode(int key, Object value) {
            this.key = key;
            this.value = value;
        }

        public BSTNode(int key, Object value, BSTNode left, BSTNode right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }


    }
    //查找关键字对应的值
//      递归方式（尾递归） ----容易用迭代方法实现
//    public Object get(int key) { //通过key找到值
//        return doGet(root, key);
//    }
//    private Object doGet(BSTNode node, int key) {
//        if (node == null) {
//            return null; //没有找到
//        }
//        if (key < node.key) {
//            return doGet(node.left, key); //向左找
//        } else if (key > node.key) {
//            return doGet(node.right, key);
//        } else {
//            return node.value;
//        }
//    }

    //迭代方式
    //查找关键字对应的值
    public Object get(int key) {
        while (root != null) {
            if (key > root.key) {
                root = root.right;
            } else if (key < root.key) {
                root = root.left;
            } else {
                return root.value;
            }
        }
        return null;
    }


    //查找最小关键字对应值
//    //return : 关键字对应的值
//    public Object min() {
//        return doMin(root);
//    }
//    //递归实现
//    public Object doMin(BSTNode node) {
//        if (node == null) {
//            return null;
//        }
//        if (node.left == null) { //最小的节点
//            return node.value;
//        }
//        return doMin(node.left);
//    }

    //迭代方式
    //查找最小关键字对应的值
    public Object min() {
        return min(root);
    }
    private Object min(BSTNode node) { //以任意节点为起点找到以该节点为根的最小关键字对应的值
        if (node == null) {
            return null;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.value;
    }

    //查找最大关键字对应的值--非递归
    public Object max() {
        return max(root);
    }
    private Object max(BSTNode node) { //重载，更加通用，可以以任意一个节点为起点，找到该树的最大节点值
        if (node == null) {
            return null;
        }
        while (node.right != null) {
            node = node.right;
        }
        return node.value;
    }


    //存储关键字和对应值
    public void put(int key, Object value) {
        //1.key 有，更新
        //2.key 无，添加
        BSTNode parent = null;
        while (root != null) {
            parent = root;
            if (key > root.key) {
                root = root.right;
            } else if (key < root.key) {
                root = root.left;
            } else {
                //1.找到了key
                //key的值要进行更新
                root.value = value;
            }
        }
        //2.没有找到key 新增
        //new BSTNode(key, value);
        //此时 parent就是新增节点的父节点
        if (parent == null) {
            //当树为空的时候，新节点就是根
            root = new BSTNode(key, value);
            return ;
        } else {
            if (key > parent.key) {
                //新节点key比父节点大
                root.right = new BSTNode(key, value);
            } else {
                root.left = new BSTNode(key, value);
            }
        }
    }

    //查找关键字的前任值
    public Object predecessor(int key) {
        BSTNode p = root;
        BSTNode ancestorFromLeft = null;//自左而来的祖先节点
        while (p != null) {
            if (key > p.key) {
                //祖先自左而来
                ancestorFromLeft = p; //会更新至离p最近的左祖先节点
                p = p.right;
            } else if (key < p.key) {
                //祖先自右而来
                p = p.left;
            } else {
                //找到了 或者一进来p就为null
                break;
            }
        }

        //没找到节点
        if (p == null) {
            return null;
        }

        /**
         * 找到节点，分类讨论
         * 1.节点有左子树，此时前任就是左子树的最大值
         * 2.节点没有左子树，若离他最近的，自左而来的祖先就是前任
         */
        if (p.left != null) { //节点有左子树
            return max(p.left); //找到左子树的最大值
        } else {    //节点没有左子树
            return ancestorFromLeft != null ? ancestorFromLeft.value : null;
        }
    }

    //查找关键字的后任值
    public Object succcessor(int key) {
        BSTNode p = root;
        BSTNode ancestorFromRight = null;//自右而来的祖先节点
        while (p != null) {
            if (key > p.key) {
                //祖先自左而来
                p = p.right;
            } else if (key < p.key) {
                //祖先自右而来
                ancestorFromRight = p; //会更新至离p最近的右祖先节点
                p = p.left;
            } else {
                //找到了 或者一进来p就为null
                break;
            }
        }

        //没找到节点
        if (p == null) {
            return null;
        }

        /**
         * 找到节点，分类讨论
         * 1.节点有右子树，此时前任就是右子树的最小值
         * 2.节点没有右子树，若离他最近的，自右而来的祖先就是后任
         */
        if (p.right != null) { //节点有右子树
            return min(p.right); //找到右子树的最小值
        } else {    //节点没有右子树
            return ancestorFromRight != null ? ancestorFromRight.value : null;
        }
    }

    //根据关键字删除--非递归
    //返回删除节点的值
    public Object delete(int key) {
        BSTNode p = root;
        BSTNode parent = null; //记录p的父节点
        while (p != null) { //找p
            if (key < p.key) {
                parent = p;
                p = p.left;
            } else if (key > p.key) {
                parent = p;
                p = p.right;
            } else {
                break;
            }
        }
        if (p == null) {
            return null;
        }
        //删除操作
        /**
         * 1.删除节点没有左孩子，将右孩子托孤给parent
         * 2.删除节点没有右孩子，将左孩子托孤给parent
         * 3.删除节点左右孩子都没有，将null托孤给parent 可以直接走1.与2.
         * 4.删除节点左右孩子都有
         */
        if (p.left == null) {
            //1.p没有左孩子，有右孩子
            //3.p既没有左孩子也没有右孩子
            shift(parent, p, p.right);
        } else if (p.right == null) {
            //2.p有左孩子，没有右孩子
            shift(parent, p, p.left);
        } else {
            //4.p左右孩子都有!!!

            //4.1 被删除节点找后继
            BSTNode s = p.right;
            BSTNode sParent = p; //后继父亲
            while (s.left != null) {
                sParent = s;
                s = s.left;
            } //s为后继节点
            if (sParent != p) { //后继与删除节点不相邻
                //4.2 不相邻，处理后事
                shift(sParent, s, s.right); //不可能有左孩子
                s.right = p.right;
            }

            //4.3 后继取代被删除的节点--托孤方法
            //parent--p的父节点  p--被删除的节点  s--准备顶上去的节点
            shift(parent, p, s);
            s.left = p.left;

        }
        return p.value;
    }
    //托孤方法
    // parent--被删除节点的父亲   deleted--被删除节点    child--被顶上去的节点
    private void shift(BSTNode parent, BSTNode deleted, BSTNode child) {
        if (parent == null) {
            root = child;
        } else if (deleted == parent.left) {
            //如果删除的节点为parent的左节点，将该结点的child托孤给parent
            parent.left = child;
        } else{
            //如果删除的节点为parent的右节点，将该结点的child托孤给parent
            parent.right = child;
        }
    }

    //找 < key 的所有value
    public List<Object> less(int key) {
        /**
         * 对于二叉搜索树，使用中序遍历，
         * 即可得到按升序排列的线性表
         */
        ArrayList<Object> result = new ArrayList<>(); //存放root.value
        BSTNode p = root;
        LinkedList<BSTNode> stack = new LinkedList<>();
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                BSTNode pop = stack.pop();
                //处理值
                if (pop.key < key) {
                    result.add(pop.value);
                } else { //提前结束：由于中序遍历得到的就是由小到大的顺序链，当碰到第一个pop.key > key,那么之后都不用判断了
                    break;
                }
                p = pop.right;
            }
        }
        return result;
    }

    //找 > key 的所有value
    public List<Object> greater(int key) {
//        /**
//         * 对于二叉搜索树，使用中序遍历，
//         * 即可得到按顺序排列的线性表
//         */
//        ArrayList<Object> result = new ArrayList<>(); //存放root.value
//        BSTNode p = root;
//        LinkedList<BSTNode> stack = new LinkedList<>();
//        while (p != null || !stack.isEmpty()) {
//            if (p != null) {
//                stack.push(p);
//                p = p.left;
//            } else {
//                BSTNode pop = stack.pop();
//                //处理值
//                if (pop.key > key) {
//                    result.add(pop.value);
//                }
//                p = pop.right;
//            }
//        }
//        return result;
        /**
         * 上面的注释使用的中序遍历 那么对于选择出 > key的value 不能提前结束
         * 所以准备使用 反向中序遍历---能够得到降序的线性表
         */
        ArrayList<Object> result = new ArrayList<>();
        LinkedList<BSTNode> stack = new LinkedList<>();
        BSTNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.right;
            } else {
                BSTNode pop = stack.pop();
                //处理值
                if (pop.key > key) {
                    result.add(pop.value);
                } else {
                    break;
                }
                p = pop.left;
            }
        }
        return result;
    }

    //找 >= key1 && <= key2 的所有值
    public Object between(int key1, int key2) {
        /**
         * 对于二叉搜索树，使用中序遍历，
         * 即可得到按升序排列的线性表
         */
        ArrayList<Object> result = new ArrayList<>(); //存放root.value
        BSTNode p = root;
        LinkedList<BSTNode> stack = new LinkedList<>();
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                BSTNode pop = stack.pop();
                //处理值
                if (pop.key >= key1 && pop.key <= key2) {
                    result.add(pop.value);
                }
                p = pop.right;
            }
        }
        return result;

    }

}
