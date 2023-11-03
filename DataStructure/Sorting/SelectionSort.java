

public class SelectionSort {
    public static void selectionSort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
      

    }

    //descnding order

    public static void selectionSortDec(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
      

    }
    
    public static void printSortedArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);}
        }
        public static void main(String[] args) {
     int arr[]={9,8,6,5,2,3,1};
     selectionSortDec(arr);
     printSortedArr(arr);
     
    
    }
    
}
