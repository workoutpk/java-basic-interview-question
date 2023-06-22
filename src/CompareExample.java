public class CompareExample {
        public static void main(String[] args) {
                String Str1 = "Equals to compare Strings";

                String Str2 = "equals to compare strings";


                String Str3 = "Equals to compare Strings";

                System.out.println("String length :: " + Str3.length());
                System.out.println("Str1 and Str2 are equal? " + Str1.equals(Str2));

                System.out.println("Str1 and Str3 are equal? " + Str1.equals(Str3));
                if (Str1 == Str2) {
                        System.out.println("string are equals");
                }

                String str4 = "Banana";

                String str5 = "Mango";

                String str6 = "Banana";

                String str7 = new String("Banana");
                String str8 = new String("Banana");


                System.out.println("str1.compareTo(str2) Returned: " + str4.compareTo(str5));

                System.out.println("str3.compareTo(str1) Returned value: " + str6.compareTo(str4));

                System.out.println("str1.compareTo(str3) Returned value: " + str4.compareTo(str6));

                String s1 = new String("TUTORIALSPOINT");
                String s2 = new String("TUTORIALSPOINT");

                //Reference comparison
                System.out.println("String New key comparison");
                System.out.println(" == ::" + s1 == s2);
                //Content comparison
                System.out.println(s1.equals(s2));

                // integer-type
                System.out.println(10 == 10);

                // char-type
                System.out.println('a' == 'a');
        }
}
