import java.util.ArrayList;
import java.util.List;

public class Academy {

    private List<Student> students;

    public Academy(List<Student> students) {
        this.students = students;
    }

    public void printDiploma(Student student){
        System.out.println();
        System.out.println("------ Diploma ------");
        System.out.println("Name: " + student.getName());
        System.out.println("Subjects and grades:");
        for(int i = 0; i < student.getCourses().size(); i++){
            System.out.println(student.getSpecificCourse(i) + ": " + student.getSpecificGrade(i));
        }

        double average = 0;
        for(int g : student.getGrades()){
            average += g;
        }
        System.out.println("average grade " + average/student.getGrades().size());
        System.out.println("---------------------");
    }

    public List<Student> getHighest(int amount) {
        List<Student> topStudents = new ArrayList<>();
        List<Student> tempStudents = new ArrayList<>(students); // a copy of the list in tempStudents

        System.out.println();
        for (int i = 0; i < amount && !tempStudents.isEmpty(); i++) {
            Student best = tempStudents.get(0);
            for (Student student : tempStudents) { //Going through temp list to find higest grade
                if (student.getAverageGrade() > best.getAverageGrade()) { //
                    best = student;
                }
            }
            topStudents.add(best);
            tempStudents.remove(best); // removes the found best
        }

        return topStudents;
    }

    public List<Student> getLowest(int amount) {
        List<Student> bottomStudents = new ArrayList<>();
        List<Student> tempStudents = new ArrayList<>(students); // Lav en kopi af listen

        System.out.println();
        for (int i = 0; i < amount && !tempStudents.isEmpty(); i++) {
            Student worst = tempStudents.get(0); // Start med første studerende
            for (Student student : tempStudents) {
                if (student.getAverageGrade() < worst.getAverageGrade()) {
                    worst = student;
                }
            }
            bottomStudents.add(worst);
            tempStudents.remove(worst); // Fjern den laveste, så vi kan finde den næste
        }

        return bottomStudents;
    }


}
