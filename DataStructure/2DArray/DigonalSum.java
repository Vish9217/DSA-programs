

public class DigonalSum {
    public static void digonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<=matrix.length-1;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
    }

public static void main(String[] args) {
    int matrix[][]={
        {1,2,3,4},
        {1,2,3,4},
        {1,2,3,4}, 
        {1,2,3,4}   };
    digonalSum(matrix);
    
}
    
}
