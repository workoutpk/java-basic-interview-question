import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BirlaSoftExample {
        public static void main(String[] args) {

                //Output : 4, 5, 1, 2, 3
                Integer arr[] = {1, 2, 3, 4, 5};

                List<Integer> list = Arrays.asList(arr);
                int shiftTimes = 2;
                List<Integer> merge1 = list.stream().limit(2).toList();
                List<Integer> merge2 = list.stream().skip( shiftTimes).toList();
                System.out.println(merge1);
                System.out.println(merge2);

                List<Integer> list1 = new ArrayList<>();
                list1.addAll(merge2);
                list1.addAll(merge1);

                System.out.println("Shifting of Array is  ::: " + list1);



        }
}
