public class MirrorElement {
    private static TreeNode root;

    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private static void InOrder(TreeNode root){
        if(root==null) return;

        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }

    private static TreeNode Mirror(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror(root.left);
        Mirror(root.right);
        return root;
    }


    public static void main(String[] args) {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        root = one;
        one.left = two;
        one.right = third;

        two.left = fourth;
        two.right = fifth;

        third.left = six;

        TreeNode ans = Mirror(root);

        InOrder(ans);
    }
}