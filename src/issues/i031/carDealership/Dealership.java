package issues.i031.carDealership;

public class Dealership {

    public static void main(String[] args) {

        Customer customer1 = new Customer("name_customer", "address_customer", 3000, 11000);
        Car car1 = new Car( "make_car", "model_car", 15000 );
        Employee employee1 = new Employee("nameEmp");
        customer1.purchaseCar(customer1, car1, employee1);

    }

}
