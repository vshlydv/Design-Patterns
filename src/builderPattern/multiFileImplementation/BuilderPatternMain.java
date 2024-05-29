package builderPattern.multiFileImplementation;

public class BuilderPatternMain {

    public static void run() {
        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder.setName("Vishal").setAge(25).setRollNo(16222254).build();
        System.out.println(student.toString());

        StringBuilder string;
    }
}
