import java.lang.reflect.Array;
import java.util.*;

public class JavaArrays {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int LinearSearch(int arr[], int key) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == key) {
                return 1;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getLowest(int numbers[]) {
        int min = Integer.MAX_VALUE;
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            System.out.println(min);
        }
        return min;
    }

    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;

    }

    public static void reversArray(int arr[]) {
        int F = 0, L = arr.length - 1;
        while (F < L) {
            int temp = arr[F];
            arr[F] = arr[L];
            arr[L] = temp;
            F++;
            L--;
        }
    }

    public static void pairArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("[" + arr[i] + "," + arr[j] + "]");
            }
        }
    }

    public static void SubArray(int arr[]) {
        int minSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[start];
                }
                if (minSum < sum) {
                    minSum = sum;
                }
            }
        }
        System.out.println(minSum);
    }

    public static void PrefixSubarray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {

            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    // public static void kadaneSubArray(int arr[]) {
    // int ms = Integer.MIN_VALUE;
    // int mins = Integer.MIN_VALUE;
    // int cs = 0;
    // for (int i=0;i<arr.length; i++) {
    // cs += arr[i];

    // if (cs<0 ) {
    // mins = Math.max(cs, mins);
    // cs = 0;
    // }
    // ms = Math.max(cs, ms);

    // }

    // System.out.println("Max among all the subArray is " + ms);
    // System.out.println("Minimum Among Sub array is " + mins);
    // }

    public static void Trainwater(int arr[]) {
        int[] LeftArr = new int[arr.length];
        int[] RightArr = new int[arr.length];
        int n= arr.length;

        for (int i = 1; i < arr.length; i++) {
            LeftArr[0] = arr[0];

            LeftArr[i] = Math.max(arr[i], LeftArr[i - 1]);
        }
        RightArr[n-1] = arr[n-1];
        for (int i=n-2;i>=0; i--) {
            RightArr[i] = Math.max(arr[i], RightArr[i+1]);
        }

        int TWater=0;

        for (int i=0;i<n; i++) {
            int waterLevel = Math.min(LeftArr[i], RightArr[i]);
            TWater += waterLevel - arr[i];  
        }
        System.out.println(TWater);
    }
    
    public static void stocks(int arr[]) {
        int n= arr.length;
        int buyP = Integer.MAX_VALUE;
        int maxp = 0;
        for (int i=0; i<n; i++) {
            if (buyP < arr[i]) {
                int profit = arr[i] - buyP;
                maxp = Math.max(profit , maxp);
            }
            else {
                buyP = arr[i];
            }
        }
        System.out.println(maxp);
                    
    }


    public static void main(String args[]) {
        // int marks[] = { 96, 92, 98 };
        // update(marks);

        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }

        // Linear Search
        // int arr[] = {12,56,45,23,8};
        // int result = LinearSearch(arr, 8);
        // if(result==1) {
        // System.out.println("Key element found");
        // }
        // else {
        // System.out.println("Key Element Not found");
        // }

        // int numbers[] = {4,5,2,8,5};
        // System.out.println(getLargest(numbers));

        // Binary Search

        // int arr[] = {5,3,7,35,7};
        // System.out.println(binarySearch(arr, 7));

        // int arr[] = {4,9,2,5,1};
        // reversArray(arr);
        // for (int i=0; i<arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // Pairs in Array

        // int arr[] = {2,4,6,8,10};
        // pairArr(arr);

        // int arr[] = new int[20];

        // Sub array

        // int arr[] = {-6,-1,-42};
        // kadaneSubArray(arr);

        // Trapping Rain water

        // int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        // Trainwater(arr);

        // Buy & Sell Stocks

        // int arr[] = {7,1,5,3,6,4};
        // stocks(arr);

        // Counting Sort

        int arr[] = {1,4,1,3,2,4,3,7};
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++) {
            while(count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
