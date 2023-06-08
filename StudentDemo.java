
class Student {
    String name;
    String adress;
    int phone;
    int parentphone;

    public Student() {
        System.out.println("Student created");
        name = "ABC";
        adress = "Bopal";
        phone = 787878;
        parentphone = 99999;
    }

    public Student(String name) {
        System.out.println("Student created");
        this.name = name;
        adress = "Bopal";
        phone = 787878;
        parentphone = 99999;
    }

    public Student(int phone) {
        System.out.println("Student created");
        name = "ABC";
        adress = "Bopal";
        this.phone = phone;
        parentphone = 99999;
    }
}

public class StudentDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student s1 = new Student();
        System.out.println("Details" + s1.name);
        System.out.println(s1.adress);
        System.out.println(s1.phone);
        System.out.println(s1.parentphone);

        Student s2 = new Student("Parth");
        System.out.println("Details" + s2.name);
        System.out.println(s2.adress);
        System.out.println(s2.phone);
        System.out.println(s2.parentphone);

        Student s3 = new Student(45454545);
        System.out.println("Details" + s3.name);
        System.out.println(s3.adress);
        System.out.println(s3.phone);
        System.out.println(s3.parentphone);
    }

}
