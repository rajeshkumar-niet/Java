import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        //            Printing first half of the butterfly
        for (int i = 0; i < row; i++) {
            //            First Half's Left Side
            for (int j = 0; j < row; j++) {
                if (j<=i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //                First Half's Right side
            for (int j = 0; j < row; j++) {
                if ((i+j)>=row-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //        Second Half Of The Buttefly
        //        For second half we need to reverse the order of rows and columns
        //        So, We will use nested loops here
        for (int i = 0; i < row; i++) {
            //            First Second's Left Side
            for (int j = 0; j < row; j++) {
                if ((i+j)>=row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            //                    First Second's right side
            for (int j = 0; j < row; j++) {
                if (j>=i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
