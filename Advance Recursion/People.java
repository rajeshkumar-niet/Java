//     Find the number of ways in which you can invite n people in your party 

import java.util.Scanner;

public class People {
    public static int invite(int n) {
        if (n <= 1) {
            return 1;
        }
        int singleway = invite(n - 1);
        int pairway = invite(n - 2) * (n - 1);
        return singleway + pairway;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people : ");
        int n = sc.nextInt();
        int result = invite(n);
        System.out.println("Total number of ways are : "+result);
        sc.close();
    }

}
