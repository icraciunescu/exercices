package issues02.i123.aboutInheritance;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}

class Student extends Person{
    private final int[] testScores;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate() {
        char grade = ' ';
        int arithmeticMean;
        int sumTestScores = 0;
        for (int i = 0; i <=testScores.length - 1; i++) {
            sumTestScores = sumTestScores + testScores[i];
        }
        arithmeticMean = sumTestScores/testScores.length;
        if (arithmeticMean >= 90 && arithmeticMean <= 100) {
            grade = 'O';
        }
        if (arithmeticMean >= 80 && arithmeticMean < 90) {
            grade = 'E';
        }
        if (arithmeticMean >= 70 && arithmeticMean < 80) {
            grade = 'A';
        }
        if (arithmeticMean >= 55 && arithmeticMean < 70) {
            grade = 'P';
        }
        if (arithmeticMean >=40 && arithmeticMean < 55) {
            grade = 'D';
        }
        if (arithmeticMean < 40) {
            grade = 'T';
        }

        return grade;
    }
}


/*
https://www.hackerrank.com/challenges/30-inheritance/problem?h_r=next-challenge&h_v=zen
 */
