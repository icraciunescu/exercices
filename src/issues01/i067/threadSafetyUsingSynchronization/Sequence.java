package issues01.i067.threadSafetyUsingSynchronization;

public class Sequence {

    int value = 0;

    public int getNext() {
        synchronized (this) {
            value++;
            return value;
        }
    }

}
