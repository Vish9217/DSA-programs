public class BinarySearch {
    public static int BS(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){ //= is for the condition that when our start is equal to the end that is for single element array 
            int mid=(start+end)/2;
            if(numbers[mid]==key){ //Found at mid
                return mid;
            }
            if(numbers[mid]<key){//in right section
                start=mid+1;
            }
            else{//In left section
                end=mid-1;
            }

        }
        return -1; //the loop will continue till element found because start and end will changes in each run of the loop
    }
    public static void main(String[] args) {
        int numbers[]={2,5,6,3,3,6,7,53,9};
        System.out.println( "the key is found at "+ BS(numbers, 7));
        
    }
    
}
