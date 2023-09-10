import java.util.Scanner;

public class NumverTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                if (i >= j) {
                    System.out.print(j+1);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
