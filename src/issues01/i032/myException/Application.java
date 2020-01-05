package issues01.i032.myException;

public class Application {
    public static void main(String[] args) {
        MyMethod myMethod = new MyMethod();
        try {
            System.out.println(myMethod.extract15( 5 ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
