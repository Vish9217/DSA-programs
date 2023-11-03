public class ReverseArray {
    public static void rev(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;

            first=first+1;
            last=last-1;
        }
        

    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8};
        System.out.println("The original Array");
        for(int i=0;i<numbers.length;i++ ){
            System.out.print(numbers[i]);
        }
        System.out.println();
        rev(numbers);//This function will reverse the array 
        System.out.println("The reversed Array");
        for(int i=0;i<numbers.length;i++ ){
            System.out.print(numbers[i]);
        }
        
    }
    
}
