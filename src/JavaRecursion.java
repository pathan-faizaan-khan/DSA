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

        System.out.println(friendsPairing(3));
    }

}
