package Institute;

import java.util.ArrayList;

public class Institute {
    ArrayList<Student> StudentList = new ArrayList<>();
    ArrayList<Course> CourseList = new ArrayList<>();
    int[] num = new int[10];

    // ArrayList<Entrollment> Entrollments = new ArrayList<>();
    public void addStudent(String name, String id) {
        Student s = new Student(name, id);
        StudentList.add(s);
    }

    public void addCourse(Course c) {
        CourseList.add(c);
    }

    public void displayStudent() {
        for (Student s : StudentList) {
            System.out.println(s.getStudentName());
        }
    }

    public Student searchStudent(String id) {
        for (Student s : StudentList) {
            if (s.getStudentid().equals(id)) {
                return s;
            }
        }
        return null;
    }
    

}
// public void addStudent(Student s) {
// Students.add(s);
// }

// public void addCourse(Course c) {
// Courses.add(c);
// }

// public void addEntrollment(Entrollment e) {
// Entrollments.add(e);
// }

// public void printStudent() {
// for (Student s : Students) {
// System.out.println(s.getStudentName());
// }
// }
// public void printCourse() {
// for (Course c : Courses) {
// System.out.println(c.getName());
// }
// }
// public void printEntrollment() {
// for (Entrollment e : Entrollments) {
// System.out.println(e.getStudentId() + " " + e.getCourseId());
// }
// }
// public void printStudentPayment() {
// for (Student s : Students) {
// for (Payment p : s.Payments) {
// System.out.println(s.getStudentName() + " " + p.getAmount());
// }
// }
// }
// }