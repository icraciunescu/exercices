package issues01.i018.javaAnagramsII;

import java.util.Scanner;

public class JavaAnagramsII {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        boolean anagram = true;

        if (a == null || b == null || a.equals("") || b.equals("") || a.length() != b.length()) {
            anagram = false;
        } else  {
            a = a.toLowerCase();
            b = b.toLowerCase();
            for (int i = 0; i < a.length(); i++) {
                String letter = String.valueOf( a.charAt( i ) );
                if (!b.contains( letter )) {
                    anagram = false;
                } else {
                    b = b.replaceFirst( letter, "" );
                }
            }
            if (b.equals( "" )) {
                anagram = true;
            }
        }
        return anagram;
    }

}

/*
https://www.hackerrank.com/challenges/java-anagrams/problem
 */

