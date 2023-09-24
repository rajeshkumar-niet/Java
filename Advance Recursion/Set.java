import java.util.ArrayList;
import java.util.Scanner;

public class Set {
    public static void printSubsets(ArrayList<Integer> set, ArrayList<Integer> subset, int index) {
        if (index == set.size()) {
            // Print the current subset
            for (Integer num : subset) {
                System.out.print(num + "\t");
            }
            System.out.println();
            return;
        }

        // Include the current element in the subset
        subset.add(set.get(index));

        // Recursively generate subsets with the current element
        printSubsets(set, subset, index + 1);

        // Exclude the current element and backtrack
        subset.remove(subset.size() - 1);

        // Move to the next element in the set
        printSubsets(set, subset, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements in set: ");
        int n = sc.nextInt();

        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            int element = sc.nextInt();
            set.add(element);
        }

        ArrayList<Integer> subset = new ArrayList<>();
        printSubsets(set, subset, 0);

        sc.close();
    }
}
