import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PlayGround {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,7,8,0,9,50);
        int[] listNumber = {9,79,90,3,67,9};

        Stream<Integer> stream = Stream.of(1,4,6,7);


        System.out.println("Max number is ::" + Collections.max(num));
        System.out.println("Min number is ::" + Collections.min(num));

        List<Integer> l2 = num.stream().map(x->x*x).collect(Collectors.toList());
        List<Integer> l1 = num.stream().sorted().distinct().collect(Collectors.toList());
        List<Integer> l3 = num.stream().sorted().distinct().skip(1).collect(Collectors.toList());
        List<Integer> l4 = num.stream().filter(x-> x> 20).collect(Collectors.toList());
        System.out.println("skip list"+l3);
        System.out.println("range list"+l4);
        //List sorting
        Collections.sort(num);
        Collections.reverse(num);
        System.out.println(num);




        //Operation on Array
        // sorting
        IntStream.of(listNumber).sorted().distinct().limit(3).sorted().forEach(System.out::println);

        int secondHighest = Arrays.stream(listNumber)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();

        int h2 = num.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).
                findFirst().
                get();

        System.out.println("Second Highest number inlist :: " +h2 );
        System.out.println("Second Highest number is :: " +secondHighest);
        Arrays.sort(listNumber);


        for (int i :listNumber){
            System.out.print(i+",");
        }

        Integer sum = num.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum :: " + sum);

        //nth highest number bby for loop
        int snum=90;
        for (int i =0;i< listNumber.length;i++){
            snum = listNumber[i];
            for (int j=i+1;j<=i;j++){
                if( sum< listNumber[j]){
                    snum = listNumber[i];
                }
            }
        }
        System.out.println("soumm:: "+snum);

        String dup = "zebra ant spider spider ant zebra ant";
        String[] split = dup.split(" ");
        System.out.println(Arrays.toString(split));

        HashMap<String,Integer> duplicateElement = new HashMap<>();
        for (String s : split) {
            if (duplicateElement.get(s)  != null){
                duplicateElement.put(s, duplicateElement.get(s)+1);
            }else {
                duplicateElement.put(s,1);
            }

        }

        System.out.println("Duplicate Element ::  "+duplicateElement);

        int[] duplicate0 = {1,2,3,6,7,1,2,9,4,3,9};
        List<Integer> duplicate1 = Arrays.asList(1,2,3,6,7,1,2,9,4,3,9);
        for (int i = 0; i<duplicate0.length;i++){

            for (int j =i+1;j<duplicate0.length;j++){
                if(duplicate0[i] == duplicate0[j]){
                    System.out.println("Array duplicate "+duplicate0[i]+",");
                }
            }

        }
        //for list
        for (int i = 0; i< duplicate1.size();i++){

            for (int j =i+1;j<duplicate1.size();j++){
                if(duplicate1.get(i) == duplicate1.get(j)){
                    System.out.print("List duplicate "+ duplicate1.get(i) +",");
                }
            }
        }




    }
}
