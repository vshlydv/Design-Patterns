package builderPattern.multiFileImplementation;

public class Student {
    private int rollNo;
    private String name;
    private String fatherName;
    private String motherName;
    private String address;
    private int age;
    private int height;
    private int weight;
    private int className;
    private int section;

    public Student(StudentBuilder suStudentBuilder) {
        this.rollNo = suStudentBuilder.rollNo;
        this.name = suStudentBuilder.name;
        this.fatherName = suStudentBuilder.fatherName;
        this.motherName = suStudentBuilder.motherName;
        this.address = suStudentBuilder.address;
        this.age = suStudentBuilder.age;
        this.height = suStudentBuilder.height;
        this.weight = suStudentBuilder.weight;
        this.className = suStudentBuilder.className;
        this.section = suStudentBuilder.section;
    }

    @Override
    public String toString() {
        return "Student{" +
                       "rollNo=" + rollNo +
                       ", name='" + name + '\'' +
                       ", fatherName='" + fatherName + '\'' +
                       ", motherName='" + motherName + '\'' +
                       ", address='" + address + '\'' +
                       ", age=" + age +
                       ", height=" + height +
                       ", weight=" + weight +
                       ", className=" + className +
                       ", section=" + section +
                       '}';
    }
}
