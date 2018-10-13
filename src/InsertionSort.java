public class InsertionSort {
    //private int[] arr;                  // class variable arr, array to be sorted

    public InsertionSort(int[] a) {
        //arr = a;
        int len = a.length;
        for (int i = 1; i < len; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        for (int item : a) {
            System.out.print(item + " ");
        }
    }
}



