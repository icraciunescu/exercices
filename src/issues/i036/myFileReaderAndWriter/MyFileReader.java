package issues.i036.myFileReaderAndWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class MyFileReader {

    public HashSet<String> myReader(File file) {
        HashSet<String> myReaderLines = new HashSet<>();
        try (Scanner scanner = new Scanner( file )) {
            while (scanner.hasNextLine()) {
                String line;
                line = scanner.nextLine();
                myReaderLines.add( line );
            }
            System.out.println( myReaderLines );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return myReaderLines;
    }

}
