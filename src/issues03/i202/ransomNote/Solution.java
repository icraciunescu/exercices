package issues03.i202.ransomNote;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> myMagazine = new HashMap<>();
        boolean isOk = true;
        for (String str : magazine) {
           if (myMagazine.containsKey(str)) {
               myMagazine.put(str, myMagazine.get(str) + 1);
           } else {
               myMagazine.put(str, 1);
           }
        }
        for (String str : note) {
            if (!myMagazine.containsKey(str)) {
               isOk = false;
            } else {
                myMagazine.replace(str, myMagazine.get(str) - 1);
                if (myMagazine.get(str).equals(-1)) {
                    isOk = false;
                    break;
                }
            }
        }
        if (isOk) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}



/*
https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */