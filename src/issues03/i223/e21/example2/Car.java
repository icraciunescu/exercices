package issues03.i223.e21.example2;

public class Car {

    private int x;

    class Engine {

        void run() {
            Car.this.x++;
        }
    }

    public int getX() {
        return x;
    }
}
