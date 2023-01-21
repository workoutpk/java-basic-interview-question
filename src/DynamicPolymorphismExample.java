public class DynamicPolymorphismExample
{
    public static void main(String args[])
    {
        //assigning a child class object to a parent class reference
        Fruits fruits = new Mango();
        //invoking the method
        fruits.color();
    }
}
//parent class
class Fruits
{
    public void color()
    {
        System.out.println("Parent class method is invoked.");
    }
}
//derived or child class that extends the parent class
class Mango extends Fruits
{
    //overrides the color() method of the parent class
    @Override
    public void color()
    {
        System.out.println("The child class method is invoked.");
    }
}