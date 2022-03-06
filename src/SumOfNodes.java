public class SumOfNodes {
    private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }

    private static int sumNode(TreeNode root){
        if (root==null) return 0;
        return root.data + sumNode(root.left)+sumNode(root.right);
    }
    public static void main(String[] args) {
        TreeNode one =new TreeNode(1);
        TreeNode two =new TreeNode(2);
        TreeNode third =new TreeNode(3);
        TreeNode fourth =new TreeNode(4);
        TreeNode fifth =new TreeNode(5);
        TreeNode six =new TreeNode(6);

        root=one;
        one.left=two;
        one.right=third;

        two.left=fourth;
        two.right=fifth;

        third.left=six;

        System.out.print(sumNode(root));

    }
}
