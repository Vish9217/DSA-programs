
import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        int arr[]={7,8,4,6,2,1};
        System.out.println("The Array Before sorting :");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
       // Arrays.sort(arr,0,3);---->478621
       // Arrays.sort(arr);------>124678
       Integer arr1[]={7,8,4,6,2,1};
        Arrays.sort(arr1,Collection.rever);
        System.out.println("The Array After sorting :");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
    }
    
    
}
