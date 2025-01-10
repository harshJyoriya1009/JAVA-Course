import java.util.*;
public class trial {

    static class Queue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void push(int data){
            while(!s1.isEmpty()){
                 s2.push(s1.pop());

            }
            s1.push(data);

            while(!s2.isEmpty()){
                 s1.push(s2.pop());
            }
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();

        }
    }
    public static void main(String arg[]){

        Queue list= new Queue();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }

    }
    
}
