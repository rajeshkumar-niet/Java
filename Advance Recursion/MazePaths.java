import java.util.Scanner;

public class MazePaths {
    public static int findPath(int i, int j, int n, int m){
        if (i==n || j==m) {
            return 0;
        }
        if (i==n-1 && j ==m-1) {
            return 1;
        }
        int down =  findPath(i+1, j, n, m);
        int right = findPath(i, j+1, n, m);
        return down+right;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        int path = findPath(0, 0, n, m);
        System.out.println("Total number of paths are : "+path);
        sc.close();
        
    }
}
