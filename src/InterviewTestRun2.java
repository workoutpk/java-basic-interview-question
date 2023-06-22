import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterviewTestRun2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        String s = "this is pk here";
        boolean aBoolean = s.toLowerCase().matches(".*[aeiou]*.");
        System.out.println("Vowel is present    ::: " + aBoolean);
        System.out.println("placing white space ::"+s.replace(" ",""));
        String str1 = "abcdABCDabcd";
        char[] chars = str1.toCharArray();
        System.out.println("char :: "+ Arrays.toString(chars));
        Map<Character,Integer> charsCount  = new HashMap<>();
        for (char s1:chars){
                if(charsCount.containsKey(s1)){
                    charsCount.put(s1,charsCount.get(s1)+1);
                }else {
                    charsCount.put(s1,1);
                }
        }

        System.out.println(charsCount);
        String s1 = "Java"; // "Java" String created in pool and reference assigned to s1

        String s2 = s1; //s2 also has the same reference to "Java" in the pool

        System.out.println(s1 == s2); // proof that s1 and s2 have the same reference

        s1 = "Python";
        //s1 value got changed above, so how String is immutable?

        //in the above case a new String "Python" got created in the pool
        //s1 is now referring to the new String in the pool
        //BUT, the original String "Java" is still unchanged and remains in the pool
        //s2 is still referring to the original String "Java" in the pool

        // proof that s1 and s2 have different reference
        System.out.println(s1 == s2);

        System.out.println(s2);
        // prints "Java" supporting the fact that original String value is unchanged, hence String is immutable

    }

}
