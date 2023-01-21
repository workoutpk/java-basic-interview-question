public class MarkerExample implements Cloneable{
    int i;
    String s;
    // A class constructor
    public MarkerExample(int i, String s) {
        this.i = i;
        this.s = s;
    }
    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
