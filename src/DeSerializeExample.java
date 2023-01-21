import java.io.*;

public class DeSerializeExample {


    public static void main(String[] args) {
        // create an customer object using 3-arg parametrized constructor
        Customer customer = new Customer(102, "SR", 17);

        // creating output stream variables
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        // creating input stream variables
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        // creating customer object reference
        // to hold values after de-serialization
        DeSerializeExample deSerializeCustomer = null;

        try {
            // for writing or saving binary data
            fos = new FileOutputStream("Customer.ser");

            // converting java-object to binary-format
            oos = new ObjectOutputStream(fos);

            // writing or saving customer object's value to stream
            oos.writeObject(customer);
            oos.flush();
            oos.close();

            System.out.println("Serialization: "
                    + "Customer object saved to Customer.ser file\n");

            // reading binary data
            fis = new FileInputStream("Customer.ser");

            // converting binary-data to java-object
            ois = new ObjectInputStream(fis);

            // reading object's value and casting to Customer class
            deSerializeCustomer = (DeSerializeExample) ois.readObject();
            ois.close();

            System.out.println("De-Serialization: Customer object "
                    + "de-serialized from Customer.ser file\n");
        }
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }

        // printing customer object to console using toString() method
        System.out.println("Printing customer values from "
                + "de-serialized object... \n" + deSerializeCustomer);
    }
}
