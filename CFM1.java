import java.util.*;

public class CFM1 {
    public static void main(String[] args) {
        // List or Collection -> Interface

        //ArrayList -> Concrete Class
        ArrayList<Integer> list1 = new ArrayList<>(); // Reference = ArrayList | Implementation = ArrayList
        System.out.println("ArrayList -");

        // List<Integer> list1 = new LinkedList<>();
        // List<Integer> list1 = new Vector<>();
        // List<Integer> list1 = new Stack<>();

        // add()
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);

        // remove()
        list1.remove(0);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);

        // addAll()
        list1.addAll(list2);
        System.out.println(list1);

        //removeAll()
        list1.removeAll(list2);
        System.out.println(list1);

        //size()
        System.out.println(list1.size());

        //clear()
        System.out.println(list2.size());
        list2.clear();
        System.out.println(list2.size());

        // Traversing list(arr) using iterator
        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>(); // Reference = List | Implementation = ArrayList

        // get()
        list3.add(11);
        list3.add(21);
        list3.add(31);
        System.out.println(list3.get(0));
        System.out.println(list3.get(1));
        System.out.println(list3.get(2));

        // set()
        System.out.println(list3);
        list3.set(0, 111);
        System.out.println(list3);

        // toArray()
        Object[] arr = list3.toArray();
        for(Object obj : arr) {
            System.out.println(obj);
        }

        // contains()
        System.out.println(list3.contains(111));
        System.out.println(list3.contains(211));

        // sort()
        list1.add(12);
        list1.add(6);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

        // clone()
        @SuppressWarnings("unchecked")
        ArrayList<Integer> newList1 = (ArrayList<Integer>)list1.clone();
        System.out.println(newList1);

        // ensureCapacity()
        ArrayList<Integer> newList2 = new ArrayList<>();
        newList2.ensureCapacity(100);

        // isEmpty()
        System.out.println(newList2.isEmpty());

        // indexOf()
        System.out.println(newList1.indexOf(12));

        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println("\nLinkedList -");

        // add()
        ll.add(10);
        ll.add(15);
        ll.add(20);
        System.out.println(ll);

        // addFirst() and addLast()
        ll.addFirst(1);
        ll.addLast(20);
        System.out.println(ll);

        // getFirst() and getLast()
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        // removeFirst() and removeLast()
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);

        // peek()
        System.out.println(ll.peek());

        // poll()
        System.out.println(ll.poll());

        // offer()
        ll.offer(50);
        System.out.println(ll);

        Stack<Integer> st = new Stack<>();
        System.out.println("\nStack -");

        // push()
        st.push(10);
        System.out.println(st);
        st.push(11);
        System.out.println(st);
        st.push(12);
        System.out.println(st);

        // pop()
        st.pop();
        System.out.println(st);

        // peek()
        System.out.println(st.peek());
        System.out.println(st);

        // search()
        System.out.println(st.search(10));
        System.out.println(st.search(11));
        System.out.println(st.search(12));

        // empty()
        System.out.println(st.empty());
        

        // Collection<Integer> collection = new ArrayList<>(); // Reference = Collection | Implementation = ArrayList
    }
}