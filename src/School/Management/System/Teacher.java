package School.Management.System;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * constructure
     * @param id: id of teacher
     * @param name: String name of the teacher
     * @param salary: int salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
