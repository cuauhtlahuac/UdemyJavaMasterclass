package academy.learnprogramming;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;

public class Main {

    public static void main(String[] args) {
        float myMaxFloat = Float.MAX_VALUE;
        float myMinFloat = Float.MIN_VALUE;
        System.out.println("Float min value:= " + myMinFloat);
        System.out.println("Float max value:= " + myMaxFloat);

        double myMaxDouble = Double.MAX_VALUE;
        double myMinDouble = Double.MIN_VALUE;
        System.out.println("Double min value:= " + myMinDouble);
        System.out.println("Double max value:= " + myMaxDouble);

        int myIntValue = (int) 5.51; // makes a round floor number
        float myFloatValue = (int) 5.6565; // round floor number but with .0
        double myDoubleValue = 6.765; // By default the decimal numbers are doubles
        System.out.println("my int value: ".concat(String.valueOf(myIntValue)));
        System.out.println("my Float number: " + myFloatValue);
        System.out.println("my Double number: " + myDoubleValue);

        /* Continues with the examples */
        int myIntNumber = 5 / 3; // int number don't include float point
        float MyFloatNumber = 5f / 3f;
        double myDoubleNumber = 5d / 3d; // Is good practice added the type wih the character d, f, etc.
        System.out.println("myIntNumber: " + myIntNumber );
        System.out.println("MyFloatNumber: " + MyFloatNumber );
        System.out.println("myDoubleNumber: " + myDoubleNumber );

        PoundsToKilograms.challenge();

        /* java has a class called BigDecimal for more precision*/

    }


}

class PoundsToKilograms {
    public static void challenge() {
    /* Try until you can do it!!!*/
    System.out.println("\n\n" + "Try until you can do it!!!" + "\n");
    /* Convert a given number of pounds to kilograms*/
    double pounds = 200d;
    double kilograms = 0.45359237d;
    /* HINT: 1 pound = 0.45359237 kg */
    double result = pounds * kilograms;
    double result2 = pounds / 2.2046d; // Other way, but is not the same due the amount of float numbers

        System.out.println("result 1: " + result + "\nresult 2: " + result2);

    /* NOTE: 1 KG = 2.20462 pounds */

    }
}


