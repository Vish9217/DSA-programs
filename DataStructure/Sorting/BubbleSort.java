
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){ //If current element is greater then the next element then swap the current element with the next element
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
//Trying to optimize the code if it is already sorted
        /*public static void bubbleSort(int arr[]){
            for(int turn=0;turn<arr.length-1;turn++){
                int swaps=0;
                for(int j=0;j<arr.length-1-turn;j++){
                    if(arr[j]>arr[j+1]){ //If current element is greater then the next element then swap the current element with the next element
                        //swap
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swaps++;
                        
            


                    }
                    if(swaps==0){
                        System.out.println("swap not needed");
                        break;
                        
                    }
                }
              
            }
        }*/
    
    public static void printSortedArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,2,9};
        bubbleSort(arr);
        printSortedArr(arr);
        
    }

}

