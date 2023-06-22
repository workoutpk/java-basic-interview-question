import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTwoLists {
        public static void main(String[] args) {
                List<String> listOne = Arrays.asList("b", "c", "a", "e");
                List<String> listTwo = Arrays.asList("a", "c", "b");
                List<String> listThree = Arrays.asList("c", "a", "b");

                Collections.sort(listOne);
                Collections.sort(listTwo);
                Collections.sort(listThree);

                boolean isEqual = listOne.equals(listTwo);
                System.out.println(isEqual);

                isEqual = listOne.equals(listThree);
                System.out.println(isEqual);
                isEqual = listTwo.equals(listThree);
                System.out.println(isEqual);
        }
}
