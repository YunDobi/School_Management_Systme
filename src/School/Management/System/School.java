package School.Management.System;

import java.util.List;

/**
 * Many Teacher and many Students
 * Using ArrayList in Teacher and Stdent classes.
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int TotalEarned;
    private static int TotalSpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        TotalEarned = 0;
        TotalSpent = 0;
    }

    /**
     * getter and setter of the Teachers
     * @return teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * getter and setter of the Students
     * @return students
     */
    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * getter and setter of TotalEarned
     * @return totalEarned
     */
    public int getTotalEarned() {
        return TotalEarned;
    }

    public static void updateTotalEarned(int totalEarned) {
        TotalEarned += totalEarned;
    }

    /**
     * getter and setter of TotalSpent
     * @return totalSpent
     */
    public int getTotalSpent() {
        return TotalSpent;
    }

    public static void updateTotalSpent(int moneyspent) {
        TotalEarned -= moneyspent;
    }
}
