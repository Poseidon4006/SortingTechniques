import java.util.Arrays;

public class SelectionSort {

    public SelectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int minIndex = i;           // select i as the minimum index and check if there is any lesser element
            for (int j = i + 1; j < len; j++) {  // the loop will go for  4 + 3 + 2 + 1 for 5 elements
                // n*(n+1)/2 i.e. O(n2)
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex]; // swap the minimum element to the ith position
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        String arrAsString = Arrays.toString(arr);
        System.out.println(arrAsString);
    }
}
