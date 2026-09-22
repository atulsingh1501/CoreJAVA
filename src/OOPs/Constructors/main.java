package OOPs.Constructors;

public class main {
    public static void main(String[]args) {
        Students Student1 = new Students("Atul Singh",22,6.5);
        Students Student2 = new Students("Peter parker",22,9);

        System.out.println(Student1.name);
        System.out.println(Student1.age);
        System.out.println(Student1.gpa);
        System.out.println(Student1.isEnrolled);

        System.out.println(Student2.name);
        System.out.println(Student2.age);
        System.out.println(Student2.gpa);

        Student1.study();

    }
}
