public class JavaRecursion {
    public static void printDec(int n) {
        if (n==1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
        
    }
    public static int nFactorial(int n) {
        if(n==0) {
            return 1;
        } else {
            return n*nFactorial(n-1);
        }


    }
    public static int calSum(int n) {
        if(n==1) {
            return 1;

        } else {
            return n+ calSum(n-1);
        }

    }
    public static void main(String args[]) {
        // printDec(10);
        // System.out.println(nFactorial(5));

        System.out.println(calSum(5));
        
        
    }
}
