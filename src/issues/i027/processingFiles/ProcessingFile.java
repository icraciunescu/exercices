package issues.i027.processingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessingFile {

    public static void main(String[] args) {

        try {
            File file = new File( "D:\\JavaTest\\Exercises\\src\\issues\\i027\\ProcessingFiles\\myfile.txt" );
            Scanner input = new Scanner( file );
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println( line );
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }

        MyFileUtils myFileUtils = new MyFileUtils();
        try {
            System.out.println(myFileUtils.subtractTenFromLargeNumber( 10 ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
