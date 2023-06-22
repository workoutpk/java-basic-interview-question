public class SingletonDesignPatternWithEagerInitialization {
        // Step 1: private static variable of INSTANCE variable
        private static final SingletonDesignPatternWithEagerInitialization
            INSTANCE = new SingletonDesignPatternWithEagerInitialization();

        // Step 2: private constructor
        private SingletonDesignPatternWithEagerInitialization() {

        }

        // Step 3: Provide public static getInstance() method
        // returning same INSTANCE same time
        public static SingletonDesignPatternWithEagerInitialization getInstance() {
                return INSTANCE;
        }

        public static void main(String[] args) {
                SingletonDesignPatternWithEagerInitialization singletonDesignPatternWithEagerInitialization1 =
                    getInstance();
                SingletonDesignPatternWithEagerInitialization singletonDesignPatternWithEagerInitialization2 =
                    getInstance();
                System.out.println("1st hashcode ::: " + singletonDesignPatternWithEagerInitialization1.hashCode());
                System.out.println("2nd hashcode ::: " + singletonDesignPatternWithEagerInitialization2.hashCode());
        }
}
