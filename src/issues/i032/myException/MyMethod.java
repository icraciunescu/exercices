package issues.i032.myException;

public class MyMethod {

    public int extract15(int number) throws MyException {
        if (number < 15) {
            throw new MyException("number is smallest than 15 !");
        }
        return number - 15;
    }
}
