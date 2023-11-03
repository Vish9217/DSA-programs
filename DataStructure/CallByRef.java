public class CallByRef {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
         
        System.out.println("First Value(a)-"+x);
        System.out.println("Second Value(b)-"+y);
    }

    public static void main(String[] args) {
        int marks[]={97,98,77,66};
        for(int i=0;i<marks.length;i++){
            System.out.print("Original Value-"+marks[i]+"  | ");
        }
        System.out.println();
        update(marks);//This will update the Orinal Value By Call By Reference
        for(int i=0;i<marks.length;i++){
            System.out.print("Updated  Value-"+marks[i]+"  | ");
        }
        System.out.println();
        System.out.println("******************************************");
        int a=10;
        int b=5;
        swap(a, b);//It makes the copy of actul value not uses as it is so actul value does not affected by the changes made by any function
        System.out.println("First Value(a)-"+a);
        System.out.println("Second Value(b)-"+b);




    }
    
}
