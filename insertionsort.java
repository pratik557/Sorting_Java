import java.util.*;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i, j, n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter the element in an array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 1; i < n; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println("After insertion sort");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }
}