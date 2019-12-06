package issues.i026.carDealership;

public class Dealership {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName( "tom" );
        customer.setAddress( "123 address" );
        customer.setCash( 24000 );

        Vehicle vehicle = new Vehicle();
        vehicle.setMake( "honda" );
        vehicle.setModel( "accord" );
        vehicle.setColor( "red" );
        vehicle.setPrice( 14000 );
        Employee employee = new Employee();

        customer.purchaseCar( vehicle, employee, false );

    }

}
