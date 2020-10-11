package issues03.i221.test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int result = x < y ? (y < z ? 10 : 20) : 50;

        System.out.println(result);

        if (true) System.out.println("true");
        System.out.println("false");
    }

}
