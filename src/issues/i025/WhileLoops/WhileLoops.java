package issues.i025.WhileLoops;

import org.jetbrains.annotations.NotNull;

public class WhileLoops {

    public static void main(String[] args) {

        String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category: apparel and the slightly "
				+ "more in demand category: makeup along with the category: furniture and ... ";
        printCategories( str );

    }

    public static void printCategories(@NotNull String myString) {

        int i = 0;
        while (true) {
            int found = myString.indexOf( "category: ", i );
            System.out.println(found);
            if (found == -1) {
                break;
            }
            int start = found + 10;
            int end = myString.indexOf( " ", start );
            String myCategory = myString.substring( start, end );
            System.out.println(myCategory);
            i = end + 1;
        }

    }

}


