 public class CountingSort{
    public static void countingSort(int arr[]){
        //for finding the range
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
              Largest=Math.max(Largest, arr[i]);
        }

        //Counting Array
        int count[]=new int[Largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;//The actual number is taked as the index for the counting array
        }
        //sorting 
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
 }