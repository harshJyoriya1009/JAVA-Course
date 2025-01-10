import java.util.*;
class trial{
    public static void msain(String arg[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter how many rows you need:");
        int x= sc.nextInt();

        System.out.print("Enter how many cols you need:");
        int y= sc.nextInt();


        System.out.print("Enter your element");
        int matrix[][]=new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                System.out.println(matrix[i][j]+" ");
            }System.out.println();
        }

        



    }
}