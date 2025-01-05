
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private final int[] gradeController = {-3, 0, 2, 4, 7, 10, 12};
    private String name;
    private Map<Course, Integer> courseGrades;

    public Student(String name) {
        this.name = name;
        this.courseGrades = new HashMap<>();
    }

    public void addCourse(Course course, int grade, List<Course> academyCourses) {
        // Check if the course exists in the academy's course list
        boolean courseExists = false;
        for (Course ac : academyCourses) {
            if (ac.equals(course)) {
                courseExists = true;
                break;
            }
        }

        if (!courseExists) {
            System.out.println("The course: " + course.getName() + " does not exist in the academy's course list.");
            return;
        }

        // Check if the course is already added
        for (Course sc : courseGrades.keySet()) {
            if (sc.equals(course)) {
                System.out.println("You already have this course: " + course);
                return;
            }
        }

        // Check if the grade is valid
        boolean gradeValid = false;
        for (int validGrade : gradeController) {
            if (grade == validGrade) {
                gradeValid = true;
                break;
            }
        }

        if (!gradeValid) {
            System.out.println("Enter a valid grade.");
            return;
        }

        courseGrades.put(course, grade);
        System.out.println("Added successfully.");
    }


    public double getAverageGrade() {
        double total = 0;
        for (int grade : courseGrades.values()) {
            total += grade;
        }
        return total / courseGrades.size();
    }


    public Map<Course, Integer> getCourseGrades() {
        return courseGrades;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name + " " + getAverageGrade();
    }
}
