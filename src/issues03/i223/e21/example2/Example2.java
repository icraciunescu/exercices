package issues03.i223.e21.example2;

public class Example2 {

    public static void main(String[] args) {

        Car c = new Car();
        Car.Engine e = c.new Engine();

        e.run();
        e.run();
        e.run();

        System.out.println(c.getX());
    }
}
