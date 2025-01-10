import java.util.*;



public class trial{

    public static void pushAtBottom(int data, Stack<Integer>list){
        if(list.isEmpty()){
            list.push(data);
            return;
        }

        int top= list.pop();
        pushAtBottom(data, list);
        list.push(top);
    }

    public static void reverse(Stack<Integer>list){
        if(list.isEmpty()){
            return;

        }

        int top=list.pop();
        reverse(list);
        pushAtBottom(top, list);

    }
    public static void main(String arg[]){
      Stack<Integer>list= new Stack<>();

      list.push(3);
      list.push(4);
      list.push(5);
      list.push(6);
      list.push(7);
      reverse(list);

      while(!list.isEmpty()){
        System.out.println(list.peek());
        list.pop();
      }


    }
}