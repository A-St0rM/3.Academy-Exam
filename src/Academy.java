import java.util.*;

public class Academy {

    private List<Student> students = new ArrayList<>();
    private List<Course> academyCourses = new ArrayList<>();

    public void printDiploma(Student student) {
        System.out.println();
        System.out.println("------ Diploma ------");
        System.out.println("Name: " + student.getName());
        System.out.println("Subjects and grades:");
        for (int i = 0; i < student.getCourses().size(); i++) {
            System.out.println(student.getSpecificCourse(i) + ": " + student.getSpecificGrade(i));
        }

        System.out.println("The average grade is " + student.getAverageGrade());
        System.out.println("---------------------");
    }

    public void getHighest(int amount) {
        List<Student> studentAverageGrades = new ArrayList<>();
        for (Student s : students) {
            s.getAverageGrade();
            studentAverageGrades.add(s);
        }
        for (int currentStudentIndex = 0; currentStudentIndex < studentAverageGrades.size(); currentStudentIndex++) {
            for (int comparisonStudentIndex = 0; comparisonStudentIndex < studentAverageGrades.size(); comparisonStudentIndex++) {
                if (studentAverageGrades.get(currentStudentIndex).getAverageGrade() > studentAverageGrades.get(comparisonStudentIndex).getAverageGrade()) {
                    Student studentTemp = studentAverageGrades.get(currentStudentIndex);
                    studentAverageGrades.remove(currentStudentIndex);
                    studentAverageGrades.add(comparisonStudentIndex, studentTemp);
                }
            }
        }

        for (int x = 0; x < amount; x++) {
            System.out.println("The top " + amount + ". Highest student grades " + studentAverageGrades.get(x));
        }

    }

    public void getLowest(int amount) {
        List<Student> studentAverageGrades = new ArrayList<>();

        for (Student s : students) {
            s.getAverageGrade();
            studentAverageGrades.add(s);
        }
        for (int i = 0; i < studentAverageGrades.size(); i++) {
            for (int j = 0; j < studentAverageGrades.size(); j++) {
                if (studentAverageGrades.get(i).getAverageGrade() < studentAverageGrades.get(j).getAverageGrade()) {
                    Student studentTemp = studentAverageGrades.get(i);
                    studentAverageGrades.remove(i);
                    studentAverageGrades.add(j, studentTemp);
                }
            }
        }

        for (int x = 0; x < amount; x++) {
            System.out.println("The top " + amount + ". Lowest student grades " + studentAverageGrades.get(x));
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public void addCourse(Course course) {
        academyCourses.add(course);
    }

    public List<Course> getAcademyCourses() {
        return academyCourses;
    }


}
