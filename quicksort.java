import java.util.*;

public class quicksort {
    int partition(int arr[], int first, int last) {
        int pivot, start, end;
        pivot = arr[first];
        start = first;
        end = last;
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp1 = arr[first];
        arr[first] = arr[end];
        arr[end] = temp1;
        return end;
    }

    void recursivelysort(int arr[], int first, int last) {
        if (first < last) {
            int loc = partition(arr, first, last);
            recursivelysort(arr, first, loc - 1);
            recursivelysort(arr, loc + 1, last);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter the element in an array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort obj = new quicksort();
        obj.recursivelysort(arr, 0, n - 1);

        System.out.println("After Quick sort");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
