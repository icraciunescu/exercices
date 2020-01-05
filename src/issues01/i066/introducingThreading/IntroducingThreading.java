package issues01.i066.introducingThreading;

public class IntroducingThreading {

    public static void main(String[] args) {

        Task task = new Task("thread a");
        task.start();

        System.out.println("hello !!!");

        Task task1 = new Task("thread b");
        task1.start();
    }

}

class Task extends Thread {

    String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName( this.name );
        for (int i = 1; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName(  ) + " - " + i);
            try {
                Thread.sleep( 10 );
            } catch (InterruptedException e) {
                System.out.println(e.getClass().getName());
                e.printStackTrace();
            }
        }
    }

}
