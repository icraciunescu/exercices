package issues.i036.myFileReaderAndWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessingList {

    public List<List<Integer>> myProcessingList(List<List<Integer>> myVarList, Integer b) {
        List<List<Integer>> numberInVar = new ArrayList<>(  );
        List<Integer> numberInThisPosition;
        for (List<Integer> varToProcess : myVarList) {
            List<Integer> numberInVar1;
            List<Integer> numberInVar2;
            numberInThisPosition = new ArrayList<>(  );
            for (Integer number : varToProcess) {
                numberInThisPosition.add( number );
                Collections.shuffle( numberInThisPosition );
            }
            numberInVar1 = numberInThisPosition.subList( 0, numberInThisPosition.size() - b );
            numberInVar2 = numberInThisPosition.subList( b, numberInThisPosition.size() );
            numberInVar.add( numberInVar1 );
            numberInVar.add( numberInVar2 );
        }
        return numberInVar;
    }

}
