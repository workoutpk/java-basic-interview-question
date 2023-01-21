public class P1Example {
    //for lazy
//    public static  P1Example  INSTANCE;
    //For Eager
    public static P1Example INSTANCE  = new P1Example();

    private P1Example() { }
    public static P1Example getInstance(){
//        if(null==INSTANCE){
//            return new P1Example();
//        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        P1Example p1Example = P1Example.getInstance();
        P1Example p2Example = P1Example.getInstance();
        System.out.println("singleton instance:: "+p1Example.hashCode());
        System.out.println("singleton instance:: "+p2Example.hashCode());
    }
}
