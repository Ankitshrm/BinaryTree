public class PrintAllElements {
    private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }

    private static int height(TreeNode root){
        if (root==null) return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }

    private static void level(TreeNode root,int level){
        if (root==null){
            return;
        }
        if (level==1){
            System.out.print(root.data+" ");
            return;
        }

        level(root.left,level-1);
        level(root.right,level-1);
    }
    private static void PrintAll(TreeNode root){

        for (int i=1;i<=height(root);i++){
            level(root,i);
            System.out.println();
        }
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

        PrintAll(root);
    }
}
