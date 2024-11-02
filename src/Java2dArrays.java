
public class Java2dArrays {

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while (startRow<=endRow && startCol<=endCol) {
            //top
            for (int j = startCol; j<=endCol;j++) {
                System.out.print(matrix[startRow][j]+ " ");
            }
            // Right
            for (int i=startRow+1;i<=endRow;i++) {
                System.out.print(matrix[i][endCol]+ " ");
            }

            // Bottom 
            for (int j = endCol-1; j>=startCol;j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            //Left

            for (int i = endRow-1; i>=startRow+1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i =0; i<matrix.length; i++) {
            sum+=matrix[i][i];
            if (i!=matrix.length-i-1) {
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix.length-1;

        while (row < matrix.length && col >=0) {
            if (matrix[row][col]==key) {
                System.out.println("Key found at : "+ row+","+col);
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row ++;
            }
        }
        System.out.println("Key element not Fond");
        return false;
    }
    public static void main(String args[]) {
        // Spiral Matrix

        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        spiralMatrix(matrix);

        // Diagonal Sum

        System.out.println("sum of diagonals " + diagonalSum(matrix));
        

        // Search in sorted matrix using stairCase search

        int matrix1[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        staircaseSearch(matrix1, 32);
    }
}