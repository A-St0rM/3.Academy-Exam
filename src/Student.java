
import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int[] gradeController = {-3, 0, 2, 4, 7, 10, 12};
    private String name;
    private List<Course> courses;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
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
            System.out.println("The course does not exist in the academy's course list.");
            return;
        }

        // Check if the course is already added
        for (Course sc : courses) {
            if (sc.equals(course)) {
                System.out.println("You already have this course.");
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

        courses.add(course);
        grades.add(grade);
        System.out.println("Added successfully.");
    }


    public double getAverageGrade() {
        double total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
        }
        return total / grades.size();
    }


    public Course getSpecificCourse(int i) {
        return courses.get(i);
    }

    public int getSpecificGrade(int i) {
        return grades.get(i);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name + " " + getAverageGrade();
    }
}
