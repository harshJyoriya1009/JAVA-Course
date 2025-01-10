//SEARCHING..
import java.util.*;

class array02 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];

        // INPUT
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the number you have to find:");
        int x = sc.nextInt();

        // OUTPUT
        for (int i = 0; i < size; i++) {
            if (number[i] == x) {
                System.out.println("Number x is found at index:" + i);
            }
        }

    }
}