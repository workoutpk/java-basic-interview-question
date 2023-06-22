import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamApiExample {
        public static void main(String[] args) {
                List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);
                List<String> result = list.stream()
                        .filter(Objects::nonNull)
                        .toList();
                result.forEach(System.out::println);
        }
}
