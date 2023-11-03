public class SubTreeOfAnotherTree {
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
    //Defining isIdentical
    public static boolean isIdentical(Node node,Node subRoot){
        //Conditions of Identical
        if(node==null && subRoot==null){
            return true;
        }
          //All conditions of non-identical
        else if(node==null || subRoot==null || node.data!=subRoot.data){
            //Non-Identical
            return false;

        }
        if(!isIdentical(node.left, subRoot.left)){
            //If left subtree returns as non-identical
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            //If right subtree returns as non-identical
            return false;
        }
        //Otherwise Identical
        return true;

    }
    public static boolean isSubtree(Node root,Node subRoot){
        //Step1-Finding the same node
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
       //If subRoot is not same as our Root we find it in left or right subtree
        

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        //Subtree
        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        //subRoot.right=new Node(5);

        System.out.println(isSubtree(root, subRoot));
    
}
}
