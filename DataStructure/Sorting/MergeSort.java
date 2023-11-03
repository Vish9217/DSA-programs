public class MergeSort {
    public static void conquer(int arr[],int si,int mid,int ei){
        //Firstly creating the new Merged Array of size (ei-si+1)
        int merged[]=new int[ei-si+1];
        int ind1=si;//Tracking the starting index of 1st array 
        int ind2=mid+1;//Tracking the starting index of 2nd array 
        int x=0;//Tracking the index of Merged
        while(ind1<=mid && ind2<=ei){
            if(arr[ind1]<=arr[ind2]){
                merged[x++]=arr[ind1++];//Instead of x++; and ind1++
                /*
                 *   | 2 | 6 | 9 |               | 3 | 5 | 8 |
                 *     |       |                   |       |
                 *  ind1=si   mid             ind2=mid+1  ei
                 * 
                 *        as 2<3  i.e. ind1<ind2
                 *        Add 2 in merged array by merged[x]=arr[ind1]
                 *        ind1++
                 * 
                 * 
                 * Merged Array Become 
                 *         |2| | | | | |
                 * the we compair 3 with 6 as 3<6
                 *         |2|3| | | | |
                 */
                
            }
            else{
                merged[x++]=arr[ind2++];
            }
            //If reamainning some element in any array then we have to write them as it is
            while(ind1<=mid){
                //Remaning elements in 1st array
                merged[x++]=arr[ind1++];

            }
            while(ind2<=ei){
                //Remaning elements in 2nd array
                 merged[x++]=arr[ind2++];
            }

            //Now we have to copy elemnts in original array
            for(int i=0,j=si; i<merged.length;i++,j++){
                arr[j]=merged[i];            }

        }

    }
    public static void divide(int arr[],int si,int ei){
        //Finding mid for dividing
        int mid=si+(ei-si)/2;//We not going to use (si+ei)/2 because in case if both start index and end index are too much big then we may get the space problem
        divide(arr, si, mid);//Recursively dividing the array before the mid
        divide(arr, mid+1, ei);//Recursively dividing the array after the  mid
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[]={6,3};
        //Size of array
        int n= arr.length;
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
