package src;

import java.util.*;

public class CordialityTest {
        public static void main(String[] args) {
//        String s1 = new String("abc");
//        String s2 ="bcd";
//        String s3 =s1.concat(s2);
//        System.out.println("string will ::" +s3);
//        char s4[] = s3.toCharArray();
//        char s5[] = s1.toCharArray();
//        char s6[] = s2.toCharArray();
//        String[] strings = null;
//        String firstString = "abc";
//        String secondString = "bcd";
//
//        List<String> combinations1 = new ArrayList<>();
//        List<String> combinations2 = new ArrayList<>();
//
//        for (int i = 0; i < firstString.length(); i++) {
//            for (int j = 0; j < secondString.length(); j++) {
//                combinations1.add(firstString.charAt(i) + "" + secondString.charAt(j));
//            }
//        }
//
//        System.out.println(combinations1);
//        for (int i = 0; i < combinations1.size(); i++) {
//            for (int j = 0; j < secondString.length(); j++) {
//                combinations2.add(combinations1.get(i) + "" + secondString.charAt(j));
//            }
//        }
//        System.out.println(combinations2);
                String s1 = "Hello! How are you?";
                char[] c = s1.toCharArray();
                int indexS1H ;
                int indexS1U ;
                List<Integer> list = new ArrayList<>();
                System.out.println("length :::"+c.length);
                for (int i = 0; i < c.length; i++) {
                        String ch= String.valueOf(c[i]);
                        if(ch.equals("H")){
                                System.out.println("H found !" + i);
                                indexS1H=i;
                                for (int j = i+1; j < 19; j++) {
                                        String cu= String.valueOf(c[j]);
                                        if(cu.equals("u")){
                                                System.out.println("u found !" + j);
                                                indexS1U=j;
                                                list.add(indexS1U- indexS1H);
                                        }
                                }
                        }
                }

                System.out.println(list);
                System.out.println("Minimum distance between H and U  is ::: " + list
                        .stream()
                        .min(Comparator.naturalOrder())
                        .get());

        }
}

