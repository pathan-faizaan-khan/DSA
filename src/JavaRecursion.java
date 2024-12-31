public class JavaRecursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    public static int nFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * nFactorial(n - 1);
        }

    }

    public static int calSum(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n + calSum(n - 1);
        }

    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        } else if (arr[i] > arr[i + 1]) {
            return false;
        } else {
            return isSorted(arr, i + 1);
        }
    }

    public static int checkkey(int arr[],int key, int i) {
        if (i==arr.length) {
            return -1;
        }
        else if(arr[i]==key) {
            return i;
        } else {
            return checkkey(arr, key, i+1);
        }
        
    }
    public static int lastoccur(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastoccur(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n==0) {
            return 1;
        }
        int y = power(x, n-1);
        int pow = x * y;
        return pow;
    }

    public static int powlogn(int x, int n) {
        if (n==0) {
            return 1;
        }
        int halfpow = powlogn(x, n/2);
        int halfpower =  halfpow * halfpow;
        if (n %2 !=0) {
            halfpower = n * halfpower;
        }
        return halfpower;
    }

    public static int tilingproblem(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        return tilingproblem(n-1) + tilingproblem(n-2);
    }

    public static String dubRecursion(String str, int n , boolean arr[], StringBuilder str2) {
        // Base case
        if (n==str.length()) {
            return str2.toString();
        }
        char currentchar = str.charAt(n);
        if (arr[currentchar- 'a']) {
            return dubRecursion(str, n+1, arr, str2);
        } else {
            arr[currentchar-'a'] = true;
            return dubRecursion(str, n+1, arr, str2.append(currentchar));
        }

    }
    public static int friendsPairing(int n) {
        // Base case
        if (n==1 || n==2) {
            return n;
        }
        // choice 
        // single
        int fnm1 = friendsPairing(n-1);
        
        // pair
        int fnm2 = friendsPairing(n-2);
        int pairways = (n-1) * fnm2;
        int totalways  = fnm1 + pairways;

        return totalways;
    }

    public static void binarystring(int n, int lastchar, String str) {
        if (n==0) {
            System.out.println(str);
            return;
        }
        binarystring(n-1, 0, str.concat("0"));

        if (lastchar == 0) {
            binarystring(n-1, 1, str.concat("1"));
        }
    }
    // Merge sort

    public static void mergesort(int arr[], int si, int ei) {
        if (si>=ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);


        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid+1;
        int k =0;
        int temp[] = new int[ei-si+1];

        while (i<=mid && j<=ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
            
        }

        while (i<=mid) {
            temp[k++] = arr[i++];
            
        }
        while (j<=ei) {
            temp[k++] = arr[j++];
            
        }

        for (int l=0 , m=si; l<temp.length; l++, m++) {
            arr[m] = temp[l];
        }
    }


    // Quick Sort

    public static void quickSort(int arr[], int si, int ei) {

        // Base case
        if (si>=ei) {
            return;
        }

        int pindx = partition(arr, si, ei);
        quickSort(arr, si, pindx-1); // Left
        quickSort(arr, pindx+1, ei); // Right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++) {
            if(arr[j]<=pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static int search(int arr[], int trg, int si, int ei) {
        // Base case

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei-si)/2;
        // Best case
        if (arr[mid] == trg) {
            return mid;
        }

        // targert on Line 1

        if (arr[si]<=arr[mid]) {
            // case a:
            if (arr[si]<=trg && trg<=arr[mid]) {

                return search(arr, trg, si, mid-1);
            }
            else {
                // case b:
               return  search(arr, trg, mid+1, ei);
            }
        } else {
            if (arr[mid]<=trg && trg<=arr[ei]) {
                return search(arr, trg, mid+1, ei);
            }

            else {
                return search(arr, trg, si, mid-1);
            }
        }
    }



    public static void main(String args[]) {
        // printDec(10);    
        // System.out.println(nFactorial(5));

        // System.out.println(calSum(5));

        // System.out.println(fibonacci(46));

        // Sorted Array

        // int sortedArray[] = { 1, 2, 3, 4, 5 };
        // System.out.println(isSorted(sortedArray, 0));

        // implementing Linear Search in Recursion

        // int arr[] = {3,8,1,10,12};
        // int answer  = checkkey(arr, 10, 0);
        // System.out.println(answer);


        // int arr[]= {5,2,6,4,5,9};
        // System.out.println(lastoccur(arr, 5, 0));


        // Power function using recursion

        // System.out.println(powlogn(2, 10));

        
        // Tiling Problem 

        // System.out.println(tilingproblem(4));

        // Removing Dublicate using recursion
        // System.out.println(dubRecursion("faizaankhan", 0, new boolean[26],new StringBuilder("")));

        // Friennd Pairing

        // System.out.println(friendsPairing(3));

        // binarystring(5,   0, "");


        // Merge Sort

        int arr[] = {4,5,6,7,0,1,2,3};

        // mergesort(arr, 0, arr.length-1);

        // quickSort(arr, 0, arr.length-1);

        // for (int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }


        // searching in rotated sorted array

        int idx = search(arr, 6, 0, arr.length-1);

        System.out.println(idx);
    }

}
