package issues.i036.myFileReaderAndWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {

    static ArrayList<String> myReaderLines;
    static Integer test;
    public static void myReader(File file) {
        myReaderLines = new ArrayList<>();
        test = 0;
        try (Scanner scanner = new Scanner( file )) {
            while (scanner.hasNextLine()) {
                String line;
                line = scanner.nextLine();
                myReaderLines.add( line );
                test++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
