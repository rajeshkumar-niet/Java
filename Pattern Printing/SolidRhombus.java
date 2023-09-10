import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        for(int i = 0 ; i<row;i++){
            // Print spaces 
            for(int j = 0; j <row-i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}