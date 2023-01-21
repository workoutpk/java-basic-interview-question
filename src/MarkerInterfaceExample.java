public class MarkerInterfaceExample {
    public static void main(String[] args) throws CloneNotSupportedException{
        MarkerExample markerExample1 = new MarkerExample(20,"Marker Example 1");
        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object

        MarkerExample markerExample2 = (MarkerExample)markerExample1.clone();
        System.out.println(markerExample2.i);
        System.out.println(markerExample2.s);
    }
}
