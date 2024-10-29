import java.util.Scanner;

public class JavaStrings {
    public static String StrPallindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return "Not A Pallindrome";
            }
            i++;
            j--;
        }
        return "str is a Pallindrome";
    }

    public static float strShortPath(String str) {
        int X = 0, Y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            // South
            if (dir == 'S') {
                Y--;
            }
            // North
            else if (dir == 'N') {
                Y++;
            }
            // East
            else if (dir == 'E') {
                X++;

            } else {
                X--;
            }
        }
        double Z = Math.pow(X, 2) + Math.pow(Y, 2);

        float Disp = (float) Math.sqrt(Z);
        return Disp;

    }

    public static String SubString(String str, int SE, int EE) {
        String Str2 = "";
        for (int i = SE; i < EE; i++) {
            Str2 += str.charAt(i);
        }
        return Str2;
    }

    public static void StringCompress(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newString += str.charAt(i);
            if (count > 1) {
                newString += count.toString();
            }
        }
        System.out.println(newString);
    }

    public static int LowerVowels(String str) {
        int count = 0;
        // String dub = "";
        String vowel = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowel.contains(Character.toString(str.charAt(i)))) {
                // dub+=str.charAt(i);
                count++;
            }
        }
        return count;
    }
    public static String Anagrams(String str, String str2) {
        for(int i=0; i<str.length(); i++) {
            if(str2.contains(Character.toString(str.charAt(i)))) {
                continue;
            }
            else {
                return "Not a Anagram";
            }
        }
        return "Yes String is Anagram";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // // Check if a String is Pallindrome or not
        // String str = sc.nextLine();
        // System.out.print(StrPallindrome(str));

        // Shortest Path

        // String str = "WNEENESENNN";
        // System.out.print(strShortPath(str));

        // SubString

        // String str = "Hello World";
        // System.out.println(SubString(str, 0, 5));

        // System.out.println(str.substring(0,5));
        // String fruits[] = {"apple","mango","banana"};
        // String largest = fruits[0];
        // for(int i=0; i<fruits.length; i++) {
        // if(largest.compareTo(fruits[i])<0) {
        // largest = fruits[i];

        // }
        // }
        // System.out.println(largest);

        // String Builder

        // StringBuilder sb = new StringBuilder("hw");
        // sc.toString();

        // Covert every first letter to upperCase

        // StringBuilder str = new StringBuilder("hi, i am shradha");
        // str.replace(0, 1,Character.toString(str.charAt(0)).toUpperCase());
        // for(int i=0; i<str.length(); i++) {
        // if (str.charAt(i)==' ') {
        // str.replace(i+1, i+2,Character.toString(str.charAt(i+1)).toUpperCase());
        // }
        // }
        // System.out.println(str);

        // String str = "aaabbcccdd";
        // StringCompress(str);
         
        // Program to count the vowels in a given string

        // String str = sc.nextLine();
        // System.out.print(LowerVowels(str));

        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        // String str = "ApnaCollege";
        // String newStr = str.replace("l", "");
        // System.out.print(newStr);


        // Checking both Strings are Anagrams or not

        String str = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(Anagrams(str, str2));
        
    }

}
