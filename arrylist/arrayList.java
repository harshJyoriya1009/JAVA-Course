import java.util.*;
public class arrayList {

    public static void main(String arg[]){
         ArrayList<Integer> list =new ArrayList<Integer>();

        //add elements..
         list.add(0);
         list.add(1);
         list.add(5);
         System.err.println(list);
         // o/p ==>[0, 1, 5]

//      -------------------------------------------------------------------------------------------------------------------
       //get elements..
       int elements= list.get(2);
       System.out.println(elements);
       // o/p ==> 5
 
//      ------------------------------------------------------------------------------------------------------------------
       //add element int he middle of the list..
       list.add(2,9);
       System.out.println(list);
       // o/p ==> [0, 1, 9, 5]

//      ------------------------------------------------------------------------------------------------------------------       
       //set element..
       list.set(2,10);
       System.out.println(list);
       // o/p ==> [0, 1, 10, 5]

//      ------------------------------------------------------------------------------------------------------------------       
       //delete element..
       list.remove(3);
       System.out.println(list);
       // o/p ==> [0, 1, 10]
   
//      ------------------------------------------------------------------------------------------------------------------      
       //size of the list..
       int size=list.size();
       System.out.println(size);
       // o/p ==> 3

//      -------------------------------------------------------------------------------------------------------------------       
       //loops
       for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i));
       }System.out.println();
       // o/p ==> 0110

//      -------------------------------------------------------------------------------------------------------------------  
       //sorting..
       Collections.sort(list);
       System.out.println(list);
       // o/p ==> [0, 1, 10]

}
}      