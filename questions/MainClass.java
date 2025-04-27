class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

public class MainClass {
  public static void main(String[] args) {
    TreeNode newnode = new TreeNode(2);
    newnode.left = new TreeNode(4);
    newnode.right = new TreeNode(8);
    newnode.left.left = new TreeNode(3);
    newnode.right.left = new TreeNode(5);
    System.out.println("Count of nodes in a Tree is : " + countNodes(newnode));
  }

  public static int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int countnode = 1 + countNodes(root.left) + countNodes(root.right);
    return countnode;
  }
}