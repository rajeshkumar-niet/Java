import java.util.Scanner;

public class Palindromic_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            // Printing left side white spaces 
            for (int j = 0 ; j<row-i; j++) {
                System.out.print("  ");   
            }
            //Printing numbers of left side
            for (int j = i; j >= 0; j--) {
                System.out.print(j+1+" ");
            }
            //Printing right side numbers
            for (int j = 2; j < i+2; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
