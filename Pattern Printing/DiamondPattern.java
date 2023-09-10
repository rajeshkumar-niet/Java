import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter twice of rows : ");
        int row = sc.nextInt();
        // Printing upper half
        for (int i = 1; i < row+1; i++) {
            // Print spaces
            for (int j = 1; j < row - i+1; j++) {
                System.out.print("  ");
            }
            // Print star of Upper Half
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Printing Lower half
        for (int i = row; i > 0; i--) {
            // Print spaces
            for (int j = 1; j < row - i+1; j++) {
                System.out.print("  ");
            }
            // Print star of Lower Half
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
