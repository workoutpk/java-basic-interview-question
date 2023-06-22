import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class IntrCodingEx {
    public static void main(String[] args) {
        String x = "5";
        if (x == "5" && x != null ) {
            System.out.println("condition satisfy");
        }
        String s1 = "I am an  indian";
        String s2 = "I am an  indian";
        String s3 =  new String("I am an  indian");

        String[] arrs = s1.split( " ");
        System.out.println(s1.length());

        for (String arr : arrs) {
            int isPresent  = arr.indexOf("an");
            System.out.println(arr);
        }

        System.out.println("Loop  on...");
        for (int i=0; i< arrs.length; i++){
            if(arrs[i].equals("an")){
                System.out.println("An are present in array ::");
            }
        }

        System.out.println("contains ::: "+s3.contains("an"));
        //Arrays.sort(arrs,Comparator.reverseOrder());
        System.out.println("Reverse  ::: " + Arrays.stream(arrs).sorted(Comparator.reverseOrder()).toList());

    }

}
