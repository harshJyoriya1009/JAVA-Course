import java.util.*;
public class string5 {

    public static void main(String arg[]){

        StringBuilder sb= new StringBuilder("Harsh");
        System.out.println(sb);
        //O/p--Harsh..

        //char at index 0
        System.out.println(sb.charAt(3));
        // o/p--s..

    
         // set char at index 0
         sb.setCharAt( 0 , 'Y' );
         System.out.println(sb);
         // o/p--Yarsh..


         //Insert any character
         sb.insert( 0 , 'B' );
         System.out.println(sb);
         // o/p--BYarsh..


         //Delete the extra 'B'
         sb.delete(0,1);
         System.out.println(sb);
         //o/p-- Yarsh




    }
    
}
