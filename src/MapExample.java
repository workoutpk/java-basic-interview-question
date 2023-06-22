package src;

// Java program using map() function

import java.util.ArrayList;
import java.util.List;

public class MapExample {

    public static void main(String[] args)
    {
        // making the array list object
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("mango");
        fruit.add("pineapple");
        fruit.add("kiwi");
        System.out.println("List of fruit-" + fruit);

        // lets use map() to c
        // convert list of fruit
        List<Integer> list = fruit.stream()
                .map(String::length)
                .toList();
        System.out.println("List generated by map-" + list);


    }
}
