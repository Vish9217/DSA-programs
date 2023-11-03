public class compareToMethod {
    public static void main(String args[]){
    String fruits[]={"apple","mango","banana"};
    String largest=fruits[0];
    //Lexigraphically Largest string
    //if the two strings are  aabc and aabf
    //the aabf is Lexigraphically Largest due to f 
    for(int i=0;i<fruits.length;i++){
        if((largest.compareTo(fruits[i]))<0){//Negative
              largest=fruits[i];

        }
        
    }
    System.out.println(largest);
    
}
}
//Time complexity---> O(x*N)   x=length of longest string & N=no. of strings
