import java.util.Stack;

public class PostOrderIterative {
    private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }

    private static void PostOrder(){
        if (root==null) return;
        Stack<TreeNode> stack =new Stack<>();
        TreeNode current = root;
        while(current!=null|| !stack.isEmpty()){
            if (current!=null){
                stack.push(current);
                current=current.left;
            }else {
                TreeNode temp = stack.peek().right;
                if (temp==null){
                    temp=stack.pop();
                    System.out.print(temp.data);
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.print(temp.data);
                    }
                }else {
                    current=temp;
                }
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

        PostOrder();
    }

}
