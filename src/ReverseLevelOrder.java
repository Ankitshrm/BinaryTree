public class ReverseLevelOrder {
    private static TreeNode root;

    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }
    private static void Level(TreeNode root , int level){
        if (root==null) return ;
        if (level==1){
            System.out.print(root.data+" ");
            return;
        }

        Level(root.left,level-1);
        Level(root.right,level-1);

    }

    private static int heightTree(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(heightTree(root.left),heightTree(root.right));
    }

    private static void Reverse(TreeNode root){
        for(int i=heightTree(root);i>0;i--)
        {
            Level(root,i);
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


        Reverse(root);


    }
}