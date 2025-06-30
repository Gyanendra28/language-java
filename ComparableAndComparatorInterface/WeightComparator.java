package ComparableAndComparatorInterface;
import java.util.*;

public class WeightComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // return o1.weight - o2.weight;
        return Integer.compare(o1.weight, o2.weight);
    }
}