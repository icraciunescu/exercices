package issues03.i223.e19.example5;

public final class EngineFactory {

    private EngineFactory() {

    }

    public static Engine build(String type) {
        return switch (type) {
            case "electric" -> new ElectricEngine();
            case "diesel" -> new DieselEngine();
            default -> throw new IllegalArgumentException();
        };
    }
}
