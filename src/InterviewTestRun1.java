import java.util.*;

public class InterviewTestRun1 {
    public static void main(String[] args) {
        //primitive array in natural order:
        int[] number ={4,1,13,90,16,20};
        System.out.println("Sum :::" +Arrays.stream(number).sum());
        System.out.println("Avg :::" +Arrays.stream(number).average());
        System.out.println("Min :::" + Arrays.stream(number).min());
        System.out.println("Max :::" + Arrays.stream(number).max());
        System.out.println("Cnt :::" + Arrays.stream(number).count());

        System.out.println(Arrays.toString(number));
        Arrays.stream(number).sorted().forEach(System.out::println);
        Arrays.stream(number).skip(3).forEach(System.out::println);
        System.out.println("Second Highest Number ::" + Arrays.stream(number)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get()
        );
        Arrays.stream(number).distinct().sorted().skip(4).forEach(System.out::println);


        Arrays.sort(number);
        System.out.println("Sorted With Array ::: " + Arrays.toString(number));

        //To sort of objects in descending order:
        Integer[] arr = { 4, 2, 1, 5, 3,67,90,67 };


        List<Integer> integersList = Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorted Array as List ::: "+integersList);

        Arrays.sort(arr, Comparator.naturalOrder());
        System.out.println("sorted with normal order  :::"+Arrays.toString(arr));

        Arrays.sort(arr, Comparator.reverseOrder());    // or, use `Collections.reverseOrder()`)
        System.out.println("Sorted With Reverse order ::: " + Arrays.toString(arr));

        // create two arrays of integers of size 10 million
        int[] a = new int[10000000];
        int[] b = new int[10000000];

        // Assign random values to `a[]` and `b[]` using a random number generator
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] = r.nextInt();
        }

        // to store execution time in nanoseconds
        long startTime, endTime;

        // sort an array using `Arrays.sort()`
        startTime = System.nanoTime();
        Arrays.sort(a);
        endTime = System.nanoTime();

        System.out.println("The time taken by Arrays.sort() : "
                + (endTime - startTime) / 1000000 + "ms");

        // sort array `b` using `Arrays.parallelSort()`
        startTime = System.nanoTime();
        Arrays.parallelSort(b);
        endTime = System.nanoTime();

        System.out.println("The time taken by Arrays.parallelSort() : "
                + (endTime - startTime) / 1000000 + "ms");




        //List Example
        List<Integer> integers =  Arrays.stream(arr).toList();
        List<Integer> listInteger = Arrays.asList(arr);
        int fifthHighest =5;
        List<Integer> findFifthHighest =  listInteger.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        //System.out.println("Array to List ::: "+integers);
        System.out.println("Reverse Order   ::::::::: "+findFifthHighest);
        System.out.println("fifthHighest is ::::::::: "+findFifthHighest.indexOf(fifthHighest-1));

        List<Integer> integers1= listInteger.stream().filter((n)->n%2==0).toList();
        System.out.println("Filter Example  :::"+integers1);
        System.out.println("Filter Example  :::"+listInteger.contains(1000));

    }
}
