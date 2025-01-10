import java.util.*;

class array04{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);

         System.out.print("Enter your rows:");
        int rows= sc.nextInt();

        System.out.print("Enter your column:");
        int cols=sc.nextInt();

        int matrix1[][]=new int[rows][cols];
        int matrix2[][]=new int[rows][cols];

        //Input
         System.out.print("Enter your matrix 1  element:\n");
        for(int i=0 ; i<rows ; i++){
            for(int j=0; j<cols; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

         System.out.print("Enter your matrix 2  element:\n");
        for(int i=0 ; i<rows ; i++){
            for(int j=0; j<cols; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

        
             
           
           for(int i=0 ; i<rows ; i++){
            for(int j=0; j<cols; j++){
                  System.out.println(matrix1[i][j]+matrix2[i][j]);
               

            }}


      
       
    }
}