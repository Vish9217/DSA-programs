


public class inverted {
    
    public static void py(int row,int col){
        for(int i=1;i<=row;i++){ // Outer loop for rows

            for(int j=1;j<=row-i;j++){   //Inner looop for space
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){   //Inner looop for space
                System.out.print("*");
            }
            System.out.println();

        }
        

    }
    public static void hollow_rectangle(int totRows,int totCols )
    {
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1||i==totRows||j==1||j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
    public static void inverted_half_pyramid_withNumbers(int n){
        for(int i =1;i<=n;i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floydsTriangle(int n){
        int counter=1;

        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter=counter+1;

            }
            System.out.println();
        }
    }
       public static void zero_one_Triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

       }
    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=(2*(n-i));k++){
                System.out.print("   ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int k=1;k<=(2*(n-i));k++){
                System.out.print("   ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
      
        
    }
      public static void solidRhombus(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            for(int k=1; k<=n;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
      }
      public static void hollow_Rhombus(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++){
                if(i==1||i==n||k==1||k==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
      }
      public static void diamand(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
      }
    public static void main(String[] args) {
       // py(3,4);

        //inverted_half_pyramid_withNumbers(6);
        //floydsTriangle(6);
        //zero_one_Triangle(5);
       // butterfly(5);
       //solidRhombus(5);
       //hollow_Rhombus(5);
      // diamand(4);
        
    }
    
}
