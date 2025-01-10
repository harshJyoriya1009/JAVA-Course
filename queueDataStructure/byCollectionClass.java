import java.util.*;
public class byCollectionClass {
    public static void main(String arg[]){
    Queue<Integer> list= new LinkedList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    while(!list.isEmpty()){
        System.out.println(list.peek());
        list.remove();
    }
}

    
}
