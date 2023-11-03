
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
     
      int marks[]=new int[100];
      Scanner sc = new Scanner(System.in);
      marks[0]=sc.nextInt();// Taking Input 
      marks[1]=sc.nextInt();
      marks[2]=sc.nextInt();
      for(int i=0;i<=100;i++){
        System.out.println(marks[i]);//For output
        
      }
      
    }

   
    
}
