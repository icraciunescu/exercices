package issues01.i036.myFileReaderAndWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessingFile {

    public List<List<Integer>> myProcessingFile(Integer a) {
        List<Integer> numberInVar;
        List<List<Integer>> myVar = new ArrayList<>(  );
        List<String> lineList = MyFileReader.myReaderLines;
        for (String line : lineList) {
            List<Integer> numberInVar1 = null;
            List<Integer> numberInVar2 = null;
            String[] myLines = line.split( "\n" );
            for (String myLine : myLines) {
                String[] lines = myLine.split( "," );
                numberInVar = new ArrayList<>(  );
                for (String value : lines) {
                    Integer iValue = Integer.parseInt( value );
                    numberInVar.add( iValue );
                    Collections.shuffle( numberInVar );
                }
                numberInVar1 = numberInVar.subList( 0, numberInVar.size()-a );
                numberInVar2 = numberInVar.subList( a, numberInVar.size() );
                System.out.println(numberInVar1);
                System.out.println(numberInVar2);
                System.out.println();
            }
            myVar.add( numberInVar1 );
            myVar.add( numberInVar2 );
        }
        return myVar;
    }

}
