package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));
        // if you change the value of the next int to 2147483648 it will send an error;
        int myMaxTest = 2_147_483_647;
    }
}
