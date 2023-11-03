

public class LinearSearch {


  public static int LS(int marks[],int key){

    for(int i=0;i<marks.length;i++){
        if(marks[i]==key){
          return i;
        }
      
    }
    return -1;
  }
    public static void main(String[] args) {
        int marks[]={2,3,4,5,6,7,8};
        int key=90;
        int index=LS(marks, key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println(key+"Is found At index"+index);
        }


       
    }
    
}
