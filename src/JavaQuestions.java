import java.util.Scanner;

public class JavaQuestions {
    public static int Average(int n, int x, int y) {
        int avg = (n+x+y)/3;
        return avg;
    }

    public static boolean isEven(int n) {
        if(n%2==0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean Pallindrome(int num) {
        int pall = 0;
        int Mynum = num;
        while(num>0) {
            int Ld = num%10;
            pall = (pall*10)+ Ld;
           num = num/10;
        }
        if (Mynum == pall) {
            return true;
        }
        else {
            return false;
        }
        
    }

    public static int SumInt(int n) {
        int sum = 0;
        while(n>0) {
            int LN = n%10;
            sum+=LN;
            n = n/10;
        }
        return sum;
    }
    public static int RepetedNum(int arr[][]) {
        int count =0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length;j++) {
                if(arr[i][j]==7) {
                    count++;
                }

            }
        }
        return count;
    }

    public static int Sum2Row(int arr[][]) {
        int sum =0;
        int i= 1;
        for(int j=0;j<arr.length; j++) {
            sum+=arr[i][j];
        }
        return sum;
    }
    public static void TransposeMatrix(int arr[][]) {
        int n=arr[0].length;
        int m=arr.length;
        int Transpose[][] = new int[n][m];
        for(int i=0; i<n;i++) {
            for(int j=0;j<m;j++) {
                Transpose[i][j] = arr[j][i];

            }
        }
        for(int i=0; i<Transpose.length; i++) {
            for (int j=0;j<Transpose[0].length; j++) {
                System.out.print(Transpose[i][j] +" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 3 num to calculate Average: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(Average(a, b, c));

        // Question 2

        // System.out.println("Enter a number to check even or odd: ");
        // int n = sc.nextInt();
        // boolean result = isEven(n);
        // if (result) {
        //     System.out.println("Even");
        // }
        // else {
        //     System.out.println("Odd");
        // }

        // Question 3;

        // System.out.println("Enter a num to check pallindrome: ");
        // int num = sc.nextInt();
        // boolean result = Pallindrome(num);
        // if (result) {
        //     System.out.println(num + " is a Pallindrome");
        // }
        // else {
        //     System.out.println(num + " is not a  Pallindrome");
        // }

        // System.out.println(SumInt(232));

        // Finding number of times 7 in 2D Array

        // int arr[][] = {{4,7,8},{8,8,7}};
        // System.out.println(RepetedNum(arr));

        // Sum of the numbers in the second Row

        // int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
        // System.out.print(Sum2Row(arr));

        // Finding Transpose of A mATRIX
        int matrix[][] = {{2,3,4},{5,6,7}};
        TransposeMatrix(matrix);

    }
    
}
