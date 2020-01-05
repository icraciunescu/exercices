package issues.i069.producerConsumerPattern;

import java.util.List;

public class Consumer implements Runnable {

    List<Integer> questionList = null;

    public Consumer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionList) {
            while (questionList.isEmpty()) {
                System.out.println("no question to answer! waiting for questions!");
                questionList.wait();
            }
        }
        synchronized (questionList) {
            Thread.sleep( 5000 );
            System.out.println("answered question: " + questionList.remove( 0 ));
            questionList.notify();
        }
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
                answerQuestion(  );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
