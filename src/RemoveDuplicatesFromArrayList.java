import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("cat");
        arrayList.add("dog");
        arrayList.add("cat");
        arrayList.add("ox");
        arrayList.add("dog");
        arrayList.add("monkey");

        Set<String> stringsSet = new HashSet<>(arrayList);
        Set<String> hashSet = new LinkedHashSet(arrayList);
        ArrayList<String> stringArrayList = new ArrayList<>(stringsSet);
        System.out.println("Distinct Animal :: "+stringsSet);

        //By java 8

        List<String> pets =  arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println("List of pets :: " +pets);

    }
}
