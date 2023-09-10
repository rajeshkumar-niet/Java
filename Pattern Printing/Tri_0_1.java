import java.util.Scanner;

public class Tri_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < i+1 ; j++) {
                if((i+j)%2!=0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
