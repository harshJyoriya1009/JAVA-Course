import java.util.*;
public class byAL {

    static class Stack{
       static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        public static void push(int data){
            list.add(data);
            }

            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top= list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
            }
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return list.get(list.size()-1);

            }
        }
    

    public static void main(String arg[]){
        Stack s= new Stack();
        s.push(3);
        s.push(7);
        s.push(8);
        s.push(9);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

       

    }
    
}
