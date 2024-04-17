package binarytree;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Treenode {
   public  int val;
   public Treenode left; //默认为null
   public Treenode right; //默认为null

   public Treenode(int val) {
      this.val = val;
   }

   public Treenode(Treenode left, int val, Treenode right) {
      this.left = left;
      this.val = val;
      this.right = right;
   }


}
