package opgave2;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student(22,"Frede");
        Student student2 = new Student(11,"kris");
        Student student3 = new Student(11, "Bill");

        student1.addGrade(10);
        student1.addGrade(5);
        student2.addGrade(4);
        student3.addGrade(7);

        College college = new College("Harward");

        college.addStudent(student1);
        college.addStudent(student2);
        college.addStudent(student3);

        System.out.println(college.calcAverage(student1));
    }
}
