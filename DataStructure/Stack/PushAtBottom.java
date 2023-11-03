import java.util.*;
public class PushAtBottom {
    public static void pushAtBottomMethod(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top=s.pop();
        pushAtBottomMethod(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);                   
        s.push(2);                  
        s.push(3);

        /*                  |3|
         *    |3|           |2|
         *    |2|  ------>  |1|
         *    |1|           |4|
         */

        pushAtBottomMethod(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
       
    }
    
}
