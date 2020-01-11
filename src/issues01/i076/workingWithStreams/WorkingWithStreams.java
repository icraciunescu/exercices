package issues01.i076.workingWithStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkingWithStreams {

    public static void main(String[] args) {

        IntStream
                .range( 1, 10 ) // not include last element
                .skip( 5 )
                .forEach( x -> System.out.print(x + " ") );

        System.out.println();

        int val = IntStream
                .range( 1, 5 )
                .sum();
        System.out.println(val);

        System.out.println();

        Stream.of( "Hello", "bottle", "Africa" )
                .sorted()
                .findFirst()
                .ifPresent( x -> System.out.println(x) );

        System.out.println();

    }

}
