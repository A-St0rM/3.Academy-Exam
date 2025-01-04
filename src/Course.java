import java.util.ArrayList;
import java.util.List;

public class Course {

    private List<Course> academyCourses = new ArrayList<>();
    private String name;

    public Course(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return getName();
    }

    public List<Course> getAcademyCourses(){
        return academyCourses;
    }

    public void addCourse(Course course) {
        academyCourses.add(course);
    }
}
