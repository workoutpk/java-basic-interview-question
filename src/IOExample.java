import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name here..");
        String name = scanner.nextLine();
        System.out.println("name ::" +name);
        System.out.println("Enter age here");
        int age  =  scanner.nextInt();
        System.out.println("Age :: " +age);
    }
}
