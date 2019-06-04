import java.util.LinkedList;
import java.util.List;

public class ListTask {
    public static void main(String[] args) {
        List<Integer> arrayList = new LinkedList<Integer>();
        arrayList.add(12);
        arrayList.add(54);
        arrayList.add(3);
        arrayList.add(76);
        arrayList.add(100);
        arrayList.add(34);
        arrayList.add(54);
        arrayList.add(6);
        arrayList.add(124);

        for (int i : arrayList
             ) {
            System.out.println("Element in list " + i);
        }
    }
}
