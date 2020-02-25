package issues02.i108.customerTransaction;

public class ReportGenerator {

    private Reporting transactionObject;

    public void generateReport() {
        System.out.println(transactionObject.getName() + " " + transactionObject.productBreakDown() + " " + transactionObject.getDate());
    }

}
