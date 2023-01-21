import java.time.LocalTime;
import java.util.*;
import java.util.stream.Stream;

public class TestExample {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("pk1");
        array1.add("pk2");
        array1.add("9");
        array1.forEach(ele-> System.out.println("By foreach::"+ele));
        System.out.println("simple::"+array1);
        List<String> list = array1.stream().toList();
        System.out.println("map ::"+list);

        Map<String, Integer> mapEle =  new HashMap<>();
        mapEle.put("A",1);
        mapEle.put("B",2);
        mapEle.put("c",3);

        List<String> city = Arrays.asList("Boston", "San Diego", "Las Vegas", "Houston", "Miami", "Austin");
        System.out.println(mapEle);
        for (String eleMaster:city){
            System.out.println(eleMaster);
        }

        for (String s : city) {
            System.out.println("By I::" + s);
        }

        city.forEach(System.out::println);
        city.forEach(c-> System.out.println("stream::"+c));
        for (Map.Entry<String, Integer> stringIntegerEntry : mapEle.entrySet()) {
            System.out.println("key::" + stringIntegerEntry.getKey());

        }

        List<String> flatList = city.stream()
                .flatMap(fl -> fl.describeConstable().stream()).toList();

        System.out.println("flatList"+flatList);

        Stream<String> stream = Stream.of("pk10","pk20","pk30","pk40");
        stream.filter(str->str.endsWith("0")).forEach(System.out::println);

        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenovo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        productsList.stream()
            .filter(pc -> pc.price > 26000)     // filtering price
            .map(set -> set.price)              // fetching price
        .forEach(System.out::println);          // iterating price

        List<Float> list1 = productsList.stream()
                .filter(price -> price.price > 26000)
                .map(clp -> clp.price).toList();

        System.out.println("by list"+list1);

        city.stream().sorted().toList().forEach(System.out::println);

        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        int secondLargestNumber = Arrays.stream(numbers)
                .boxed().
                sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        LocalTime endTime = LocalTime.now();

        System.out.println("second largest number is::" +secondLargestNumber);

        System.out.println("original array ::" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("reverse  array ::" + Arrays.toString(numbers));
        System.out.println("s number ::"+numbers[1]);


    }
}
