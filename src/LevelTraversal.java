import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {
    private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }

    private static void Level(){
        if (root==null){
            return;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp =queue.poll();
            System.out.print(temp.data);
            if (temp.left!=null){
                queue.offer(temp.left);
            }
            if (temp.right!=null){
                queue.offer(temp.right);
            }
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

        Level();
    }
}
