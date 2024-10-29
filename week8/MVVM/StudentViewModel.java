package week8.MVVM;

import java.util.ArrayList;
import java.util.List;

public class StudentViewModel {
    private List<Student> students;
    private int idCounter;

    public StudentViewModel() {
        students = new ArrayList<>();
        idCounter = 1;
    }

    public void addStudent(String name, int age, String course) {
        Student student = new Student(idCounter++, name, age, course);
        students.add(student);
    }

    public boolean updateStudent(int id, String name, int age, String course) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setCourse(course);
                return true;
            }
        }
        return false;
    }

    public List<Student> getStudents() {
        return students;
    }
}
