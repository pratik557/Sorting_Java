import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i, n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter the element in an array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After bubble sorting");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}