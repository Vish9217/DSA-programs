
import java.util.*;

public class Largest {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int numbers[]){
       
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest> numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,0,8,9,9,6,3,23};
        System.out.println("Largest Numbers is "+getLargest(numbers));
        System.out.println("Smallest Numbers is "+getSmallest(numbers));

    }
    
}
