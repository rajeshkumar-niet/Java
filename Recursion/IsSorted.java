import java.util.Scanner;

public class IsSorted {
    public static boolean check(int arr[], int idx) {
        if (idx == (arr.length - 1)) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return check(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nis array sorted : "+check(arr, 0));
        sc.close();
    }
}
