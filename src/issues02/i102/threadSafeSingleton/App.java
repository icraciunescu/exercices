package issues02.i102.threadSafeSingleton;

public class App {

    public static void main(String[] args) {

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
    }
}
