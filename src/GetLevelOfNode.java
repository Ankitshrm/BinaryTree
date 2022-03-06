public class GetLevelOfNode {
    private static TreeNode root;

    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private static int Level(TreeNode root , int key,int level){
        if (root==null) return -1;


        if (root.data==key){
            return level;
        }

        int l;
        l =Level(root.left,key,level+1);

        if (l!=-1){
            return l;
        }
        return Level(root.right,key,level+1);

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

        System.out.println(Level(root,6,1));


    }
}