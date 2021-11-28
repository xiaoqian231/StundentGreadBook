package Students;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table

public class Student  {
    @Id
    @SequenceGenerator(
            name ="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,

            generator = "student_sequence"
    )
    Long id;
    private String Name;
    private String LastName;
    private StudentCondition Status;
    private int YearOfBirth;
    private double NumberOfCredits;

    public Student(String name, String lastName, StudentCondition status, int yearOfBirth, double numberOfCredits) {
        Name = name;
        LastName = lastName;
        Status = status;
        YearOfBirth = yearOfBirth;
        NumberOfCredits = numberOfCredits;
    }

    public Student(Long id, String name, String lastName, StudentCondition status, int yearOfBirth, double numberOfCredits) {
        this.id = id;
        Name = name;
        LastName = lastName;
        Status = status;
        YearOfBirth = yearOfBirth;
        NumberOfCredits = numberOfCredits;
    }

    public Student() {
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Status=" + Status +
                ", YearOfBirth=" + YearOfBirth +
                ", NumberOfCredits=" + NumberOfCredits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getYearOfBirth() == student.getYearOfBirth() && Double.compare(student.getNumberOfCredits(), getNumberOfCredits()) == 0 && Objects.equals(getName(), student.getName()) && Objects.equals(getLastName(), student.getLastName()) && getStatus() == student.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), getStatus(), getYearOfBirth(), getNumberOfCredits());
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public StudentCondition getStatus() {
        return Status;
    }

    public void setStatus(StudentCondition status) {
        Status = status;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    public double getNumberOfCredits() {
        return NumberOfCredits;
    }

    public void setNumberOfCredits(double numberOfCredits) {
        NumberOfCredits = numberOfCredits;
    }


}
