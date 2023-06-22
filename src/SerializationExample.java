import java.io.*;

public class SerializationExample implements Serializable {
        public int a;
        public String b;

        public SerializationExample(int a, String b) {
                this.a = a;
                this.b = b;
        }

        public static void main(String[] args) {
                SerializationExample object = new SerializationExample(1, "pk serialization");
                String filename = "file.text";

                //For Serialization
                try {
                        // Saving of Object In file
                        FileOutputStream file = new FileOutputStream(filename);
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);

                        //Method for serialization
                        objectOutputStream.writeObject(object);
                        objectOutputStream.close();
                        file.close();

                } catch (IOException e) {
                        System.out.println("IO Exception --");
                }

                //  For Deserialization
                try {
                        FileInputStream file = new FileInputStream(filename);
                        ObjectInputStream objectInputStream = new ObjectInputStream(file);

                        objectInputStream.readObject();
                        objectInputStream.close();
                        file.close();

                } catch (IOException e) {
                        System.out.println("IO Exception found");
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                }
        }


}
