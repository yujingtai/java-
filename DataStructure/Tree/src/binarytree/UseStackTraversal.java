package binarytree;

import binarytree.Treenode;

import java.util.LinkedList;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class UseStackTraversal {
    //二叉树前序遍历（值，左，右）
//    public List<Integer> preorderTraversal(TreeNode root) {
//        return
//    }


    public static void main(String[] args) {
        //创建一个树
        Treenode root = new Treenode(
                new Treenode(new Treenode(4),  2, null),
                1,
                new Treenode(new Treenode(5), 3, new Treenode(6))
        );

        //使用JDK的栈
        //使用迭代的思想来实现深度优先检索，就要记住回来的路
        //使用栈 可以进行回溯
        LinkedList<Treenode> stack = new LinkedList<>();

        Treenode cur = root; //代表当前节点
        while (cur != null || !stack.isEmpty()) {jskdljf
            if (cur != null) {
                //去的打印就是 前序遍历
                //可以把 回 注释掉
                //System.out.println("去：" + cur.val);
                stack.push(cur);//压入栈
                cur = cur.left;
            } else {

                Treenode pop = stack.pop();
                //回打印的就是 中序遍lkj;jsdafjjdsfgsdafjljdfgdfsgdsfg历
                //可以把去 注释掉
                System.out.println("回：" + pop.val);
                cur = pop.right;
            }

        }
    }
}



