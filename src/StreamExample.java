import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamExample {
//    We should use the empty() method in case of the creation of an empty stream:
//    Stream<String> streamEmpty = Stream.empty();
    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
    private long counter;

    private void wasCalled() {
        counter++;
    }
    public static void main(String[] args) {
        StreamExample ob1 = new StreamExample();
        /*We can also create a stream of any type of Collection (Collection, List, Set):*/
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        System.out.println("streamOfCollection :::" +streamOfCollection);

        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        /*We can also create a stream out of an existing array or of part of an array:*/

        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        System.out.println("stream as array full ::" +streamOfArrayFull);
        System.out.println("stream as array full ::" +streamOfArrayPart);
        /*Stream.builder()*/

        Stream<String> streamBuilder =  Stream.<String>builder().add("a").add("b").add("c").build();
        /*The code above creates a sequence of ten strings with the value “element.*/
        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);

        /*Another way of creating an infinite stream is by using the iterate method:*/

        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);

        Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c");
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");


        Stream<String> stream = list.stream().filter(element -> {
            ob1.wasCalled();
            return element.contains("2");
        });


        // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println(square);

        // create a list of String
        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

        // demonstration of reduce method
        int even =
                number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }
}
