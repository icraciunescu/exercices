package issues03.i223.e19.example6;

public class Example6 {

    public static void main(String[] args) {

        Playable playable = () -> System.out.println(":)");
        playable.play();

        Musician musician = new Musician(new Piano());
        musician.play();
    }
}
