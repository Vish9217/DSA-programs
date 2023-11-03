public class countNodesOfBT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        Node(Node node) {
            this.data = node.data;
            this.left = node.left;
            this.right = node.right;
        }
    }
    /**
     * @param root
     * @return
     */
    public static int count(Node root)
    {
        if(root==null){
            return 0;

        }
        int leftcount=count(root.left);
        int rightcount=count(root.right);
        int treecount=leftcount+rightcount+1;
        return treecount;
    }
    //sum of the nodes data
     public static int sum(Node root)
    {
        if(root==null){
            return 0;

        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        int treesum=leftsum+rightsum+root.data;
        return treesum;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

       // System.out.println("the count of nodes is "+count(root));
         System.out.println("the sum of nodes is "+sum(root));
    }
    
}
