public class Employee {
    String eName;
    int eAge;

    public Employee(){}

    public Employee(String eName, int eAge) {
        this.eName = eName;
        this.eAge = eAge;
    }

    public void getInfo() {
        System.out.println("I am a method of class Employee");
    }
}
