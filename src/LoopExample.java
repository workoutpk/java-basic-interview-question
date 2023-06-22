import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LoopExample {
        public static void main(String[] args) {
                List<Integer> duplicate1 = Arrays.asList(1, 2, 3, 6, 7, 1, 2, 9, 4, 3, 9);
                duplicate1.forEach(System.out::println);

                duplicate1.forEach(e -> {
                        e = e * e;
                        System.out.print(e + "square ");
                });

                List<String> countries = Arrays.asList("Germany", "Panama", "Australia");
                for (int i = 0; i < countries.size(); i++) {
                        System.out.println(countries.get(i));
                }

                for (String country : countries) {
                        System.out.println(country);
                }

                Iterator<String> countriesIterator = countries.iterator();

                while (countriesIterator.hasNext()) {
                        System.out.println(countriesIterator.next());
                }

                ListIterator<String> listIterator = countries.listIterator();

                while (listIterator.hasNext()) {
                        System.out.println(listIterator.next());
                }
        }
}
