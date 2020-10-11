package issues03.i223.e21.example1;

public class A1 {

    private int x;
    static int y;

    class A2 {

        int x;

        void m() {
            x = 10;
            A1.this.x = 20;
        }


    }

    static class A3 {

        void m2() {
            y = 30;
            System.out.println(y);
        }

    }
}
