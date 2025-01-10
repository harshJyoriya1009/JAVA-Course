import java.util.*;
public class linkedList {
    public static void main(String arg[]){
        LinkedList<String> list= new LinkedList<>();
        Scanner sc= new Scanner(System.in);
      

        list.addFirst("a");
        list.addFirst("is");
        
        System.out.println(list);

        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);
         
        System.out.print("Enter the elemrnt you have to find:");
        String x= sc.nextLine();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)=="x"){
                System.out.println("Your "+x+" is found at index"+i);
            }
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");

        list.remove(4);
        System.out.println(list);



    }

     
}
