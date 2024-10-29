public class JavaBitManipulation {
    public static void checkEvOdd(int num) {
        int result = num &1;
        if (result == 1) {
            System.out.println("Odd");
            
        }
        else {
            System.out.println("Even");
        }
    }
    public static int getIthBit(int n , int i) {
        int one = 1<<i;
        if((n & one)==0) {
            return 0;
        }
        else {
            return 1;
        }

    }
    public static int setithBit(int n, int i) {
        int BitMask = 1<<i;
        return n | BitMask;
    }
    public static int ClearLithBit(int n, int i) {
        int BitMask = (-1)<<i;
        return n & BitMask;
    }
    public static int clearRangeBits(int n , int i , int j) {
        int a = (-1)<<(j+1);
        int b =  ~((-1)<<i);
        int BitMask = a | b;
        return n & BitMask;
    }
    public static int check2Pow(int n) {
        
    }
    public static void main(String args[]) {
        // System.out.print(~2);
        // checkEvOdd(2);
        // System.out.println(getIthBit(10, 3));N
        // System.out.println(setithBit(10, 2));

        // Clear i bits

        // System.out.println(ClearLithBit(15, 2));

        System.out.println(clearRangeBits(10, 2, 4));

        
    }
    
}
  