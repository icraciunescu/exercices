package issues01.i034.aboutSet;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class AboutSet {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add( 10 );
        numbers.add( 20 );
        numbers.add( 30 );
        numbers.add( 40 );
        numbers.add( 30 );

        printForMe( numbers );
        System.out.println();

        List<Integer> integerList = new ArrayList<>(numbers);
        Collections.reverse(integerList);
        printForMe( integerList );
        System.out.println();

        Animal animal = new Animal( "cat", 2 );
        Animal animal1 = new Animal( "dog", 4 );
        Animal animal2 = new Animal( "cat", 2 );
        Animal animal3 = new Animal( "cat", 3 );

        LinkedHashSet<Animal> animals = new LinkedHashSet<>();
        animals.add(animal);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        printForMe( animals );
        System.out.println();

        List<Animal> animalList = new ArrayList<>(animals);
        Collections.sort( animalList );
        printForMe( animalList );
    }

    public static void printForMe(@NotNull Set variable) {
        for (Object myVar : variable) {
            System.out.println(myVar);
        }
    }

    public static void printForMe(@NotNull List variable) {
        for (Object myVar : variable) {
            System.out.println(myVar);
        }
    }

}
