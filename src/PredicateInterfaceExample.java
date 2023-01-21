import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceExample {
    String name, role;
    PredicateInterfaceExample(String a, String b) {
        name = a;
        role = b;
    }
    String getRole() { return role; }
    String getName() { return name; }
    public String toString() {
        return "User Name : " + name + ", Role :" + role;
    }
    static void pred(int number, Predicate<Integer> predicate)
    {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }

    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };

    public static void predicate_and()
    {
        Predicate<String> nonNullPredicate = Objects::nonNull;

        String nullString = null;

        boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
        System.out.println(outcome);

        String lengthGTThan10 = "Welcome to the machine";
        boolean outcome2 = nonNullPredicate.and(hasLengthOf10).
                test(lengthGTThan10);
        System.out.println(outcome2);
    }

    public static void predicate_or()
    {

        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }

    public static void main(String[] args) {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.test(10));
        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
        // function
        pred(10, (i) -> i > 7);
        predicate_or();
        predicate_and();

        List<PredicateInterfaceExample> users =
                new ArrayList<PredicateInterfaceExample>();
        users.add(new PredicateInterfaceExample("John", "admin"));
        users.add(new PredicateInterfaceExample("Peter", "member"));

        // This line uses Predicates to filter
        // out the list of users with the role "admin".
        // List admins = process(users, (User u) ->
        // u.getRole().equals("admin"));

        // Replacing it with the following line
        // using Stream API and lambda functions
        // produces the same output

        // the input to the filter() is a lambda
        // expression that returns a predicate: a
        // boolean value for each user encountered
        // (true if admin, false otherwise)
        List admins = users.stream()
                .filter((user) -> user.getRole().equals("admin"))
                .collect(Collectors.toList()
        );

        System.out.println(admins);


    }
}
