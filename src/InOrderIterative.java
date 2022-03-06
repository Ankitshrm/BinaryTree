import java.util.Stack;

public class InOrderIterative {

    private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }

   private static void InOrder(){
        if (root==null) return ;
        Stack<TreeNode> stack =new Stack<>();
        TreeNode temp= root;
        while(!stack.isEmpty()|| temp!=null){
            if (temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else {
                temp=stack.pop();
                System.out.print(temp.data);
                temp=temp.right;
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

        InOrder();
    }

}
