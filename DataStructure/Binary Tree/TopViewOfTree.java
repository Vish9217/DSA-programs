import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class TopViewOfTree {
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
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }


    /**
     * @param root
     */
    public static void topView(Node root){
        Queue<Info> q=new LinkedList<>();//For level Order Traversal
        HashMap<Integer,Node> map =new HashMap<>();//For storing the node which have unique Horizintal distance as a key
        int min =0,max=0;//Tracking the Horizontal 
        q.add(new Info(root, 0));//For adding the Info Object for the root 
        q.add(null);//For adding the new line
    //Step 1-Level order traversal and adding in the Queue
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
           else{
                if(!map.containsKey(curr.hd)){
                //Tracks the node whose key i.e. the hd will occurs for the first time and only this node will become the node of our TopView
                //First time the horizontal distance in occuring
                // Then we add this data into our Queue
                map.put(curr.hd,curr.node);
               }
               // Now checking that the left child for the current is notnull then 
              if(curr.node.left!=null){
                q.add(new Info(curr.node.left, curr.hd)); 
                //Calculating the minimum
                //On Left the Horizantal distance is calculated as curr.hd-1
                min =Math.min(min, curr.hd-1);
               }
               if(curr.node.right!=null){
                q.add(new Info(curr.node.right, curr.hd)); 
                //Calculating the minimum
                //On Right the Horizantal distance is calculated as curr.hd+1
                max =Math.min(min, curr.hd+1);
              }
           }
        }
        for (int i=min;i<=max;i++){
            Node node = map.get(i);
            if (node != null) {
                System.out.print(node.data + " ");
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        topView(root);
    }
    
}
