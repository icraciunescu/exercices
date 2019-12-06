package issues.i026.carDealership;

public class Customer {

    private String name;
    private String address;
    private double cash;

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
        address += " Dealership City";
        this.address = address;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
        employee.handleCustomer( this, finance, vehicle );
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cash=" + cash +
                '}';
    }

}
