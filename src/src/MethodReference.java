package src;

public class MethodReference {
    public static void main(String[] args) {
        //*** Using Lambda Expression ***//


        //B a1 = (x) -> { return x > -10 && x < 10;};
        //System.out.println(a1.checkSingleDigit(10));

        //*** Using Method Reference ***//
        //B a2 = Digit::isSingleDigit;
        //System.out.println(a2.checkSingleDigit(9));

    }
}
