package issues.i037.aboutGenerics;

public class MyUtils<E1, E2> {

    private E1 o1;
    private E2 o2;

    public MyUtils(E1 o1, E2 o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public E1 getO1() {
        return o1;
    }

    public void setO1(E1 o1) {
        this.o1 = o1;
    }

    public E2 getO2() {
        return o2;
    }

    public void setO2(E2 o2) {
        this.o2 = o2;
    }

}
