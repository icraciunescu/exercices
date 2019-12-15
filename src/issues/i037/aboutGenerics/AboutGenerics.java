package issues.i037.aboutGenerics;

import java.util.HashSet;
import java.util.Set;

public class AboutGenerics {

    public static void main(String[] args) {

        Wildcards.accessOthers();

        MyUtils<Integer, String> myUtils = new MyUtils<>(25,"test");
        MyUtils<Integer,Integer> myUtils1 = new MyUtils<>( 10, 15 );
        System.out.println(myUtils);
        System.out.println(myUtils1);

        Set<String> set = new HashSet<>();
        set.add( "aaa" );
        set.add( "bbb" );
        set.add( "ccc" );

        Set<String> set1 = new HashSet<>();
        set.add( "aaa" );
        set.add( "bbb" );
        set.add( "ddd" );

        Set<String> result = MyUnion.union( set, set1 );
        System.out.println(result);


    }

}
