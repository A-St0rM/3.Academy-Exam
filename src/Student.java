import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private Course course;
    private final int[] gradeController = {-3, 0, 2, 4, 7, 10, 12};
    private String name;
    private List<Course> courses;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addCourse(Course course, int grade) {
        boolean gradeValid = false;
        if (courses.isEmpty()) {
            courses.add(course);
            grades.add(grade);
            System.out.println("added successfully");
        } else {
            for (Course sc : courses) {
                if (!sc.equals(course)) {
                    for (int j : gradeController) {
                        if (grade == j) {
                            gradeValid = true;
                        }
                    }
                } else {
                    System.out.println("You already have this course");
                }
            }
            if (gradeValid) {
                System.out.println("added succesfully");
                courses.add(course);
                grades.add(grade);
            } else {
                System.out.println("Enter valid grade");
            }
        }
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
