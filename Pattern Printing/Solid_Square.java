import java.util.Scanner;
class Pattern{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int col = sc.nextInt();
        for(int i = 0 ; i<row;i++){
            for(int j =0 ; j< col ; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        sc.close();
    }
}