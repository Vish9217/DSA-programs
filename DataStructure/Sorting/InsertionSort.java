

class InsertionSort{
    public static void InSort(int arr[]){
        System.out.print("The Array before sorting:");
        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]);
        }
        System.out.println();

        for(int i =1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.print("The Array After sorting:");
        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]);
        }
    }




    public static void main(String[] args) {
        int arr[]={7,3,1,5,3};

        InSort(arr);
        
    }
}