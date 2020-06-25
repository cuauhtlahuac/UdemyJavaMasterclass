package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        float myMaxFloat = Float.MAX_VALUE;
        float myMinFloat = Float.MIN_VALUE;
        System.out.println("Float min value:= " + myMinFloat);
        System.out.println("Float max value:= " + myMaxFloat);

        Double myMaxDouble = Double.MAX_VALUE;
        Double myMinDouble = Double.MIN_VALUE;
        System.out.println("Double min value:= " + myMinDouble);
        System.out.println("Double max value:= " + myMaxDouble);

        int myIntValue = (int) 5.51; // makes a round floor number
        float myFloatValue = (int) 5.6565; // round floor number but with .0
        Double myDoubleValue = 6.765; // By default the decimal numbers are doubles
        System.out.println("my int value: ".concat(String.valueOf(myIntValue)));
        System.out.println("my Float number: " + myFloatValue);
        System.out.println("my Double number: " + myDoubleValue);
    }
}
