import java.util.Scanner;

public class HalfUpperTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        for (int i = row; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
