package issues.i036.myFileReaderAndWriter;

import java.io.File;

public class MyFileReaderAndWriter {

    public static void main(String[] args) {

        File firstFile = new File("D:\\JavaTest\\Exercises\\src\\issues\\i036\\myFileReaderAndWriter\\lotto.csv");
        File secondFile = new File("D:\\JavaTest\\Exercises\\src\\issues\\i036\\myFileReaderAndWriter\\secondFile.csv");

        MyFileReader myFileReader = new MyFileReader();
        myFileReader.myReader( firstFile );

        MyFileWriter myFileWriter = new MyFileWriter();
        myFileWriter.myWriter( secondFile );

        myFileReader.myReader( secondFile );

    }

}
