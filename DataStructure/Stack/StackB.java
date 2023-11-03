public class StackB {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    static class Stack{
        static Node head=null;

        public static boolean isEmpty(){
            return head ==null;
        }

        public static void push(int data){
            // Replacing the Head of the List
            Node newNode= new Node(data);
            if(isEmpty()){
                head=newNode;// If the Stack is Empty then the newly created node will be Our Head Node
                return;
            }
            newNode.next=head;
            head=newNode;

        }
            //pop()
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;

        }
            //peek()
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
         s.push(8);
          s.push(9);
           s.push(6);
  
           while(! s.isEmpty()){
               int top = s.pop();
        System.out.println(top);
        
    }
    
}
}
