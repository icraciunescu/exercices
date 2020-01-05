package issues01.i027.processingFiles;

public class MyFileUtils {

    public int subtractTenFromLargeNumber(int number) throws Exception{
        if (number < 10) {
            throw new Exception( "the number is smallest than 10" );
        }
        return number - 10;
    }
}
