public class SingletonClassExample {
        // Static variable reference of single_instance
        // of type Singleton
        private static SingletonClassExample single_instance = null;

        // Declaring a variable of type String
        public String s;

        // Constructor
        // Here we will be creating private constructor
        // restricted to this class itself
        SingletonClassExample() {
                s = "Hello I am a string part of Singleton class";
        }

        /*Static method  to create instance of Singleton class*/
        public static SingletonClassExample getInstance() {
                if (single_instance == null)
                        single_instance = new SingletonClassExample();

                return single_instance;
        }

        public static void main(String[] args) {
                SingletonClassExample singleton1 = getInstance();
                SingletonClassExample singleton2 = getInstance();
                System.out.println("singleton1 hashcode :: " + singleton1.hashCode());
                System.out.println("singleton2 hashcode :: " + singleton2.hashCode());
        }
}
