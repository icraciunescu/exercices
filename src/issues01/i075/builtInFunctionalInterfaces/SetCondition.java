package issues01.i075.builtInFunctionalInterfaces;

@FunctionalInterface
public interface SetCondition<T> {

    boolean test(T t);

}
