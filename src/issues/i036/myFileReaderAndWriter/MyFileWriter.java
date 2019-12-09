package issues.i036.myFileReaderAndWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

    public void myWriter(File file) {
        String var = "test";
        try (BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( file ) )) {
            bufferedWriter.write( var );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
