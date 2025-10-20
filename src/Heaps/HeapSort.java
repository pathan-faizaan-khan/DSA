package Heaps;

public class HeapSort {

    public static void Heapify(int[] arr, int idx, int size) {
        int left = 2*idx+1;
        int right = 2*idx+2;
        int minidx = idx;

        if(left < size && arr[left] > arr[minidx]) {
            minidx = left;
        }

        if(right < size && arr[right] > arr[minidx]) {
            minidx = right; 
        }

        if (minidx != idx) {
            int temp = arr[idx];
            arr[idx] = arr[minidx];
            arr[minidx] = temp;

            Heapify(arr, minidx, size);
        }
    }

    public static void Heapsort(int[] arr) {
        int n = arr.length;

        for(int i = n/2; i>=0; i--) {
            Heapify(arr, i, n);
        }

        for(int i= n-1; i>0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            Heapify(arr, 0, i);
        }
    }

    public static void main(String args[]) {
        int[] arr = {3,4,6,2,1};
        Heapsort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
