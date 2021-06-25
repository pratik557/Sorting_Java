import java.util.*;

public class mergesort {

    void merge(int arr[], int beg, int mid, int end) {
        int l = mid - beg + 1;
        int r = end - mid;

        int leftarray[] = new int[l];
        int rightarray[] = new int[r];

        // store the value of beg to mid
        for (int i = 0; i < l; i++) {
            leftarray[i] = arr[beg + i];
        }

        // store the value of mid+1 to end.
        for (int j = 0; j < r; j++) {
            rightarray[j] = arr[mid + 1 + j];
        }

        // storing the both sorted array value in a new array
        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (leftarray[i] <= rightarray[j]) {
                arr[k] = leftarray[i];
                i++;
            } else {
                arr[k] = rightarray[j];
                j++;
            }
            k++;
        }

        // add the remaining value which is left as following condition.
        // l=mid+1
        while (i < l) {
            arr[k] = leftarray[i];
            i++;
            k++;
        }
        while (j < r) {
            arr[k] = leftarray[j];
            i++;
            j++;
        }

    }

    void recursivesort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            recursivesort(arr, beg, mid);
            recursivesort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[500];
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter the element in an array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergesort obj = new mergesort();
        obj.recursivesort(arr, 0, n - 1);

        System.out.println("after merge sort");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
