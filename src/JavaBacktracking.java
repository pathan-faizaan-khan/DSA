public class JavaBacktracking {

    public static void changeArr(int arr[], int i, int val) {
        //Base case
        if(i==arr.length) {
            printArr(arr);
            return;
        }

        // Recursion

        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Finding Subsets

    public static void findSubset(String str, StringBuilder ans, int i) {
        //Base case

        if(i==str.length()) {
            if(ans.length()==0) {
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        // Recursion
        ans.append(str.charAt(i));
        findSubset(str, ans, i+1);
        
        ans.deleteCharAt(ans.length()-1);
        findSubset(str, ans, i+1);
        
    }
    public static void main(String args[]) {
        // int arr[] = {1,2,3,4,5};
        // changeArr(arr, 0, 1);
        // printArr(arr);

        findSubset("abc", new StringBuilder(""), 0);

    }
}
