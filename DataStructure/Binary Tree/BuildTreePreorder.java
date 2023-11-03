/*Preorder traversal is defined as a type of tree traversal that follows the Root-Left-Right policy where:

The root node of the subtree is visited first.
Then the left subtree  is traversed.
At last, the right subtree is traversed.
*/

//Time complexity =O(n)


public class BuildTreePreorder {
    //Making the class of node
    static class Node{
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //Making the class of Binary Tree
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);//Recursion 
            newNode.right=buildTree(nodes);//Recursion
            return newNode;

        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree =new BinaryTree();
        Node root=tree.buildTree(nodes);
       // System.out.println(root.left.data);//IT will print the 2 as left child of root
        tree.preorder(root);
    }
    
}
