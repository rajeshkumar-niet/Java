import java.util.*;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of array : ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Enter element : ");
            int t = sc.nextInt();
            arr[i] = t;
        }
        int m = 0;
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + "  ");
            if (arr[i] > m) {
                m = arr[i];
            }
            System.out.println(" ");
        }
        System.out.println("Greatest element is " + m);
        sc.close();
    }
}