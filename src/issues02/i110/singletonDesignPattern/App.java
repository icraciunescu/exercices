package issues02.i110.singletonDesignPattern;

public class App {

    public static void main(String[] args) {

        PerformanceStage performanceStage = PerformanceStage.getInstance();
        performanceStage.turnOnLight();
        System.out.println(performanceStage.getCounter());

        PerformanceStage performanceStage2 = PerformanceStage.getInstance();
        performanceStage.turnOnLight();
        System.out.println(performanceStage.getCounter());

    }

}
