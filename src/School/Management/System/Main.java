package School.Management.System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "lizzy", 500);
        Teacher mellisa = new Teacher(2, "mellisa", 700);
        Teacher Ven = new Teacher(3, "Ven", 800);

        List<Teacher> TeacherList = new ArrayList<>();
        TeacherList.add(lizzy);
        TeacherList.add(mellisa);
        TeacherList.add(Ven);

        Student Tom = new Student(1,"Tom", 4);
        Student Romi = new Student(2,"Romi", 12);
        Student Rabbi = new Student(3,"Rabbi", 5);
        List<Student> StudentList = new ArrayList<>();
        StudentList.add(Tom);
        StudentList.add(Romi);
        StudentList.add(Rabbi);

        School ght = new School(TeacherList, StudentList);
        System.out.println(ght.getTotalEarned());

        System.out.println(Tom);
        Tom.payFees(4000);
        System.out.println("Tom left: " + Tom.getRemindFees());
        System.out.println("School Total Earned: " +ght.getTotalEarned());

        System.out.println("-------SALARY-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHT has spent for salary to " + lizzy.getName() + " and has " + ght.getTotalEarned());

    }
}
