import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IneterExample {
    public static void main(String[] args) {

        List<String> emplyeLisst = new ArrayList<>();
        emplyeLisst.add("emp1");
        emplyeLisst.add("emp4");
        emplyeLisst.add("emp2");
        emplyeLisst.add("emp3");


        System.out.println("Before sorted list ::");
        emplyeLisst.stream().forEach(System.out::println);

        System.out.println("After sorted list ::");
        emplyeLisst.stream().sorted().forEach(System.out::println);

        System.out.println("Desending order::");
        emplyeLisst.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        int i = 5;
        long j =3;
        i= (int) (i+j);
        System.out.println("i == "+ i);

    }
}
