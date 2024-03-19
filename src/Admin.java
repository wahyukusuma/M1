import java.util.ArrayList;

public class Admin {
    private ArrayList<Student> students;

    public Admin() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        if (student.getNim().length() == 15) {
            students.add(student);
        } else {
            System.out.println("NIM tidak valid");
        }
    }

    public void displayStudents() {
        int no = 1;
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Faculty: " + student.getFaculty());
            System.out.println("NIM: " + student.getNim());
            System.out.println("Program: " + student.getProgramStudy());
            System.out.println("--------------------");
            no++;
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
