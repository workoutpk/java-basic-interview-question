import java.util.*;

public class MinMaxExample {
    public static void main(String[] args) throws Exception{
        List<Integer> numberList =  new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(10);
        numberList.add(15);
        numberList.add(20);

        System.out.println("List :: " +numberList);
        int minList = Collections.min(numberList);
        int maxList = Collections.max(numberList);
        System.out.println("max number ::" +maxList);
        System.out.println("min number:: " +minList);


        Map<String, Integer> map
                = new HashMap<String, Integer>();

        // Putting key-value pairs in map
        map.put("A", 10);
        map.put("B", 15);
        map.put("C", 20);
        map.put("D", 25);

        // Print the map
        System.out.println("Map: " + map);

        // getting minimum value using min()
        String minKey = Collections.min(map.keySet());

        // getting maximum value using max()
        String maxKey = Collections.max(map.keySet());

        // printing the minimum value
        System.out.println("Minimum Key of Map is: "
                + minKey);
        System.out.println("Value corresponding to "
                + "minimum Key of Map is: "
                + map.get(minKey));

        // printing the maximum value
        System.out.println("Maximum Key of Map is: " + maxKey);
        System.out.println("Value corresponding to "
                + "maximum Key of Map is: "
                + map.get(maxKey));


        // Get the HashSet
        Set<Integer> set = new HashSet<Integer>();

        // fill the hashSet
        set.add(3);
        set.add(6);
        set.add(2);
        set.add(9);

        // printing the Set
        System.out.println("Set: " + set);

        // getting minimum value
        // using min() method
        int minSet = Collections.min(set);

        // getting maximum value
        // using max() method
        int maxSet = Collections.max(set);

        // printing the minimum value
        System.out.println("Minimum value of set is: "
                + minSet);

        // printing the maximum value
        System.out.println("Maximum value of set is: "
                + maxSet);
    }
}
