public class RightView {
    private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }

    static int maxLength;
    private static void printLeftView(TreeNode root,int level){
        if (root==null) return;
        if (level>=maxLength){
            System.out.print(root.data+" ");
            maxLength++;
        }
        printLeftView(root.right,level+1);
        printLeftView(root.left,level+1);
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

        printLeftView(root, 0);
    }

}