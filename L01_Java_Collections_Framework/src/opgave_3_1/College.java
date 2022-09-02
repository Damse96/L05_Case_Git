package opgave_3_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class College {
    private String name;
    //ArrayList<Student> students = new ArrayList<>();
    //private Set<Student> students = new LinkedHashSet<>();
    private Map<Integer, Student> students = new LinkedHashMap<>();

    public College(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        students.put(student.getStudentNo(), student);
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

    //public Student findStudents(int studentNo){
       // for (Student s : students){
          //  if (s.getStudentNo() == studentNo){
            //    return s;
           // }
        //} return null;
   // }

    public Student findStudent(int studentNo){
        return students.get(studentNo);
    }

    @Override
    public String toString(){
        return name;
    }
}
