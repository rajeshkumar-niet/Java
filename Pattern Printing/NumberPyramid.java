import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        for(int i = 0 ; i<row+1;i++){
            // Print spaces 
            for(int j = 0; j <row-i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
