public class numbers {

    public static void main(String[] args) {
        numbersClass number1 = new numbersClass();
        numbersClass number2 = new numbersClass();
        numbersClass number3 = new numbersClass();
        numbersClass checkNumber = new numbersClass();

        number1.inPutNumber();
        number2.inPutNumber();
        number3.inPutNumber();

        checkNumber.check(number1.getNumber(), number2.getNumber(), number3.getNumber());

    }

}
