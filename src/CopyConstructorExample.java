public class CopyConstructorExample {
    // Class data members
    private double re, im;
    // Constructor 1
    // Parameterized constructor
    public CopyConstructorExample(double re, double im)
    {

        // this keyword refers to current instance itself
        this.re = re;
        this.im = im;
    }

    public CopyConstructorExample(CopyConstructorExample c){
        this.re = c.re;
        this.im = c.im;
    }

    @Override
    public String toString() {
        return "CopyConstructorExample{" +
                "re=" + re +
                ", im=" + im +
        '}';
    }

    public static void main(String[] args) {
        // Creating object of above class
        CopyConstructorExample c1 = new CopyConstructorExample(10, 15);

        // Following involves a copy constructor call
        CopyConstructorExample c2 = new CopyConstructorExample(c1);

        // Note: Following doesn't involve a copy
        // constructor call
        // as non-primitive variables are just references.
        CopyConstructorExample c3 = c2;

        // toString() of c2 is called here
        System.out.println(c2);
    }
}
