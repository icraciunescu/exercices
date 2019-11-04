package issues.i000.Test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        for (int i = 0; i < a.length(); i++) {
            String letter = String.valueOf( a.charAt( i ) );
            if (!b.contains( letter )) {
                //System.out.println(letter);
            } else {
                b = b.replace( letter, "" );
                System.out.println(b);
            }
        }
    }

}
