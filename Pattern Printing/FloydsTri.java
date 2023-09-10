import java.util.Scanner;

public class FloydsTri {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        int s = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(s+"  ");
                s++;
            }
            System.out.println();
        }
        sc.close();
    }
}
