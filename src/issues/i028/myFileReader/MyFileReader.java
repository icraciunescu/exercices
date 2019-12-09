package issues.i028.myFileReader;

import java.io.*;

public class MyFileReader {

    public static void main(String[] args) {

        File file = new File( "D:\\JavaTest\\Exercises\\src\\issues\\i028\\MyFileReader\\delete.csv" );

        try (FileReader fileReader = new FileReader( file );
             BufferedReader bufferedReader = new BufferedReader( fileReader )) {
            String line;
            line = bufferedReader.readLine();
            while (line != null) {
                System.out.println( line );
                line = bufferedReader.readLine();
                //System.out.println( line );
            }
        } catch (FileNotFoundException e) {
            System.out.println( "file not found: " + file.getName() );
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println( "problem riding a file: " + file.getName() );
            e.printStackTrace();
        }
    }
}

