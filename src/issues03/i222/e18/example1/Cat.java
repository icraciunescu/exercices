package issues03.i222.e18.example1;

public class Cat extends Pet {

    public Cat() {
        super("porty");
        System.out.println("cat constructor");
    }

    public void sayMeow() {
        System.out.println("meow! my name is " + this.name);
    }

}
