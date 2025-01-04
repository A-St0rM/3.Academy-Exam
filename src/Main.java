
public class Main {
    public static void main(String[] args) {
        Academy ac = new Academy();

        Student jens = new Student("Jens");
        Student niklas = new Student("Niklas");
        Student jakob = new Student("Jakob");

        ac.addStudent(jens);
        ac.addStudent(niklas);
        ac.addStudent(jakob);

        Course database = new Course("Databases");
        Course programming = new Course("programming");
        Course systemDesign = new Course("System Design");
        Course itSecurity = new Course("It-security");

        ac.addCourse(database);
        ac.addCourse(programming);
        ac.addCourse(systemDesign);
        ac.addCourse(itSecurity);
        //Get academyCourses

        jens.addCourse(database, 10);
        niklas.addCourse(database, 7);
        jakob.addCourse(database,12);

        jens.addCourse(programming, 10);
        niklas.addCourse(programming, 7);
        jakob.addCourse(programming,12);

        jens.addCourse(itSecurity, 4);
        niklas.addCourse(itSecurity, 0);
        jakob.addCourse(itSecurity,7);

        ac.printDiploma(jens);
        ac.printDiploma(niklas);
        ac.printDiploma(jakob);

        ac.getHighest(2);
        ac.getLowest(1);

    }

}
