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

public class Height {
    public static void main(String[] args) {
        TreeNode newnode = new TreeNode(2);
        newnode.left = new TreeNode(4);
        newnode.right = new TreeNode(8);
        newnode.left.left = new TreeNode(3);
        newnode.right.left = new TreeNode(5);
        System.out.println("Height of the tree is : " + HeightofTree(newnode));
    }

    public static int HeightofTree(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int height = 1 + Math.max(HeightofTree(root.left), HeightofTree(root.right));
        return height;
    }
}