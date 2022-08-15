package School.Management.System;

public class Student {
    //protect from the outside of class
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Constructor: To create new Student by init
     * @param id: int unique value
     * @param name: string
     * @param grade: int
     * fees for everyone is $30,000
     * fees paid init 0
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30000;
    }

    //not going alter student's name, student's id

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * keep adding the fees to the feedsPaid
     * @param fees: int of feeds of student
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalEarned(feesPaid);
        System.out.println(name + " pay " + fees + ", and totally paid " + feesPaid);
    }

    /**
     * getter of the Student
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemindFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return
                "Student's name is '" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal;
    }
}
