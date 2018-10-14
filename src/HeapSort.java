import java.util.Arrays;

public class HeapSort {
    private int heapSize;
    //private int[] arr  ;
    public HeapSort(int[] ar) {
        int[]arr = ar;
        heapSize = arr.length;
        buildMaxHeap(arr);
        for(int i = (arr.length)-1;i > 0; i-- ) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapSize--;
            maxHeapify(arr,0);
            //ArrayList<Integer> arrL = new ArrayList<Integer>(Arrays.asList(arr));
        }

        System.out.println(Arrays.toString(arr));

    }

    private void maxHeapify(int[] a, int i) {

        int largest = i;
        int l = left(i);
        int r = right(i);
        if(l < heapSize && a[l] > a[i])
            largest = l;
        if(r < heapSize && a[r] > a[largest])
            largest = r;
        if(largest != i) {
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;
            maxHeapify(a,largest);
        }
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void buildMaxHeap(int[] a) {                       // building max heap from an unordered array by calling maxHeapify on nodes above the leaves
        for(int i = heapSize/2 -1; i >= 0; i--)
            maxHeapify(a,i);
    }

}
