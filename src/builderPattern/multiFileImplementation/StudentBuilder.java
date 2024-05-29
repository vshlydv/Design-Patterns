package builderPattern.multiFileImplementation;

public class StudentBuilder {
    int rollNo;
    String name;
    String fatherName;
    String motherName;
    String address;
    int age;
    int height;
    int weight;
    int className;
    int section;

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
        return new Student(this);
    }

}
