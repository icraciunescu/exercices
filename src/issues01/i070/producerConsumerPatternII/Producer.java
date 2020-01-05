package issues01.i070.producerConsumerPatternII;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    int questionNo;
    BlockingQueue<Integer> questionQueue;

    public Producer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
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
        while (true) {
            try {
                synchronized (this) {
                    int nextQuestion = questionNo++;
                    System.out.println("new question: " + nextQuestion);
                    questionQueue.put( nextQuestion );
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
