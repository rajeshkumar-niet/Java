// Place tile of 1Xm in the area of nXm

import java.util.Scanner;

public class TilesPlace {
    public static int conutTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int hori = conutTiles(n - 1, m);
        int verti = conutTiles(n - m, m);
        return hori + verti;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of square : ");
        int n = sc.nextInt();
        System.out.print("Enter length of tile : ");
        int m = sc.nextInt();
        int result = conutTiles(n, m);
        System.out.println("Total number of ways in which tiles can be placed is " + result);
        sc.close();
    }

}