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
        // A new list of students
        List<Student> studentAverageGrades = new ArrayList<>(students);

        // Sort  list based on averageGrades
        studentAverageGrades.sort((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()));


        System.out.println("Top " + amount + " students with the highest grades:");
        for (int x = 0; x < Math.min(amount, studentAverageGrades.size()); x++) {
            System.out.println((x + 1) + ". " + studentAverageGrades.get(x));
        }
    }


    public void getLowest(int amount) {
        List<Student> studentAverageGrades = new ArrayList<>(students);

        studentAverageGrades.sort((s1, s2) -> Double.compare(s1.getAverageGrade(), s2.getAverageGrade()));

        System.out.println("Top " + amount + " students with the lowest grades:");
        for (int x = 0; x < Math.min(amount, studentAverageGrades.size()); x++) {
            System.out.println((x + 1) + ". " + studentAverageGrades.get(x));
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
