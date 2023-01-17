package CourseWork;

public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private final int id;
    private static int countId;

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String fullName, int department, double salary) {
        countId++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = countId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "ФИО: " + getFullName() + ",отдел №" + getDepartment() + ", зарплата " + getSalary() + " рублей, id:" + getId();
    }

}
