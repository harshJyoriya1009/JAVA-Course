import java.util.*;
public class question{
    public static void main(String arg[]){
        LinkedList<Integer> list= new LinkedList<>();

        list.add(1);
        list.add(3);
        list.add(2);
        list.add(1);
        
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        
        

    }
}