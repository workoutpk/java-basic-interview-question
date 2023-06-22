public class CloneMethodOfObjectClass implements Cloneable {
        public static void main(String[] args) {

                // normal way of creating / instantiating new object
                CloneMethodOfObjectClass obj1 = new CloneMethodOfObjectClass();

                try {
                        // Way 2: using clone() method of Object class
                        CloneMethodOfObjectClass object2 = (CloneMethodOfObjectClass) obj1.clone();

                        // invoking display() method
                        object2.display();
                } catch (CloneNotSupportedException cnsex) {
                        cnsex.printStackTrace();
                }
        }

        // display() method to test
        public void display() {
                System.out.println("display() method is invoked");
        }


}
