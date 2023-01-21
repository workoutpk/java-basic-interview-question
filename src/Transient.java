public class Transient {
    // Making Accesskey transient for security
    transient String accessKey;

    // Making age transient as age can be
    // calculated from Date of Birth
    // and current date.
    transient int age;

    // serialize other fields
    String name, address;
    public Transient(String accessKey, int age,
                String name, String address)
    {
        this.accessKey = accessKey;
        this.age = age;
        this.name = name;
        this.address = address;
    }
}
