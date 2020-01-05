package issues01.i069.producerConsumerPattern;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerPattern {

    public static void main(String[] args) {

        List<Integer> questionList = new ArrayList<>(  );

        Thread thread1 = new Thread( new Producer( questionList ) );
        Thread thread2 = new Thread( new Consumer( questionList ) );

        thread1.start();
        thread2.start();

    }

}
