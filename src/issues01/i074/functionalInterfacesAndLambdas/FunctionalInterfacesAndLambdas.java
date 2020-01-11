package issues01.i074.functionalInterfacesAndLambdas;

public class FunctionalInterfacesAndLambdas {

    public static void main(String[] args) {

        Human human = new Human();
        walker( human );

        Robot robot = new Robot();
        walker( robot );

        walker( () -> System.out.println("custom object walking") );

        Walkable aBlockOfCode = () -> {
            System.out.println("test 1");
            System.out.println("test 2");
        };

        walker( aBlockOfCode );

        sayHello( () -> System.out.println("lambda hello") );

        ForMath mySum = (a, b) -> a + b;
        System.out.println(mySum.myMath(3, 7));

        ForMath myMultiplication = (a, b) -> a * b;
        System.out.println(myMultiplication.myMath( 3,7 ));

        ForMath myNonZeroDivide = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a / b;
        };
        System.out.println(myNonZeroDivide.myMath( 27, 3 ));

        ForManipulateString myReverse = (string) -> {
            String result = "";
            for (int i = string.length() - 1; i >= 0; i--) {
                result = result + string.charAt( i );
            }
            return result;
        };
        System.out.println(myReverse.myManipulateString( "cat" ));

        ForFactorial myFactorialNumber = (no) -> {
            int result = 1;
            for (int i = 2; i <= no; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println(myFactorialNumber.myFactorial( 10 ));

    }

    public static void walker(Walkable walkable) {
        walkable.walk();
    }

    public static void sayHello(Hello helloEntity) {
        helloEntity.hello();
    }

    public static int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int nonZeroDivide(int arg1, int arg2) {
        if (arg1 == 0) {
            return 0;
        }
        return arg1/arg2;
    }

    public String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt( i );
        }
        return result;
    }

    public int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

}
