public class SingletonDesignPatternWithEagerInitialization {
    // Step 1: private static variable of INSTANCE variable
    private static SingletonDesignPatternWithEagerInitialization
            INSTANCE = new SingletonDesignPatternWithEagerInitialization();

    // Step 2: private constructor
    private SingletonDesignPatternWithEagerInitialization() {

    }

    // Step 3: Provide public static getInstance() method
    // returning same INSTANCE same time
    public static SingletonDesignPatternWithEagerInitialization  getInstance() {
        return INSTANCE;
    }
}
