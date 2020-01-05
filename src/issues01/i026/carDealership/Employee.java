package issues01.i026.carDealership;

public class Employee {

    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {

        if (finance) {
            double loanAmount = vehicle.getPrice() - customer.getCash();
            runCreditHistory(customer, loanAmount);
        } else if (vehicle.getPrice() <= customer.getCash()){
            processTransaction(customer, vehicle);
        } else {
            System.out.println("customer " + customer + " will need more money to purchase the vehicle " + vehicle);
        }

    }

    private void runCreditHistory(Customer customer, double loanAmount) {
        System.out.println("run credit history for customer " + customer);
        System.out.println("customer " + customer + " has been approved loan " + loanAmount + " to purchase this vehicle");
    }

    private void processTransaction(Customer customer, Vehicle vehicle) {
        System.out.println("customer" + customer + " has purchased the vehicle " + vehicle + " for the price " + vehicle.getPrice());
    }

}
