package src;

import java.util.*;
import java.util.stream.IntStream;

public class ThirdText {
        public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();
                int arr1[] = {1, 2, 3, 5, 6, 8, 9};
                Integer[] arr2 = {1, 3, 6, 4, 1, 2};

                List<Integer> smallInteger = Arrays.stream(arr2).sorted(Comparator.reverseOrder()).distinct().toList();

                System.out.println(IntStream.of(arr1).max());
                System.out.println(IntStream.of(arr1).min());
                IntStream.of(arr1).max().stream().limit(3).forEach(System.out::println);
                IntStream.of(arr1).sorted().distinct().skip(3).forEach(System.out::println);
                int largestNumber = Arrays.stream(arr2)
                    .sorted()
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .findFirst().get();
                int smallNumber = Arrays.stream(arr2).min(Comparator.naturalOrder()).get();
                System.out.println(largestNumber);
                System.out.println(smallNumber);

                int small = 1;

                int minimumPositive = largestNumber;
                if (largestNumber < 0) {
                        minimumPositive = 1;
                } else {
                        minimumPositive = largestNumber;
                }
                for (int i = 1; i <= minimumPositive; i++) {
                        if (!smallInteger.contains(i)) {
                                small = i;
                        }
                        System.out.println("smallest positive number may be  :: " + i);
                }
                System.out.println("Number ::" + small);
                Integer[] arr = {5, -2, 23, 7, 87, -42, 509};
                Arrays.sort(arr);
                Collections.sort(Arrays.asList(arr));
        }


}
