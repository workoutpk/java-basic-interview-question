import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InStreamExample {


    public static void main(String[] args) {
        int[] number ={4,1,13,90,16,20};
        System.out.println("sum::: " +IntStream.of(number).sum());
        System.out.println("min::: " +IntStream.of(number).min());
        System.out.println("max::: " +IntStream.of(number).max());
        System.out.println("avg::: " +IntStream.of(number).average());
        System.out.println("cun::: " +IntStream.of(number).count());


        IntStream.of(number).distinct().sorted().limit(3).forEach(System.out::println);
        IntStream.of(number).distinct().sorted().skip(3).forEach(System.out::println);
        IntStream.of(number).distinct().sorted().filter(n -> n%2==0).forEach(System.out::println);
        IntStream.of(number).distinct().sorted().map(n -> n*2).forEach(System.out::println);
        IntStream.range(1,20).forEach(System.out::println);
        IntStream.range(1,20).toArray();
        IntStream.range(1,20).boxed().collect(Collectors.toList());





        IntSummaryStatistics  intSummaryStatistics = IntStream.of(number).summaryStatistics();
        System.out.println("St  min ::" +intSummaryStatistics.getMin());
        System.out.println("St  max ::" +intSummaryStatistics.getMax());
        System.out.println("St  avg ::" +intSummaryStatistics.getAverage());

        System.out.println("collectors ::");


        List<Integer> integers = Arrays.asList(1, 2, 3, 6);
        Integer sum = integers.stream()
        .mapToInt(Integer::intValue)
        .sum();

        int cnum = 0;
        int ccum = 0;

        for (int i =0;i<integers.size();i ++){

            for (int j= i+1; j<integers.size(); j++){
                for (int k=j+1; k<integers.size();k++)
                {
                    System.out.println("array :: " +integers.get(i)+"," +integers.get(j)+","+integers.get(k));


                    cnum = integers.get(i)+integers.get(j)+  integers.get(k);
//                    System.out.println(cnum);
                    if(cnum % 3 == 0){
                        ccum=ccum+1;
                    }
                }

            }


        }

        System.out.println("sum of number ::: " +sum);
        System.out.println("sum of number ::: " +ccum);
    }
}
