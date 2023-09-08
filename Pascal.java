import java.util.Scanner;
public class Pascal {
    public static void printPascal(int numRows ){
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            // Print spaces to center-align the triangle
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                // Print the number and format it
                System.out.printf("%6d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Code written by Rajesh Kumar to print Pascal Triangle ");
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        printPascal(n);
        sc.close();
    }
}