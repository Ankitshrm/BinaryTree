public class MaxValue {private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }


    private  static int MaxVal(TreeNode root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;

        int left = MaxVal(root.left);
        int right =MaxVal(root.right);

        if (left>result){
            result=left;
        }
        if (right>result){
            result=right;
        }

        return result;
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

        System.out.println(MaxVal(root));
    }


}
