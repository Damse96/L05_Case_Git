package src.opgave_3_1;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student student1, Student student2){
        return student1.getName().compareTo(student2.getName());
    }
}
