public class SingletonExample {
        public static void main(String[] args) {
                SingletonDesignPatternInMultiThreadedEnvironment x = SingletonDesignPatternInMultiThreadedEnvironment.getInstance();
                SingletonDesignPatternInMultiThreadedEnvironment y = SingletonDesignPatternInMultiThreadedEnvironment.getInstance();
                SingletonDesignPatternInMultiThreadedEnvironment z = SingletonDesignPatternInMultiThreadedEnvironment.getInstance();
                System.out.println("Multi thread example1:: " + x.hashCode());
                System.out.println("Multi thread example2:: " + y.hashCode());
                System.out.println("Multi thread example3:: " + z.hashCode());

                // Condition check
                if (x == y && y == z) {

                        // Print statement
                        System.out.println(
                            "Three objects point to the same memory location on the heap i.e, to the same object");
                } else {
                        // Print statement
                        System.out.println(
                            "Three objects DO NOT point to the same memory location on the heap");
                }
        }
}
