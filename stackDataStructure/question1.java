import java.util.*;

public class question1 {

    public static void pushAtbottom(int data, Stack<Integer>s){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtbottom(data,s);
        s.push(top);

    }
    public static void main(String arg[]){
        Stack<Integer> s= new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushAtbottom(5,s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
