package issues.i037.aboutGenerics;

public class MyUtils<E1, E2> {

    public E1 o1;
    public E2 o2;

    public MyUtils(E1 o1, E2 o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public String toString() {
        return "MyUtils{" +
                "o1=" + o1 +
                ", o2=" + o2 +
                '}';
    }
}
