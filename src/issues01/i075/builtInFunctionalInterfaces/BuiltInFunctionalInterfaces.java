package issues01.i075.builtInFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car( "honda", "accord", "red", 22300 ),
                new Car( "honda", "civic", "blue", 17700 ),
                new Car( "toyota", "land cruiser", "white", 48500 ),
                new Car( "toyota", "corolla", "black", 16200 ),
                new Car( "toyota", "camry", "blue", 24000 ),
                new Car( "nissan", "sentra", "white", 17300 ),
                new Car( "mitsubishi", "lancer", "white", 20000 ),
                new Car( "jeep", "wrangler", "red", 24500 )
        );

        Function<Car, String> priceAndColor = c -> "price " + c.getPrice() + "; color " + c.getColor();
        String stringCar = priceAndColor.apply( cars.get( 5 ) );
        System.out.println(stringCar);

        printCars( cars, (c) -> 18000 <= c.getPrice() && c.getPrice() <= 22000 );
        System.out.println();
        printCars( cars, (c) -> c.getColor().equals( "red" ) );

    }

    public static void printCars(List<Car> cars, Predicate<Car> predicate) {
        for (Car c : cars) {
            if (predicate.test(c)) {
                c.printCar();
            }
        }
    }

//    public static void printCars(List<Car> cars, SetCondition<Car> condition) {
//        for (Car c : cars) {
//            if (condition.test(c)) {
//                c.printCar();
//            }
//        }
//    }

    public static void printCarsPriceRange(List<Car> cars, int lowPrice, int highPrice) {
        for (Car c : cars) {
            if (lowPrice <= c.getPrice() && c.getPrice() <= highPrice) {
                c.printCar();
            }
        }
    }

    public static void printCarByColor(List<Car> cars, String color) {
        for (Car c : cars) {
            if (c.getColor().equals( color )) {
                c.printCar();
            }
        }
    }

}
