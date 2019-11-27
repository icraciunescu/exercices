package issues.i031.CarDealership;

public class Customer {

    private String name;
    private String address;
    private int cash;
    private int amountInBank;

    public Customer(String name, String address, int cash, int amountInBank) {
        this.name = name;
        this.address = address;
        this.cash = cash;
        this.amountInBank = amountInBank;
    }

    public int getAmountInBank() {
        return amountInBank;
    }

    public void setAmountInBank(int amountInBank) {
        this.amountInBank = amountInBank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void purchaseCar(Customer customer,Car car, Employee employee) {
        System.out.println("for " + car + " " + employee + " say:");
        employee.testLotOfMoney( customer.getCash(), customer.getAmountInBank(), car.getPrice());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cash=" + cash +
                ", amountInBank=" + amountInBank +
                '}';
    }

}
