import java.util.Scanner;

public class Java2dArrays {
    public static boolean key2dArray(int m, int n, int key) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] == key) {
                    System.out.println("The Key Element sound at cell ( " + i + " " + j + " )");
                    return true;
                }
            }
            System.out.println();
        }
        System.out.println("Key element Not found");
        return false;
    }

    public static void spiralMatrix(int arr[][]) {
        // My code

        // for(int i=0; i<arr.length; i++) {
        // System.out.print(arr[0][i] + " ");
        // }
        // for(int i=1; i<arr[0].length-1; i++) {
        // System.out.print(arr[i][arr[0].length-1] + " ");
        // }
        // for(int i=arr.length-1; i>=0; i--) {
        // System.out.print(arr[arr.length-1][i] + " ");
        // }
        // for(int i=arr[0].length-2; i>0; i--) {
        // System.out.print(arr[i][0] + " ");
        // }
        // // Inner layer

        // for(int i=1; i<arr.length-1; i++) {
        // System.out.print(arr[1][i] + " ");
        // }
        // for(int i=2; i<arr[0].length-1; i++) {
        // System.out.print(arr[i][arr[0].length-2] + " ");
        // }
        // for(int i=arr.length-2; i>2; i--) {
        // System.out.print(arr[arr.length-2][i] + " ");
        // }
        // for(int i=arr[0].length-3; i>=1; i--) {
        // System.out.print(arr[arr.length-2][i] + " ");
        // }
        int m = arr[0].length;
        int n = arr.length;
        int sRow = 0;
        int endRow = m - 1;
        int sCol = 0;
        int endCol = n - 1;
        while (sRow <= endRow && sCol <= endCol) {
            // Top
            for (int i = sCol; i < endCol; i++) {
                System.out.print(arr[sRow][i] + " ");

            }
            // Right
            for (int i = sRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // Bottom
            for(int i=endCol-1; i>=sCol;i--) {
                if(sRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][i] + " ");
            }
            // Left 
            for(int i=endRow-1; i>=sRow+1; i--) {
                if(sCol == endCol) {
                    break;
                }
                System.out.print(arr[i][sCol] + " ");
            }
            sRow++;
            sCol++;
            endRow--;
            endCol--;
        }
    }
    public static void daigonalSum(int matrix[][]) {
        int sum = 0;
       for(int i=0; i<matrix.length; i++) {
            sum+= matrix[i][i];
            if(i!=matrix.length-1-i) {
                sum+= matrix[i][matrix.length-1-i];
            }
       }
       System.out.println(sum);
       
    }

    public static void MatrixSearch( int matrix[][],int key) {
        int i=0;
        int j = matrix.length-1;
        while (true) {
            if(key < matrix[i][j]) {
                j--;
            }
            else if(key>matrix[i][j]) {
                i++;
            }
            else {
                System.out.print("Element found at ( " +i+", "+j +" )" );
                break;
            }
        }
    }
    public static void main(String args[]) {
        // int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // int n=matrix.length, m=matrix[0].length;
        // for (int i=0; i<m; i++) {
        // for(int j=0; j<n; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // for (int i=0; i<m; i++) {
        // for(int j=0; j<n; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Finding a key element in 2D Array

        // key2dArray(3, 3, 5);
        // Spiral Matrix

        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        
        // spiralMatrix(arr);
        // daigonalSum(arr);

        // Searching the key element in Sorted Matrix

        MatrixSearch(arr, 50);
        
         

    }
}