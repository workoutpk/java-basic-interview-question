import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args)
    {
        // making the arraylist object of List of Integer
        List<List<Integer>> number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        System.out.println("List of list-" + number);


        // using flatmap() to flatten this list
        List<Integer> flatList
                = number.stream()
                .flatMap(Collection::stream)
                .toList();

        // printing the list
        System.out.println("List generate by flatMap-"
                + flatList);


        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformation and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println("The Structure after flattening is : " +
                listofInts);


        // Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");

        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(str ->
        Stream.of(str.charAt(2))).
        forEach(System.out::println);
    }
}
