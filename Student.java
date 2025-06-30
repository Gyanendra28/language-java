import java.util.*;

public class Student {
    public int rollNo;
    public String Name;

    public Student(int rollNo, String Name) {
        this.rollNo = rollNo;
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll No = " + rollNo +
                ", Name = '" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}