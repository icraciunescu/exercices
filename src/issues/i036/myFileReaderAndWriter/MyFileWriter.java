package issues.i036.myFileReaderAndWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyFileWriter {

    public void myWriter(File file, List<List<Integer>> list) {

        List<List<Integer>> lines = list;

        try (BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( file ) )) {
            bufferedWriter.write( String.valueOf( lines ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
