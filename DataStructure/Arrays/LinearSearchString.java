
public class LinearSearchString {



public static String order(String Menu[],String item){
    for(int i=0;i<Menu.length;i++){
        if(Menu[i].equals(item)){
            
            
          return "present";
        }
    }
    return "NotPresent";
}

public static void main(String[] args) {
    String Menu[]={"Samosa","Dosa","Bhel","Chai"};
    String item="VadaPav";
    String od =order(Menu, item);
    if(od.equals("present")){
        System.out.println(item+" is present ");
    }
    else{
        System.out.println(item+"is Not Present");
    }
}



    
}
