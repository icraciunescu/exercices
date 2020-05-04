package issues02.i113.javaSingletonPattern;

public class JavaSingletonPattern {

    private static JavaSingletonPattern INSTANCE = null;
    public static String str;

    private JavaSingletonPattern() {
    }

    public synchronized static JavaSingletonPattern getSingleInstance() {
        if(INSTANCE == null) {
            INSTANCE = new JavaSingletonPattern();
        }
        return INSTANCE;
    }

}



/*
https://www.hackerrank.com/challenges/java-singleton/problem
 */