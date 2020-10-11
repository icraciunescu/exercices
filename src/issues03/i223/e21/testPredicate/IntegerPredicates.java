package issues03.i223.e21.testPredicate;

import java.util.function.Predicate;

public class IntegerPredicates {

    public static Predicate<Integer> positiveIntegerPredicate = i -> i > 0;

//    public static Predicate<Integer> positiveIntegerPredicate = new Predicate<Integer>() {
//        @Override
//        public boolean test(Integer integer) {
//            return integer > 0;
//        }
//    };

}
