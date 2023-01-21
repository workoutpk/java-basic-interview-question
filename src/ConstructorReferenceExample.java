import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        //*** Using Lambda Expression ***//
        C c1 = () -> new Employee();
        c1.getEmployee().getInfo();
        D d1 = (name,age) -> new Employee(name,age);
        d1.getEmployee("Tony", 34).getInfo();

        //*** Using Method Reference ***//
        C c2 = Employee::new;
        c2.getEmployee().getInfo();
        D d2 = Employee::new;
        d2.getEmployee("Tony", 34).getInfo();

        List<Integer> numbers = Arrays.asList(15, 33, 59, 24, 40, 2, 19, 25,60);

        //*** Using Anonymous Inner class ***//
        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer i1,Integer i2) {
                return i1.compareTo(i2);
            }
        });
        System.out.println("************* Using Anonymous Inner class ***************");
        numbers.forEach(System.out::println);

        //*** Using Lambda Expression ***//
        System.out.println("************* Using Lambda Expression *******************");
        Collections.sort(numbers,(i1,i2) ->i1.compareTo(i2));
        numbers.forEach(System.out::println);

        //*** Using Method Reference ***//
        System.out.println("************* Using Method reference ********************");
        Collections.sort(numbers,(Integer::compareTo));
        numbers.forEach(System.out::println);
    }
}
