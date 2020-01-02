package issues.i065.javaDequeue;

import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        Deque<Integer> deque = new ArrayDeque<>(  );
        Set<Integer> set = new HashSet<>(  );
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            deque.add( num );
            set.add( num );
            if (deque.size() == m) {
                if (set.size() > max) {
                    max = set.size();
                }
                int first = deque.remove();
                if (!deque.contains( first )) {
                    set.remove( first );
                }
            }
        }
        System.out.println(max);
    }

}




/*
https://www.hackerrank.com/challenges/java-dequeue/problem
 */
