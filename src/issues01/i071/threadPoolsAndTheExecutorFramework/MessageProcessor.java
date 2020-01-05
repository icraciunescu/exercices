package issues01.i071.threadPoolsAndTheExecutorFramework;

public class MessageProcessor implements Runnable {

    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " RECEIVED Message " + message);
        respondToMessage(); // make tread sleep to simulate doing work
        System.out.println(Thread.currentThread().getName() + " DONE! Processing message " + message);
    }

    public void respondToMessage() {
        try {
            Thread.sleep( 500 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
