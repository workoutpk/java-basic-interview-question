import java.io.Serializable;

public class Customer implements Serializable {
    // member variables
    int customerId;
    String customerName;
    int customerAge;

    // 3-arg parametrized constructor
    public Customer(int customerId, String customerName,
                    int customerAge) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
    }

    // overriding toString() method
    @Override
    public String toString() {
        return "Customer ["
                + "customerId=" + customerId + ","
                + " customerName=" + customerName + ","
                + " customerAge=" + customerAge
                + "]";
    }
}
