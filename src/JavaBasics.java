// BoilerPlate Code 

import java.util.*;

public class JavaBasics {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        return;
    }

    public static void Swap2Num(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static int Multiply(int a, int b) {
        int Mul = a * b;
        return Mul;
    }

    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = Factorial(n);
        int r_fact = Factorial(r);
        int factnmr = Factorial(n - r);
        int binCoeff = fact_n / (r_fact * factnmr);
        return binCoeff;
    }

    public static boolean isprime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void dec2bin(int decNum) {
        int pow = 0;
        int bin = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            bin = bin + (int) (rem * Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println(bin);
    }

    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            // inner loop
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Hello World\n");
        // System.out.println("Hello World\n");
        // System.out.println("Hello World\n");

        // Print a pattern

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // Variable in Java

        // int a = 10;
        // int b = a;
        // int c = 2*(a+b);
        // System.out.println(c);
        // String name = "Faizaan Khan";
        // System.out.println(name);

        // Dat types in Java

        // byte b = 8;
        // System.out.println(b);
        // char ch = 'a';
        // System.out.println(ch);
        // boolean var = false;
        // System.out.println(var);
        // // float Price = 34.676;
        // // double, long, short
        // System.out.println(price);

        // Calculating Sum

        // int a = 10;
        // int b = 5;
        // int sum = a+b;
        // System.out.println(sum);

        /* This is Just a comments */

        // Input in Java

        // String num = sc.next();
        // System.out.println(num);

        // Area of circle

        // float rad = sc.nextFloat();
        // float area = 3.14f * rad *rad;
        // System.out.println(area);
        // type casting

        // float a = 25.45f;
        // int b = (int)a;
        // System.out.println(b);

        // Type PROMOTING

        // char a = 'a';
        // char b = 'b';
        // System.out.println(a+b);
        // System.out.println(a);
        // System.out.println(b);

        // int $ = 24;
        // System.out.println($);

        // PROBLEM 1

        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();

        // float Tcost = pencil+pen+eraser;
        // float Fcost = Tcost + Tcost/18;
        // System.out.println(Fcost);

        // problem 2

        // byte b =4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;
        // double result = (f*b)+(i%c)-(d*s);
        // System.out.println(result);

        // Conditional Statements
        /*
         * if-else
         * else-if
         * terinary
         * Switch
         */

        // int a = 17;
        // if (a>=18) {
        // System.out.println("You are Adult");

        // }
        // else {
        // System.out.println("You are not adult");
        // }

        // Operators

        // int A = 10;
        // int B = 5;
        // System.out.println(A+B);
        // System.out.println(A-B);
        // System.out.println(A/B);
        // System.out.println(A%B);

        // Urinary operators
        // int a = 10;
        // int b = a--;
        // System.out.println(a);
        // System.out.println(b);

        // Relational operator

        // int a = 10;
        // if (a!=9) {
        // System.out.println("Yes");
        // }
        // else {

        // System.out.println("No");
        // }

        // Print the largest of two numbers
        // int A = 10;
        // int B = 5;
        // if (A >= B) {
        // System.out.println("A is largest");

        // } else {
        // System.out.println("B is Largest");
        // }

        // Print if a number is Odd or Even

        // int num = 5;

        // if (num%2==0) {
        // System.out.println(num+" is Even");
        // } else {
        // System.out.println(num +" is odd");
        // }

        // Project Income Tax Calculator

        // int income = sc.nextInt();
        // int tax;

        // if (income<500000) {
        // tax = 0;

        // }
        // else if(income>=500000 && income<=1000000) {
        // tax = (int) (income * 0.2);

        // } else {
        // tax = (int) (income * 0.3);

        // }
        // System.out.println(tax);

        // Largest among 3 num

        // int A=11, B=9, C=6;
        // if ((A >= B) && (A >= C)) {
        // System.out.println("A is Largest");
        // } else if ((B>=C)) {
        // System.out.println("B is larger");

        // } else {
        // System.out.println("C is larger");
        // }

        // Terinary Operator
        // int number = 4363872;
        // String type = ((number%2)==0) ? "even":"odd";
        // System.out.println(type);

        // Switch
        // int number=0;
        // switch(number) {
        // case 1: System.out.println("Samosa");
        // break;
        // case 2: System.out.println("burger");
        // break;
        // case 3: System.out.println("Mango Shake");
        // break;
        // default: System.out.println("Are all lie");
        // }

        // To print a number whether It is positive or negative

        // System.out.println("Enter A Number: ");
        // int num = sc.nextInt();

        // if (num<0) {
        // System.out.println(num +" Is Negative");
        // } else {
        // System.out.println(num +" Is Positive");
        // }
        // CHECKING IF A PERSON HAVE A FEVER

        // System.out.println("Enter you Temp in Farenheit: ");
        // int Temp = sc.nextInt();
        // if (Temp<=100) {
        // System.out.println("You have no fever stay chill");
        // } else {
        // System.out.println("You Have fever Take consult from a Doctor");
        // }

        // Printing Week Days

        // System.out.println("Enter Week Number: ");
        // int num = sc.nextInt();
        // switch (num) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Out of week");
        // }

        // Leap Year

        // int num = sc.nextInt();
        // if (num%4==0) {
        // System.out.println("Its A Leap year");
        // } else {
        // System.out.println("Its Not A Leap year");
        // }

        // Loops
        // While Loop
        // int i =0;
        // while(i<=10) {
        // System.out.println("Hello World");
        // i++;
        // }

        // int n = 5;
        // int sum = 0;
        // while(n<=5) {
        // sum = sum +n;
        // n++;
        // }
        // System.out.println(sum);

        // For loop

        // for (int i = 1; i<=10; i++) {
        // System.out.println(i);
        // }

        // Print Square Patterns

        // for (int i =1;i<=4;i++) {
        // System.out.println("****");
        // }
        // int i =1;
        // while(i<=4) {
        // System.out.println("****");
        // i++;
        // }

        // printing A number in reverse order

        // int n = 10899;

        // while (n>0) {
        // int lastD = n%10;
        // System.out.println(lastD);
        // n = n/10;
        // }

        // int n = 10899;
        // int rev = 0;
        // while (n>0) {
        // int LastD = n%10;
        // rev = (rev*10) + LastD;
        // n = n/10;

        // }
        // System.out.println(rev);

        // Do While Loop
        // int i = 1;
        // do {
        // System.out.println("Hello world");
        // i++;
        // } while(i<10);

        // do {
        // int n = sc.nextInt();
        // if (n%10 == 0) {
        // break;
        // }
        // System.out.println(n);
        // } while(true);

        // Prime number

        // int n = sc.nextInt();

        // if (n ==2) {
        // System.out.println("n is prime");
        // } else {
        // boolean isPrime = true;
        // for (int i =2;i<=Math.sqrt(n);i++) {
        // if (n %i ==0) {
        // isPrime = false;
        // }
        // }
        // if (isPrime == true) {
        // System.out.println("n is prime");
        // } else {
        // System.out.println("n is not prime");
        // }
        // }

        // Write a program that reads a set of integers,and then prints the sum of the
        // even and odd integers

        // System.out.println("Enter Intergers limit");
        // int n = sc.nextInt();
        // int sumeven=0;
        // int sumodd=0;

        // for (int i=1; i<=n; i++) {
        // System.out.println("Enter Integer value: ");
        // int num = sc.nextInt();
        // if (num%2==0) {
        // sumeven+=num;
        // }
        // else {
        // sumodd+=num;
        // }
        // }
        // System.out.println("SUM OF EVEN NUMBER IS"+sumeven);
        // System.out.println("SUM OF ODD NUMBER IS" +sumodd);

        // Factorial

        // System.out.println("Enter the Number you want to find Factorial: ");
        // int n = sc.nextInt();
        // int fact = n;

        // for (int i =n-1; i>0; i--) {
        // if (n==1 || n==0) {
        // fact=1;
        // break;
        // }
        // fact*=i;
        // }
        // System.out.println(fact);

        // Multiplication Table

        // System.out.println("Enter A number to print Table: ");
        // int num = sc.nextInt();

        // for (int i =1; i<=10; i++) {
        // System.out.println(num+ " * "+ i +" = " +num*i);
        // }

        // Star Pattern

        // for (int i =1; i<=4; i++) {
        // for (int j = 1; j<=4-i+1;j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Half Pyramid

        // int n= 4;
        // for (int i=1;i <=n;i++) {
        // for (int j=1;j<=i;j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Print Character pattern

        // char ch = 'A';

        // for (int i =1;i<=4;i++) {
        // for (int j=1;j<=i;j++) {
        // // Inner Loop
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        // Functions..............

        // printHelloWorld(); // Function call

        // Swaping 2 Num

        // int a = sc.nextInt();
        // int b= sc.nextInt();
        // System.out.println("Before Swap a = "+a +" b = "+b);
        // Swap2Num(a, b);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Product of 2 num = "+Multiply(a,b));

        // Factorial Function

        // int fact = sc.nextInt();
        // System.out.println(Factorial(fact));

        // Calculating Binomial Coefficient

        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // System.out.println(binCoeff(n, r));

        // Print all Prime in a Range
        // PrimeInRange(16);

        // Math Function

        // System.out.println(Math.abs(-2368));

        // hollow_rectangle(4, 6);
        // inverted_rotated_half_pyramid(5);

        // Inverted Half Pyramid
        // int n =5;
        // for ( int i =1; i<=n; i++) {
        // for (int j=1; j<=n-i+1; j++) {
        // System.out.print(j +" ");
        // }
        // System.out.println();
        // }
        // // Floyd's Traingle

        // int counter = 1;
        // for (int i =1; i<=5; i++) {
        // for (int j=1; j<i; j++) {
        // System.out.print(counter + " ");
        // counter++;
        // }
        // System.out.println();
        // }

        // 0-1 Traingle

        // for (int i =1; i<=5;i++) {
        // for (int j =1; j<=i;j++) {
        // if ((i+j)%2==0) {
        // System.out.print(1);
        // }
        // else {
        // System.out.print(0);
        // }

        // }
        // System.out.println();
        // }

        // 1st Half
        // int n= 4;
        // for (int i =1; i<=n; i++) {
        // for (int j=1; j<=i; j++) {
        // System.out.print("*");
        // }
        // for( int j= 1; j<=2*(n-i);j++) {
        // System.out.print(" ");
        // }
        // for (int j=1; j<=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i =n; i>=1; i--) {
        // for (int j=1; j<=i; j++) {
        // System.out.print("*");
        // }
        // for( int j= 1; j<=2*(n-i);j++) {
        // System.out.print(" ");
        // }
        // for (int j=1; j<=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Solid Rhombus
        // int n =5;
        // for(int i =1; i<=n; i++) {
        // for (int j =1; j<=n-i;j++) {
        // System.out.print(" ");
        // }
        // for (int j =1; j<=n;j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Daimond Pattern
        // int n=4;
        // for(int i=1;i<=n; i++) {
        // for (int j=1; j<=(n-i); j++) {
        // System.out.print(" ");
        // }
        // for(int j=1;j<=(2*i)-1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(int i=n;i>=1; i--) {
        // for (int j=1; j<=(n-i); j++) {
        // System.out.print(" ");
        // }
        // for(int j=1;j<=(2*i)-1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i=1;i<=5;i++) {
        // for(int j=1;j<=(5-i);j++) {
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i;j++) {
        // System.out.print(i+ " ");
        // }
        // System.out.println();
        // }

        // Palindromic Pattern

        // for(int i=1;i<=5;i++) {
        // for(int j=1;j<=(5-i);j++) {
        // System.out.print(" ");
        // }
        // for(int j=i;j>=1;j--) {
        // System.out.print(j);
        // }
        // for(int j=2;j<=i;j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Bubble sort
        int arr[] = { 5, 4, 1, 3, 2 };
        // int n= arr.length;
        // for (int i=0; i<=n-1; i++) {
        // for (int j=0;j<n-1-i; j++) {
        // if (arr[j]>arr[j+1]) {
        // int temp = arr[j];
        // arr[j] = arr[j+1];
        // arr[j+1] = temp;
        // }
        // }
        // }

        // for (int i=0; i<n; i++) {
        // System.out.println(arr[i] + " ");
        // }

        // Selection sort

        // for (int i = 0; i < arr.length - 1; i++) {
        //     int minPos = i;
        //     for (int j = i + 1; j < arr.length; j++) {

        //         if (arr[minPos] > arr[j]) {
        //             minPos = j;
        //         }

        //     }
        //     int temp = arr[minPos];
        //     arr[minPos] = arr[i];
        //     arr[i] = temp;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i] + " ");
        // }
        // Insertion Sort

        for (int i=1; i<arr.length; i++) {
           int curr =arr[i];
           int prev= i-1;
           while(prev>=0 && arr[prev]>curr) {
            arr[prev+1] = arr[prev];
            prev--;
           }
           arr[prev+1] = curr;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
