import java.util.*;

class array01{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        
        int number[]=new int [size];


        for(int i=0; i<size ; i++){
            number[i]=sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }

    }
}