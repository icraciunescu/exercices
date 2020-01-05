package issues01.i070.producerConsumerPatternII;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerPatternII {

    public static void main(String[] args) {

        BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<>( 5 );

        Thread thread1 = new Thread( new Producer(questionQueue) );
        Thread thread2 = new Thread( new Consumer(questionQueue) );

        thread1.start();
        thread2.start();

    }

}
