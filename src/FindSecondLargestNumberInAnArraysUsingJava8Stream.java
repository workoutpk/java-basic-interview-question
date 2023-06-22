import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestNumberInAnArraysUsingJava8Stream {
    public static void main(String[] args) {
        // random numbers
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        System.out.println("Numbers in Array :: " + Arrays.toString(numbers));
        // sort in descending-order and get 2nd largest element
        int secondLargestNumber = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();



        // print sum to console
        System.out.println("\nSecond largest number in an Arrays is - "
                + secondLargestNumber);

    }
}
