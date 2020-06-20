package issues03.i211.stack;

public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack(5);
        theStack.push('1');
        theStack.push('2');
        theStack.push('3');
        theStack.push('5');
        theStack.push('7');
        theStack.push('1');
        System.out.println(theStack.peak());
        while (!theStack.isEmpty()) {
            char value = theStack.pop();
            System.out.println(value);
        }
        System.out.println(reverseString("abcde"));
    }

    public static String reverseString(String str) {
        String revStr = "";

        Stack stack = new Stack(str.length());

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            char c = stack.pop();
            revStr = revStr + c;
        }
        return revStr;
    }
    
}
