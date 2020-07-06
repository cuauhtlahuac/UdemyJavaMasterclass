package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2 ;

        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("PreviousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("PreviousResult = " + previousResult); // the pointer of previousResult is different to result

        result = ( int ) 1.0 - 1; // Can change to a new value but not to a new type

        // Abbreviating Operators

        result ++; //  add one, works equals with --
        result += 2; // two add a custom number to result, and can use an other operator.

        System.out.println("Result: " + result);
    }
}
