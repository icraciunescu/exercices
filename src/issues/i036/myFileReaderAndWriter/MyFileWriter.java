package issues.i036.myFileReaderAndWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileWriter {

    public void myWriter(File file) {

        ArrayList<String> lines = MyFileReader.myReaderLines;

        try (BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( file ) )) {
            bufferedWriter.write( String.valueOf( lines ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
