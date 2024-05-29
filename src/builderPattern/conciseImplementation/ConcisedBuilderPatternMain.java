package builderPattern.conciseImplementation;

public class ConcisedBuilderPatternMain {
    public static void run() {
        Student student = Student.StudentBuilder.create().setName("vishal").setAge(25).setWeight(70).build();
        System.out.println(student.toString());
    }
}
