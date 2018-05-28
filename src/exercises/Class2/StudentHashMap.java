package exercises.Class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {
    public static void main(String[] args){

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;
        int studentId = 0;

        System.out.println("What is the new Student's name (or <ENTER> to exit)?");
        newStudent = in.nextLine();

        while (!newStudent.isEmpty()){
            students.put(studentId, newStudent);
            studentId ++;
            System.out.println("What is the new Student's name (or <ENTER> to exit)?");
            newStudent = in.nextLine();
        }

        System.out.println("Student List:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
