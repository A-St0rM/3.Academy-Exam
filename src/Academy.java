public class Academy {

    public static void printDiploma(Student student){
        System.out.println(student.getName());
        for(int i = 0; i < student.getCourses().size(); i++){
            System.out.println(student.getSpecificCourse(i) + ": " + student.getSpecificGrade(i));
        }

        double average = 0;
        for(int g : student.getGrades()){
            average += g;
        }
        System.out.println("average grade " + average/student.getGrades().size());
    }

    public void getHighest(int amount){//TODO

    }

    public void getLowest(int amount){ //TODO

    }


}
