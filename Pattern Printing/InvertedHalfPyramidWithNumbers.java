import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < row + 2 - i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
        sc.close();
    }
}
