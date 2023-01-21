import java.util.ArrayList;
import java.util.stream.IntStream;

public class ThirdText {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr1[] ={1,2,3,5,6,8,9};

        System.out.println(IntStream.of(arr1).max());
        System.out.println(IntStream.of(arr1).min());
//        IntStream.of(arr1).max().stream().limit(3).forEach(System.out::println);
        IntStream.of(arr1).sorted().distinct().skip(3).forEach(System.out::println);
    }

}
