public class print_subarrays {
/*public static void subArrays(int numbers[]){
    int no_subarray=0;
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(numbers[k]);
              
            }
            System.out.print(" | ");
            no_subarray++;
        }
        System.out.println();
    }
    System.out.println(no_subarray);
}*/

/*public static void maxSum(int numbers[]){
     int currSum = 0;
     int maxSum=Integer.MIN_VALUE;
    
    for(int i=0;i<numbers.length;i++){
        int start=i;// for getting the start 
        for(int j=i;j<numbers.length;j++){
            int end=j;//end which start from 0 to length of array
            currSum=0;
            for(int k=start;k<=end;k++){//for loop for subarray
                //subarray sum
               currSum+=numbers[k];
            }
            System.out.println(currSum);
            if(maxSum<currSum){
                 maxSum=currSum;
            }
          
        }
        
    }
    System.out.println("The maximum sum is "+maxSum);
   
}
*/
// Max Sum of SubArray [Prefix Method]
/*public static void maxSum(int numbers[]){
    int currSum = 0;
    int maxSum=Integer.MIN_VALUE;
    int prefix[]= new int [numbers.length];
    prefix[0]=numbers[0];
    //calculating prefix Array 
    for (int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+numbers[i];
    }
   
   for(int i=0;i<numbers.length;i++){
       int start=i;// for getting the start 
       for(int j=i;j<numbers.length;j++){
           int end=j;//end which start from 0 to length of array
           currSum=start==0?prefix[end]: prefix[end]-prefix[start-1];//in case if start is o then start-1 gives the negative index so we used tertiory operator
          
          
           if(maxSum<currSum){
                maxSum=currSum;
           }
         
       }
       
   }
   System.out.println("The maximum sum is "+maxSum);


}*/
//KADANE's Method

public static void kadanes(int numbers[]){
int cs=0;
int maxSum=Integer.MIN_VALUE;
for(int i=0;i<numbers.length;i++){
    cs=cs+numbers[i];
    if(cs<0){
        cs=0;
    }
    maxSum=Math.max(cs,maxSum);
}
System.out.println(maxSum);
}
public static void main(String[] args) {
    int numbers[]={-2,-4 ,6,8,10};
    kadanes(numbers); 
}
}
