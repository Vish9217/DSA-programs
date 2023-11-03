public class stringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");//Making the empty string of StringBuilder Type
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);//Appending to sb
        }
        System.out.println(sb);
    }
    
}
