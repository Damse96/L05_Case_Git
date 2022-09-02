package opgave_3_1;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student>{
    private int StudentNo;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(int studentNo, String name) {
        StudentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public List<Integer> getGrades(){
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentNo=" + StudentNo +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo(Student other){
        return Integer.compare(this.StudentNo, other.StudentNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Student other) {
            return this.StudentNo == other.StudentNo;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return StudentNo;
    }
}
