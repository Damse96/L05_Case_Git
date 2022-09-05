package src.opgave2;

import java.util.ArrayList;

public class College {
    private String name;
    ArrayList<Student> students = new ArrayList<>();

    public College(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public double calcAverage(Student student){
        double sum = 0;
        for (int karak : student.getGrades()){
            sum +=karak;
        } return sum / student.getGrades().size();
    }
    public Student findStudents(int studentNo){
        for (Student s : students){
            if (s.getStudentNo() == studentNo){
                return s;
            }
        } return null;
    }
}
