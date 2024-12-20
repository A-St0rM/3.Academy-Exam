import java.util.ArrayList;
import java.util.List;

public class Student {

    private Course course;
    private int[] grade = {-3,0,2,4,7,10,12};
    private String name;
    private List<Course> courses;
    private List<Integer> grades;

    public Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addCourse(Course course, int grade){

    }
}
