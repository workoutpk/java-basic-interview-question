import java.util.*;
import java.util.function.Consumer;

public class For_EachExample {
    public static int maximum(int[] numbers)
    {
        int maxSoFar = numbers[0];

        // for each loop
        for (int num : numbers)
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
    public static void main(String[] arg)
    {
        {
            int[] marks = { 125, 132, 95, 116, 110 };

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }

        List<String> names = new ArrayList<>(Arrays.asList("aa", "bbb", "cat", "dog"));
        Consumer<String> printConsumer= new Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        };
        names.forEach(printConsumer);
        //lamda expression
        names.forEach(name -> System.out.println(name));

        //method as reference
        names.forEach(System.out::println);

        List<String> names1 = Arrays.asList("Larry", "Steve", "James");

        names1.forEach(System.out::println);

        Set<String> uniqueNames = new HashSet<>(Arrays.asList("Larry", "Steve", "James"));

        uniqueNames.forEach(System.out::println);


        Queue<String> namesQueue = new ArrayDeque<>(Arrays.asList("Larry", "Steve", "James"));

        namesQueue.forEach(System.out::println);

        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");


        namesMap.forEach((key, value) -> System.out.println(key + " " + value));

    }

}
