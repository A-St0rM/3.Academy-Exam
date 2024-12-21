import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = initializeStudents();
        List<Course> academyCourses = initializeCourses();
        Academy academy = new Academy(students);

        assignCoursesToStudents(students, academyCourses);

        // Print diplomas for all students
        for (Student student : students) {
            academy.printDiploma(student);
        }

        printTopAndBottomStudents(academy);
    }

    private static List<Student> initializeStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jens"));
        students.add(new Student("Niklas"));
        students.add(new Student("Jakob"));
        students.add(new Student("Louise"));
        students.add(new Student("Sofie"));
        students.add(new Student("Emilie"));
        students.add(new Student("Hans"));
        students.add(new Student("Ida"));
        students.add(new Student("Frida"));
        students.add(new Student("Alissa"));
        return students;
    }

    private static List<Course> initializeCourses() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("IT-Security"));
        courses.add(new Course("System Design"));
        courses.add(new Course("Web Development"));
        courses.add(new Course("Databases"));
        return courses;
    }

    private static void assignCoursesToStudents(List<Student> students, List<Course> courses) {
        students.get(9).addCourse(courses.get(3), 12); // Alissa
        students.get(9).addCourse(courses.get(0), 7);  // Alissa

        students.get(0).addCourse(courses.get(3), 4);  // Jens
        students.get(0).addCourse(courses.get(0), 2);  // Jens

        students.get(8).addCourse(courses.get(3), 4);  // Frida
        students.get(8).addCourse(courses.get(0), 2);  // Frida
    }

    private static void printTopAndBottomStudents(Academy academy) {
        System.out.println("Highest grades:");
        for (Student s : academy.getHighest(1)) {
            System.out.println(s.getName() + " - Average: " + s.getAverageGrade());
        }

        System.out.println("Lowest grades:");
        for (Student s : academy.getLowest(1)) {
            System.out.println(s.getName() + " - Average: " + s.getAverageGrade());
        }
    }
}
