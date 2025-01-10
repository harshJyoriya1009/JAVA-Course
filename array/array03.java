import java.util.*;

class array03 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter your number of columns:");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols]; 

        // INPUT
        // Rows
        System.out.print("Enter your matrix value:\n");
        for (int i = 0; i < rows; i++) {
            // Columns
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // OUTPUT
        System.out.print("Here is your matrix:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}


