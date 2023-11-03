 import java.util.ArrayList;
 import java.util.Collections;

public class StackA {
    static class Stack{
        static ArrayList<Integer> list =new ArrayList<>();
        // Making the function isEmpty()
        public static boolean isEmpty(){
            return list.size()==0;//if this is true the the list is empty And gives True
        }

        //push
        public static void push(int x){
            list.add(x);//the Data is gets added at the end of the stack i.e. at top
        }

        //Pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return  list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
       // Stack s=new Stack();
       // Stack.push(0);
       // Stack.push(1);
        //Stack.push(2);
      // System.out.println( Stack.peek());
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
