package binarysearchtree;

/**
 * @author 吴金辉
 * @version 1.0
 */

//二叉搜索树 key泛型
public class BSTTree2<T extends Comparable<T>> { //要实现泛型的比较，还需要实现Comparable的接口
   static class BSTNode<T> {
      T key;
      Object value;
      BSTNode<T> left;
      BSTNode<T> right;

      public BSTNode(T key) {
         this.key = key;
      }


      public BSTNode(T key, Object value) {
         this.key = key;
         this.value = value;
      }

      public BSTNode(T key, Object value, BSTNode<T> left, BSTNode<T> right) {
         this.key = key;
         this.value = value;
         this.left = left;
         this.right = right;
      }


   }

   BSTNode<T> root ; //根节点也要改为泛型

   //根据泛型的key 查找value
   public Object get(T key) {
      while (root != null) {
         /**
          *  compareTo方法的返回值为 -1，0，1
          *  -1 key < root.key
          *  0  key = root.key
          *  1  key > root.key
          *
          */
         int res = key.compareTo(root.key);
         if (res == -1) {
            root = root.left;
         } else if (res == 1) {
            root = root.right;
         } else {
            return root.value;
         }
      }

      return null;
   }

}
