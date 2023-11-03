

public class Palindrome {
    public static boolean isPalindrome(String str){
        for(int i=0;i<(str.length())/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("It is not a Palindrome");
                return false;
            }

        }
        System.out.println("It is a Palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str=new String("madam");
        isPalindrome(str);
    }
    
}
