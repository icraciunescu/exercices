package issues.i035.aboutMap;

import java.util.HashMap;
import java.util.Map;

public class AboutMap {

    public static void main(String[] args) {

        Map<Integer, String> nl = new HashMap<>();
        nl.put( 1, "aaa" );
        nl.put( 2, "bbb" );
        nl.put( 5, "ccc" );
        nl.put( 4, "ddd" );
        nl.put( 3, "eee" );

        nl.put( 3, "fff" );

        for (Integer myVar : nl.keySet()) {
            System.out.println(myVar + " - " + nl.get( myVar ));
        }

        for (Map.Entry<Integer, String> myMap : nl.entrySet()) {
            System.out.println(myMap.getKey() + " . . . " + myMap.getValue());
        }

    }


}
