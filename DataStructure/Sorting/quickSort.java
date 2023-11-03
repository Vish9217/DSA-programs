public class quickSort {
    /*********************************************************** Step3 ************************************************************************* */
     public static int partition(int arr[],int low,int high ){
        int pivot=arr[high];//finding array's pivot element (In this case the last element)
        int i = low-1;//track how many elements come before the pivot element And  firstly (i=low-1) means that we assume that  thair is no any element less than pivot
        /*********************************************************** Step4 ************************************************************************* */
        for(int j=low;j<high;j++){//for travalsing array
           if( arr[j]<pivot){//arr[j] is the smaller element than pivot
            i++;//Because we get one more space to for smaller element
            //Swap  <------ between the element wich is priviously present on that  space and the smaller element which we get
            int temp=arr[i];
            arr[i]=arr[j];//placing that small element at empty i.e. at i index
            arr[j]=temp;

           } //Now we done with placing all small elements before the pivot
        } 
        /*********************************************************** Step5 ************************************************************************* */
        //Now we have to place the pivot at its write position
        i++;//to make space for pivot
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i; //Returns the write position of the pivot i.e.  pivotIndex
    }

    public static void QuickSort(int arr[],int low ,int high){
        /*********************************************************** Step1 ************************************************************************* */
        if(low<high){//Quick sort is only implemented in case of low <high

            /*********************************************************** Step2 ************************************************************************* */
            int pivotIndex = partition(arr,low,high);/*This partition function work as finding last element as a pivot element 
                                                  and arranging the small elements before the pivot 
                                                  and bigger then pivot after the pivot
                                               */
            /*********************************************************** Step6 ************************************************************************* */
              QuickSort(arr, low, pivotIndex-1); //to sort the array which is before the pivot element --->Starting from low to one index before the pivotIndex (i.e. pivotIndex-1)
              QuickSort(arr, pivotIndex+1, high); //to sort the array which is after the pivot element --->Starting from one index after the pivotIndex (i.e. pivotIndex+1) to high
        }

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        System.out.print("The Array Before Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int n=arr.length;
        QuickSort(arr, 0, n-1);//as n is the size of the array so high should be at size-1 index (i.e. Last index of the array)
        System.out.print("The Array After Sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
    
}

// Time complexities of Quick Sort
// 1) Worst Case-O(n^2) <---The case in which in every time pivot is either the smallest element or  Largest element --->Already sorted array 23456789
// 2) Avg -O(nlogn)
