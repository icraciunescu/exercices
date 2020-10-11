package issues03.i223.e20.example2;

public class Example2 {

    public static void main(String[] args) {

        X x = a -> System.out.println(":) " + a);
        x.m(3);

        Y y = (a, b) -> System.out.println(":) " + a + " " + b);
        y.m(1, 2);
    }
}
