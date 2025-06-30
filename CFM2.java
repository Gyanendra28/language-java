import java.util.*;

public class CFM2 {
    public static void main(String[] args) {
        // LinkedList implementation
        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(10); // add()
        q1.offer(20);
        q1.offer(30);

        System.out.println(q1);

        System.out.println("Removing : " + q1.poll());

        System.out.println(q1);

        System.out.println("Peeking : " + q1.peek());

        // ArrayDeque implementation
        Deque<Integer> q2 = new ArrayDeque<>();

        q2.offer(1);
        q2.offerFirst(5);
        q2.offerLast(50);

        System.out.println(q2);

        System.out.println("Removing last : " + q2.pollLast());

        System.out.println(q2);

        System.out.println("Removing first : " + q2.pollFirst());

        System.out.println(q2);

        System.out.println("Size of queue : " + q2.size());

        System.out.println(q2.peek());
        System.out.println(q2.peekFirst());
        System.out.println(q2.peekLast());

        // Stack
        q2.push(3);
        q2.push(7);
        q2.push(11);

        System.out.println(q2);

        q2.pop();

        System.out.println(q2);

        // Priority Queue implementation
        Queue<Integer> q3 = new PriorityQueue<>((a, b)->b-a);
        // Default behaviour (Min Heap) : Integers -> lesser value = higher priority
        // Max Heap : Integers -> greater value = higher priority

        q3.offer(4);
        q3.offer(8);
        q3.offer(12);
        q3.offer(16);

        System.out.println(q3);

        System.out.println("Removed : " + q3.poll());

        System.out.println(q3);

        System.out.println("Removed : " + q3.poll());

        System.out.println(q3);

        System.out.println("Removed : " + q3.poll());

        System.out.println(q3);

        // HashSet implementation
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        System.out.println(s1);

        Set<Integer> s2 = new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);

        System.out.println(s2);

        s1.retainAll(s2);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.containsAll(s2));
        System.out.println(s2.containsAll(s1));

        // LinkedHashSet implementation
        Set<Integer> s3 = new LinkedHashSet<>();
        s3.add(10);
        s3.add(10);
        s3.add(10);
        s3.add(10);
        s3.add(10);
        s3.add(30);
        s3.add(20);
        s3.add(20);

        System.out.println(s3);

        // TreeSet implementation
        Set<Integer> s4 = new TreeSet<>();
        s4.add(40);
        s4.add(10);
        s4.add(10);
        s4.add(10);
        s4.add(10);
        s4.add(10);
        s4.add(20);
        s4.add(20);
        s4.add(30);

        System.out.println(s4);

        // HashSet : O(1)
        // LinkedHashSet : O(n)
        // TreeSet (BST) : O(logn)

        HashSet<Student> set = new HashSet<>();
        Student st1 = new Student(1, "Gyanendra");
        Student st2 = new Student(1, "Gyanendra");
        Student st3 = new Student(1, "Gyanendra");

        set.add(st1);
        set.add(st2);
        set.add(st3);

        System.out.println(set);
    }
}