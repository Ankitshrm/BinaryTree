public class CheckIdentical {
    private static TreeNode root1;
    private static TreeNode root2;
    private static class TreeNode{

        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }

    private static boolean identicalTrees(TreeNode a,TreeNode b){
        if (a == null && b ==null){
            return true;
        }
        if (a == null || b ==null){
            return false;
        }
        return a.data == b.data
                && identicalTrees(a.left , b.left)
                && identicalTrees(a.right,b.right);
     }


    public static void main(String[] args) {

        CheckIdentical tree = new CheckIdentical();

        root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(4);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);

        if (identicalTrees(root1, root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");

    }
}