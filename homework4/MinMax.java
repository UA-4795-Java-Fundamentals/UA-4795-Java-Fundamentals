public class MinMax {
    public static void main(String[] args) {

        MinMaxClass intNumber1 = new MinMaxClass();
        MinMaxClass intNumber2 = new MinMaxClass();
        MinMaxClass intNumber3 = new MinMaxClass();
        MinMaxClass checkNumber = new MinMaxClass();

        intNumber1.inPutIntNumber();
        intNumber2.inPutIntNumber();
        intNumber3.inPutIntNumber();
        checkNumber.minMax(intNumber1.getIntNumber(), intNumber2.getIntNumber(), intNumber3.getIntNumber());

    }
}
