// Sorting Technique

public class JavaSort {

    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // Swaping

            int temp = 0;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insertion

            arr[prev + 1] = curr;

        }

    }

    public static void countSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i =0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Creating frequency array

        int count[] = new int[largest+1];

        for (int i = 0; i< arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j =0;
        for (int i=0; i<count.length; i++) {
            while(count[i]> 0) {
                arr[j] = i;
                j++;
                count[i]--;
            
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

        // Selection sort

        int arrslcsionsrt[] = {8, 4, 1, 0, 18, 21};

        selectionSort(arrslcsionsrt);

        for ( int i =0; i<arrslcsionsrt.length; i++) {
        System.out.print(arrslcsionsrt[i]+ " ");
        }

        // Insertion Sort

        int arr1[] = { 5, 1, 2, 9, 10, 3 };
        insertionSort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Counting Sort

        int counsort[] = {1,4,1,3,2,4,3,7};
        
        countSort(counsort);

        for (int i=0; i<counsort.length; i++) {
            System.out.print(counsort[i] + " ");
        }

    }

}
