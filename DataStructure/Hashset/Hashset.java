import java.util.HashSet;


public class Hashset {
    
    public static void main(String[] args) {
        //Creating the hashset
        HashSet<Integer> set=new HashSet<>();
        set.add(9);
        set.add(7);
        set.add(5);

        //search 
        if(set.contains(7)){
            System.out.println("Yes");
        }

        //Removing
        set.remove(5);
        if(set.contains(5)){
            System.out.println("Not Removed");
        }
        else{
            System.out.println("Removed");
        }
        //size-Total no of elements
        int x=set.size();
        System.out.println(x);
        //Printing all elements of the set
        System.out.println(set);


        //Working of Iterator in Hashset
        /* Import java.util.Iterator
         * 
         * Iterator it=set.iterator(); <---set has iterator method which returns the iterator to the set
           it is the iterator returned by the set and which is of type Iterator
         */

        
    }
}
