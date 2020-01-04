package issues.i067.threadSafetyUsingSynchronization;

public class ThreadSafetyUsingSynchronization {

    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        Worker worker = new Worker( sequence );
        worker.start();

        Worker worker1 = new Worker( sequence );
        worker1.start();

    }

}

class Worker extends Thread {

    Sequence sequence = null;

    public Worker(Sequence sequence) {
        this.sequence = sequence;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + sequence.getNext());
            try {
                Thread.sleep( 500 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
