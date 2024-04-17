package redblacktree;

/**
 * @author 吴金辉
 * @version 1.0
 */

/**
 * 红黑树也是一种自平衡的二叉搜索树，较之AVL，插入和删除时旋转的次数更少
 * 红黑树特性：
 *    1.所有的节点都有两种颜色：红与黑
 *    2.所有的null视为黑色
 *    3.红色节点不能相邻
 *    4.根节点为黑色
 *    5.从根节点到任意的一个子节点，路径中的给黑色节点树一样（黑色完美平衡）
 */
public class RedBlackTree {

   enum Color {
      RED, BLACK;
   }

   private Node root;

   private static class Node {
      int key;
      Object value;
      Node left;
      Node right;
      Node parent; //父节点
      Color color = Color.RED; //节点初始颜色为红色

      public Node(int key, Object value) {
         this.key = key;
         this.value = value;
      }

      public Node(int key) {
         this.key = key;
      }

      public Node(Object value) {
         this.value = value;
      }

      //该节点是否为左孩子
      boolean isLeftChild() {
         return parent != null && parent.left == this;
      }

      // 叔叔节点
      Node uncle() {
         if (parent == null || parent.parent ==  null) {
            return null;
         }
         if (parent.isLeftChild()) { //当该节点的父亲为爷爷的左孩子时
            return parent.parent.right;
         } else {
            return parent.parent.left;
         }
      }

      //兄弟
      Node sibling() {
         if (parent == null) return null;
         if (this.isLeftChild()) { //当前节点为父亲的左孩子
            return parent.right;   //那么兄弟就是父亲的右孩子
         } else {
            return parent.left;
         }
      }
   }

   //判断红、黑
   boolean isRed(Node node) {
      return node != null && node.color == Color.RED;
   }

   boolean isBlack(Node node) {
      return node != null && node.color == Color.BLACK;
      //return !isRed(node); //不是红，一定是黑，null也视为黑色
   }

   //右旋 1.parent的处理 2.旋转后新根的父子关系---比AVL树要多处理两件事
   private void rightRotate(Node pink) {
      Node yellow = pink.left;
      Node green = yellow.right;
      if (green != null) {
         green.parent = pink;
      }
      yellow.right = pink;
      yellow.parent = pink.parent;
      pink.left = green;
      pink.parent = yellow;
      //建立新根的父子关系
      if (pink.parent != null) {
         if (pink.parent.left == pink) {
            pink.parent.left = yellow;
         } else {
            pink.parent.right = yellow;
         }
      }
   }

   //左旋 与右旋相反
   private void leftRotate(Node pink) {
      Node yellow = pink.right;
      Node green = yellow.left;
      if (green != null) {
         green.parent = pink;
      }
      yellow.left = pink;
      yellow.parent = pink.parent;
      pink.right = green;
      pink.parent = yellow;
      //建立新根的父子关系
      if (pink.parent != null) {
         if (pink.parent.left == pink) {
            pink.parent.left = yellow;
         } else {
            pink.parent.right = yellow;
         }
      }
   }

   //新增或更新
   //正常增，遇到红红不平衡进行调整
   //Params: key - 键    value - 值
   public void put(int key, Object value) {
      Node p = root;
      Node parent = null;
      while (p != null) {
         parent = p;
         if (key < p.key) {
            p = p.left;
         } else if (key > p.key) {
            p = p.right;
         } else {
            p.value = value; //更新值
            return ;
         }
      }
      Node inserted = new Node(key, value);
      if (parent == null) {
         root = inserted;
      } else if (key < parent.key) {
         parent.left = inserted;
         inserted.parent = parent; //父子间可以双向寻找
      } else {
         parent.right = inserted;
         inserted.parent = parent;
      }
      fixRedRed(inserted); //重新平衡
   }

   void fixRedRed(Node x) {
      //case 1 :插入的节点是根节点，只需变黑即可
      if (x == root) {
         x.color = Color.BLACK;
         return ;
      }
      //case 2 :插入节点的父节点是黑色，无需调整
      if (isBlack(x.parent)) {
         return ;
      }
      //case 3与case4触发了红红相邻
      //红黑树恢复平衡的方法有两种，一是变色；二是旋转

      //case3: 当红红相邻，叔叔为红时
      //       需要将父亲、叔叔变黑，然后对祖父做递归
   }
}
