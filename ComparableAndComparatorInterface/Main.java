package ComparableAndComparatorInterface;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer arr[] = {5, 1, 7, 2, 8, 4};
        Arrays.sort(arr, new ReverseComparator());
        for(int a : arr) {
            System.out.print(a + " ");
        }

        List<Student> students = new ArrayList<>(); 
        students.add(new Student(21, "Gyanendra", 53));
        students.add(new Student(23, "Radha", 57));
        students.add(new Student(22, "Shivam", 69));
        students.add(new Student(22, "Anuj", 51));

        // System.out.println(students);

        // Comparator
        System.out.println("\nWeight sorting -");
        // Collections.sort(students, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.weight - o2.weight;
        //     }
        // });

        // Collections.sort(students, new WeightComparator());

        Collections.sort(students, (o1, o2) -> o1.weight - o2.weight);
        System.out.println(students);

        // Comparable
        System.out.println("Age sorting -");
        Collections.sort(students);
        System.out.println(students);
    }
}