package ClassAndObjects;

public class StudentObject {
    public static void main(String[] args) {
        // Default Constructor
        StudentClass A = new StudentClass();
        A.id = 1;
        A.name = "Rahul";
        A.setAge(20);
        A.numberOfSubjects = 5;
        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.getAge());
        System.out.println(A.numberOfSubjects);
        A.bunk();
        A.study();

        // Parameterized Constructor
        StudentClass B = new StudentClass(2, "Harshit", 18, 3, "Anshika");
        System.out.println(B.id);
        System.out.println(B.name);
        // System.out.println(B.getAge());
        B.setAge(19);
        System.out.println(B.getAge());
        System.out.println(B.numberOfSubjects);
        B.bunk();
        B.study();
        B.sleep();
        B.chatting();

        // Copy Constructor
        StudentClass C = new StudentClass(B);
        System.out.println(C.id);
        System.out.println(C.name);
        System.out.println(C.getAge());
        System.out.println(C.numberOfSubjects);
    }
}