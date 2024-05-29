package builderPattern.conciseImplementation;

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

    private Student(int rollNo, String name, String fatherName, String motherName, String address, int age, int height,
                   int weight, int className, int section) {
        this.rollNo = rollNo;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.className = className;
        this.section = section;
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

    public static class StudentBuilder {
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

        public static StudentBuilder create() {
            return new StudentBuilder();
        }

        public StudentBuilder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public StudentBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public StudentBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public StudentBuilder setClassName(int className) {
            this.className = className;
            return this;
        }

        public StudentBuilder setSection(int section) {
            this.section = section;
            return this;
        }

        public Student build() {
            return new Student(rollNo, name, fatherName, motherName, address, age, height,
                    weight, className, section);
        }
    }
}
