public class DiameterOfTree {
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
    
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;

    }
      /**
     * @param root
     * @return
     */

    /***********************Approach 1******************************* */
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiam=diameter(root.left);
        int rightDiam=diameter(root.right);
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int selfDiam=leftHeight+rightHeight+1;
        return Math.max(Math.max(leftDiam,rightDiam),selfDiam);
    }
    /***********************Approach 2******************************* */

    //Defining the Info class 
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }

    }

    public static Info diameter2(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo=diameter2(root.left);// This will stores both diam and ht of left subtree
        Info rightInfo=diameter2(root.right);// This will stores both diam and ht of right subtree
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);//Final Diameter
        int ht=Math.max(leftInfo.ht,leftInfo.ht)+1;//Final Height
        return new Info(diam, ht);
        

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

       // System.out.println("The Diameter of the tree is "+diameter(root));
        System.out.println("The Diameter of the tree is "+diameter2(root).diam);
        System.out.println("The Height of the tree is "+diameter2(root).ht);
    }
    
}
