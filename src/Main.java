import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Course> academyCourses = new ArrayList<>();

        Student jens = new Student("Jens");
        Student niklas = new Student("Niklas");
        Student jakob =new Student("Jakob");
        Student louise = new Student("Louise");
        Student sofie = new Student("Sofie");
        Student emilie = new Student("Emilie");
        Student hans = new Student("Hans");
        Student ida = new Student("Ida");
        Student frida = new Student("Frida");
        Student alissa = new Student("Alissa");

        academyCourses.add(new Course("IT-Security"));
        academyCourses.add(new Course("systemDesign"));
        academyCourses.add(new Course("Web Development"));
        academyCourses.add(new Course("Databases"));

        alissa.addCourse(academyCourses.get(3),12);
        alissa.addCourse(academyCourses.get(0),7);

        Academy.printDiploma(alissa);

    }
}