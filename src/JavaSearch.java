public class JavaSearch {
    // Linear Search for Strings
    public static String LinearSearchStr(String str[], String key) {
        for (int i =0; i<str.length; i++) {
            if (str[i].equals(key)) {
                return str[i];
            }
        }
        return "Not Found";
    }

    // Binary Search 

    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid]==key) {
                return mid;
            }
            else if(arr[mid] < key) {
                System.out.println(arr[mid]);

                start = mid + 1; // Right
            }
            else {
                end = mid -1; // Left
            }
        }
        return -1;
    }
     public static void main(String args[]) {
        // Linear search
        
        int arr1[] = {3,6,2,8,0,10,46};
        int key0 = 0;
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] == key0) {
                System.out.println("Element found at index: "+i+ "\sand value is: "+arr[i]);
            } 
        }

        // Linear Search for Strings

        String str[] = {"Hello", "World", "Java", "Python", "C++"};

        String key = "Java";
        System.out.println(LinearSearchStr(str, key));

        // Binary search

        int arr[] = {3,6,9,10,19,46};

        int key2 = 3;

        System.out.println(BinarySearch(arr, key2));
    
        



        
    }
}
