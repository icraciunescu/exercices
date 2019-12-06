package issues.i031.carDealership;

public class Employee {

    private String nameEmp;

    public Employee(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public void testLotOfMoney(int cashTest, int amountInBankTest, int priceTest) {
        if (cashTest >= priceTest) {
            System.out.println("all is ok \npay " + priceTest + " cash");
        }
        if (cashTest < priceTest) {
            if ((cashTest + amountInBankTest) >= priceTest) {
                if (amountInBankTest >= priceTest) {
                    System.out.println("pay " + amountInBankTest + " through the bank");
                } else {
                    System.out.println("pay " + amountInBankTest + " through the bank and " + (priceTest - amountInBankTest) + " cash");
                }

            } else {
                System.out.println("go to work !!!");
            }
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmp='" + nameEmp + '\'' +
                '}';
    }
}
