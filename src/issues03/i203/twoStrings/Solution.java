package issues03.i203.twoStrings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String result = "NO";
        boolean commonSubstring = false;
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Map<Character, Integer> string1 = new HashMap<>();

        for (int i = 0; i < str1.length; i++) {
            if (string1.containsKey(str1[i])) {
                string1.put(str1[i], string1.get(str1[i]) + 1);
            } else {
                string1.put(str1[i], 1);
            }

        }
        for (int j = 0; j < str2.length; j++) {
            if (string1.containsKey(str2[j])) {
                commonSubstring = true;
                break;
            }
        }

        if (commonSubstring) {
            result = "YES";
        }
        return result;
    }

//        String result = "NO";
//        boolean commonSubstring = false;
//        char[] str1 = s1.toCharArray();
//        char[] str2 = s2.toCharArray();
//
//        for (int i = 0; i < str1.length; i++) {
//            for (int j = 0; j < str2.length; j++) {
//                if (str1[i] == str2[j]) {
//                    commonSubstring = true;
//                    break;
//                }
//            }
//        }
//
//        if (commonSubstring) {
//            result = "YES";
//        }
//        return result;
//    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues03\\i203\\twoStrings\\file.txt"));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}



/*
https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */