package issues01.i071.threadPoolsAndTheExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolsAndTheExecutorFramework {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool( 2 );

        Runnable processor = new MessageProcessor( 3 );
        executorService.execute( processor );

        Runnable processor1 = new MessageProcessor( 5 );
        executorService.execute( processor1 );

        Runnable processor2 = new MessageProcessor( 4 );
        executorService.execute( processor2 );

        Runnable processor3 = new MessageProcessor( 4 );
        executorService.execute( processor3 );

        executorService.shutdown();

        try {
            executorService.awaitTermination( 1, TimeUnit.SECONDS );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        while (!executorService.isTerminated()) {
//
//        }

        System.out.println("submitted all tasks...");

    }

}
