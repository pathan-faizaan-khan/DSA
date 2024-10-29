// Sorting Technique

public class JavaSort {
    
    public static void BubbleSort(int arr[]) {
        for ( int i =0; i<arr.length-1; i++) {
            for (int j = 0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }

    public static void main(String args[]) {
        // Bubble Sort
        int arr[] = {5,1,4,9,10,0};
        BubbleSort(arr);
        for ( int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
  