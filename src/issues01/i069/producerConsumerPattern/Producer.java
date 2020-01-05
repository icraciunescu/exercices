package issues01.i069.producerConsumerPattern;

import java.util.List;

public class Producer implements Runnable{

    List<Integer> questionList = null;
    final int LIMIT = 5;
    private int questionNo;

    public Producer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void readQuestion(int questionNo) throws InterruptedException {
        synchronized (questionList) {
            while (questionList.size() == LIMIT) {
                System.out.println("more questions! please wait for answers!");
                questionList.wait();
            }
        }
        synchronized (questionList) {
            System.out.println("new question: " + questionNo);
            questionList.add( questionNo );
            Thread.sleep( 100 );
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
                readQuestion( questionNo++ );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
