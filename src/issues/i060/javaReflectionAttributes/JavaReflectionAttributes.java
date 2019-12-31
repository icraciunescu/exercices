package issues.i060.javaReflectionAttributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionAttributes {

    public static void main(String[] args) {

        Class student = Student.class;
        Method[] methods = Student.class.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods){
            methodList.add( method.getName() );
        }
        Collections.sort( methodList );
        for (String name : methodList) {
            System.out.println( name );
        }

    }

}

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anotherMethod() {
    }

}




/*
https://www.hackerrank.com/challenges/java-reflection-attributes/problem
 */
