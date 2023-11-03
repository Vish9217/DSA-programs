

public class SearchInSortedMatrix {
    public static boolean staircaseSearch(int matrix[][],int key){
        int row =0;
        int col=matrix[0].length-1;
        while(row<=matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("The "+key+" is found at matrix["+row+"]["+col+"]");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;//moving to left of the current cell
            }
            else{
                row++;//Movinng to the bottom of the cell
            }
           
        }
         System.out.println("The key is not present in this matrix");
        return false;
       
    }
    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        staircaseSearch(matrix, 40);
        
    }
    
}
