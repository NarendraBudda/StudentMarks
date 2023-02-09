package com.marks;

public class StudentMarksImpl {
    public static void main(String args[]) {
        StudentMarks studentMarks = new StudentMarks();
        System.out.println("The total marks of medical pathway students ");
        System.out.println(studentMarks.calculateMarks(56, 89, 75, 96));
        System.out.println("The total marks of non medical pathway students ");
        System.out.println(studentMarks.calculateMarks(65, 85, 75));
        System.out.println("The total marks of business pathway students ");
        System.out.println(studentMarks.calculateMarks(85, 52, 96f));

    }

}