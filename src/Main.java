public class Main {
    public static void main(String[] args) {
        Academy ac = new Academy();

        Student jens = new Student("Jens");
        Student niklas = new Student("Niklas");
        Student jakob = new Student("Jakob");
        Student louise = new Student("Louise");

        ac.addStudent(jens);
        ac.addStudent(niklas);
        ac.addStudent(jakob);
        ac.addStudent(louise);

        Course database = new Course("Databases");
        Course programming = new Course("Programming");
        Course systemDesign = new Course("System Design");
        Course itSecurity = new Course("IT Security");

        ac.addCourse(database);
        ac.addCourse(programming);
        ac.addCourse(systemDesign);
        ac.addCourse(itSecurity);

        jens.addCourse(database, 10, ac.getAcademyCourses());
        niklas.addCourse(database, 7, ac.getAcademyCourses());
        jakob.addCourse(database, 12, ac.getAcademyCourses());
        louise.addCourse(database, 12, ac.getAcademyCourses());

        jens.addCourse(programming, 7, ac.getAcademyCourses());
        niklas.addCourse(programming, 7, ac.getAcademyCourses());
        jakob.addCourse(programming, 10, ac.getAcademyCourses());
        louise.addCourse(programming, 12, ac.getAcademyCourses());

        ac.printDiploma(jens);
        ac.getHighest(2);
        ac.getLowest(1);
    }
}
