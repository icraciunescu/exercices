package issues.i036.myFileReaderAndWriter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyFileReaderAndWriter {

    public static void main(String[] args) {

        File firstFile = new File("D:\\JavaTest\\Exercises\\src\\issues\\i036\\myFileReaderAndWriter\\lotto.csv");
        File secondFile = new File("D:\\JavaTest\\Exercises\\src\\issues\\i036\\myFileReaderAndWriter\\secondFile.csv");

        MyFileReader.myReader( firstFile );

        Integer myInt = MyFileReader.test;
        ArrayList<String> lines = MyFileReader.myReaderLines;
        System.out.println("my line/lines: " + lines);
        System.out.println("my row/rows: " + myInt);

        ProcessingFile processingFile = new ProcessingFile();
        List<List<Integer>> var = processingFile.myProcessingFile(6);
        System.out.println(var);

        ProcessingList processingList = new ProcessingList();
        List<List<Integer>> newVar = processingList.myProcessingList( var, 5 );
        System.out.println(newVar);

        ProcessingList processingList1 = new ProcessingList();
        List<List<Integer>> newVar1 = processingList1.myProcessingList( newVar, 4 );
        System.out.println(newVar1);

        ProcessingList processingList2 = new ProcessingList();
        List<List<Integer>> newVar2 = processingList2.myProcessingList( newVar1, 3 );
        System.out.println(newVar2);

        ProcessingList processingList3 = new ProcessingList();
        List<List<Integer>> newVar3 = processingList3.myProcessingList( newVar2, 2 );
        System.out.println(newVar3);

        MyFileWriter myFileWriter = new MyFileWriter();
        myFileWriter.myWriter( secondFile, newVar3 );

    }

}
