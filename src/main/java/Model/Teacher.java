package Model;

import javax.persistence.*;



public class Teacher {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private int tIt;
    private String salary;
    private String teacherName;

    public Teacher() {
        // default constructor
    }

    @ManyToOne
    @JoinColumn(name = "fk_dep")
    private Department department;

    public Teacher(int tIt, String salary, String teacherName) {

        this.tIt = tIt;
        this.salary = salary;
        this.teacherName = teacherName;
    }

    public int gettIt() {
        return tIt;
    }

    public void settIt(int tIt) {
        this.tIt = tIt;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
