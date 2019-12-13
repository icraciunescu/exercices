package issues.i036.myFileReaderAndWriter;

import java.io.File;
import java.util.ArrayList;

public class MyFileReaderAndWriter {

    public static void main(String[] args) {

        File firstFile = new File("D:\\JavaTest\\Exercises\\src\\issues\\i036\\myFileReaderAndWriter\\lotto.csv");
        File secondFile = new File("D:\\JavaTest\\Exercises\\src\\issues\\i036\\myFileReaderAndWriter\\secondFile.csv");

        MyFileReader.myReader( firstFile );

        Integer myInt = MyFileReader.test;
        ArrayList<String> lines = MyFileReader.myReaderLines;
        System.out.println(lines);
        System.out.println(myInt);

        MyFileWriter myFileWriter = new MyFileWriter();
        myFileWriter.myWriter( secondFile );

    }

}
