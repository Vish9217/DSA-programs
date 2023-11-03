import java.util.*;


public class PreOrderBard {
    // Making the class of node
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

    // Making the class of Binary Tree
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            if (nodes == null) {
                return null;
            }

            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes); // Recursion
            newNode.right = buildTree(nodes); // Recursion

            return newNode;
        }
        //Preorder Traversal
        public static void preorder(Node root) {
            if (root == null) {
                System.out.print("-1");
                return;
            }

            System.out.print(" "+root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        //Inorder Traversal
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        }
        //Postorder Traversal
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

        }
        //Level Order Traversal
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }

            //Making the Queue
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currentNode=q.remove();
                if(currentNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                    
                }
                else{
                        System.out.print(currentNode.data+" ");
                        if(currentNode.left!=null){
                            q.add(currentNode.left);
                        }
                        if(currentNode.right!=null){
                            q.add(currentNode.right);
                        }

                    }
            }
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        /*System.out.println("Preorder traversal of the tree:");
        tree.preorder(root);
        o/p=1 2 4 5 3 6
        */
        
       /*  System.out.println("inorder traversal of the tree:");
        tree.inorder(root);
        o/p=4 2 5 1 3 6
        */
        
       /*  System.out.println("postorder traversal of the tree:");
        tree.postorder(root);

        O/p=4 5 2 6 3 1
        */
       
       
       /* System.out.println("Levelorder traversal of the tree:");
        tree.levelOrder(root);
        O/P=  1
              2 3
              4 5 6
              */

        System.out.println(height(root));



    }
    

    
}
