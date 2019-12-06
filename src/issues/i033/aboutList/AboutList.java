package issues.i033.aboutList;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AboutList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add( "cat" );
        animals.add( "dog" );
        animals.add( "lion" );
        animals.add( "bear" );
        animals.remove( 2 );
        animals.add( "cat" );

        printAll( animals );

        LinkedList<Car> cars = new LinkedList<>();
        cars.add( new Car( "honda", "accord", 18000 ) );
        cars.add( new Car( "renault", "laguna", 28000 ) );
        cars.add( new Car( "dacia", "duster", 19000 ) );
        cars.add( new Car( "bmw", "520", 35000 ) );
        cars.addFirst( new Car( "bmw", "730", 48000 ) );
        cars.remove( 4 );
        cars.add( 3, new Car( "bmw", "320", 24000 ) );
        cars.addLast( new Car( "bmw", "520", 35000 ) );

        printAll( cars );
    }

    public static void printAll(@NotNull List list) {
        for (Object myVar : list) {
            System.out.println(myVar);
        }
    }

}
