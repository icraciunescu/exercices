package issues03.i212.queue;

public class App {

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.insert(1);
        queue.insert(3);
        queue.insert(5);
        queue.insert(7);
        queue.view();
        System.out.println(queue.remove());
        System.out.println(queue.peekFront());
        System.out.println(queue.remove());
        System.out.println(queue.peekFront());
        System.out.println(queue.remove());
        System.out.println(queue.peekFront());
        System.out.println(queue.remove());
        System.out.println(queue.peekFront());
        queue.view();
    }
}
