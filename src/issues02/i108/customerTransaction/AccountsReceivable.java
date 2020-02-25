package issues02.i108.customerTransaction;

public class AccountsReceivable {

    private Accounting transactionObject;

    public AccountsReceivable(Accounting aTransaction) {
        this.transactionObject = aTransaction;
    }

    public void postPayment() {
        transactionObject.chargeCustomer();
    }

    public void sendInvoice() {
        transactionObject.prepareInvoice();
    }

}
