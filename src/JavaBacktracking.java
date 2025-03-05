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

    public static void permutation(String str, String ans) {
        //Base case
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }
        //Recursion

        for (int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);

            String NewStr = str.substring(0, i) + str.substring(i+1);

            permutation(NewStr, ans+curr);
        }
    }

    //N Queens

    public static boolean isSafe(char board[][], int row, int col) {
        // Horizontal check

        for(int i=row-1; i>=0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }

        // Left Diagonal Check

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        // Right Diagonal Check

        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if (board[i][j] == 'Q') {
                return false;
                
            }
        }

        return true;
    }

    public static void nQueens(char board[][], int row) {
        // Base case 
        if (board.length == row) {
            printBoard(board);
            return;
        }

        // Recursion

        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'X';
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("_____________chess___________");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int gridWays(int i, int j, int m, int n) {

        if (i==m-1 && j == n-1) {
            return 1;
        } else if(i==m || j==n) {
            return 0;
        }

        int w1 = gridWays(i+1, j, m, n);
        int w2 = gridWays(i, j+1, m, n);
        return w1 + w2;
    }

    static int count = 0;

    public static void ratTrapped(int maze[][] , int row, int col) {
        // Base case 

        if (row == maze.length-1 && col == maze[0].length-1) {
            count ++;
        }
    }
    public static void main(String args[]) {
        // int arr[] = {1,2,3,4,5};
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // findSubset("abc", new StringBuilder(""), 0);


        // Finding the number of permutaion in a String

        // permutation("abc", "");



        // N Queens

        // int n = 4;

        // char board[][] = new char[n][n];

        // // Initialization

        // for(int i=0; i<board[0].length; i++) {
        //     for(int j=0; j<board.length; j++) {
        //         board[i][j] = 'X';
        //     }
        // }

        // nQueens(board, 0);


        // Grid Ways code

        // int result = gridWays(0, 0, 3, 3);

        // System.out.println(result);


        int maze[][] = { { 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 0 },
        { 1, 1, 1, 1 } };


    }
}
