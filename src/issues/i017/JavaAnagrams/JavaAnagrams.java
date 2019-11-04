package issues.i017.JavaAnagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

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

        if (a == null || b == null || a.equals("") || b.equals("")) {
            anagram = false;
        }
        if (a.length() != b.length()) {
            anagram = false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt( i );
            if (!map.containsKey( letter )) {
                map.put( letter, 1 );
            } else {
                Integer frequency = map.get( letter );
                map.put( letter, frequency++ );
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char letter = b.charAt( i );
            if (!map.containsKey( letter )) {
                anagram = false;
            }
            Integer frequency = map.get( letter );
            if (frequency == null) {
                anagram = false;
            } else {
                map.put( letter, frequency-- );
            }
        }

        return anagram;
    }
}

/*
https://www.hackerrank.com/challenges/java-anagrams/problem
 */
