import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> numberLst = Arrays.asList(2,4,6,8,10);
        List<String> list = new LinkedList<String>();

        // Adding elements to above LinkedList
        // using add() method
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("Practice");
        // Converting List to array
        // using toArray() method
        String[] arr = list.toArray(new String[0]);
        for (String s : list) {
            System.out.print(s + " ");
        }

        List<String> itemList = new ArrayList<String>();
        itemList.add("item1");
        itemList.add("item2");
        itemList.add("item3");

        String[] itemsArray = new String[itemList.size()];
        itemsArray = itemList.toArray(itemsArray);

        for(String s : itemsArray)
            System.out.println(s);
    }
}
