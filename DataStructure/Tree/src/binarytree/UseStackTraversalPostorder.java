package binarytree;

import binarytree.Treenode;

import java.util.LinkedList;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class UseStackTraversalPostorder {

      //二叉树后序遍历（左，右，值）


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
      Treenode pop = null; //代表最近弹栈的元素
      while (cur != null || !stack.isEmpty()) {
         if (cur != null) {
            stack.push(cur);//压入栈
            cur = cur.left;
         } else {//能到else的 代表 root.left == null
            Treenode peek = stack.peek();
            if (peek.right == null || peek.right == pop) { //弹出栈时，需要判断能不能弹出去
               pop = stack.pop();
               System.out.println("回：" + pop.val);

            } else {
               cur = peek.right;
            }

         }

      }
   }

}
