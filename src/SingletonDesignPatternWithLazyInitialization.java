public class SingletonDesignPatternWithLazyInitialization {
    // Step 1: private static variable of INSTANCE variable
    private static SingletonDesignPatternWithLazyInitialization INSTANCE;

    // Step 2: private constructor
    private SingletonDesignPatternWithLazyInitialization() {

    }

    // Step 3: Provide public static getInstance() method
    // returning INSTANCE after checking
    public static SingletonDesignPatternWithLazyInitialization  getInstance() {

        if(null == INSTANCE){
            INSTANCE = new  SingletonDesignPatternWithLazyInitialization();
        }
        return INSTANCE;
    }
}
