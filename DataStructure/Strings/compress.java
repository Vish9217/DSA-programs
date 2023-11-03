//aaaabbbccc---->a4b3c3
//abc------>abc


public class compress {

    public static String Compresed(String str){
        StringBuilder sb =new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){//this while loop is for checking the repetation of the string latters
                count++;//Lets consider the i=0 the str.charAt(0)==str.charAt(1)  as aa so the counter is increased to the 2 
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
        
    }
    public static void main(String[] args) {
      String str="aaabbbcccd";
    System.out.println(  Compresed(str));
        
    }
    
}
