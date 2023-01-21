import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TransientExample {
    public static void main(String[] args) throws Exception{
        ObjectInputStream in  = new ObjectInputStream( (new FileInputStream("login_details.txt")));
        Transient obj = (Transient)in.readObject();

        /* Transient variable will be shown
        null due to security reasons.*/
        System.out.println("Accesskey: "
                + obj.accessKey);
        System.out.println("Age: "
                + obj.age);
        System.out.println("Name: "
                + obj.name);
        System.out.println("Address: "
                + obj.address);
    }
}
