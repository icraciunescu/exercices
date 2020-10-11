package issues03.i223.e21.testPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-15, -14, -13, -12, -11, 11, 12, 13, 14, 15);
        List<Integer> filteredNumbers = getFilteredNumber(numbers, IntegerPredicates.positiveIntegerPredicate);

        System.out.println(filteredNumbers);
        filteredNumbers.forEach(System.out :: println);
    }

    public static List<Integer> getFilteredNumber(List<Integer> numbers, Predicate<Integer> integerPredicate) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer i : numbers) {
            if (integerPredicate.test(i)) {
                filteredNumbers.add(i);
            }
        }
        return filteredNumbers;
    }
}
