package issues03.i223.e20.example1;

public class Example1 {

    public static void main(String[] args) {

        Instrument instrument = () -> System.out.println(":)");

        instrument.play();
    }
}
