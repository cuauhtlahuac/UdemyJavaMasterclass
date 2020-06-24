package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));
        // if you change the value of the next int to 2147483648 it will send an error;
        int myMaxTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE; // -128
        byte myMaxByteValue = Byte.MAX_VALUE; // 127
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE; // -32768
        Short myMaxShortValue = Short.MAX_VALUE; // 32767
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L; // The capital L is to tell the computer that is a long data type;
        Long myMinLongValue = Long.MIN_VALUE; // -9223372036854775808
        Long myMaxLongValue = Long.MAX_VALUE; // 9223372036854775807
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // if you change the value of the next int to 2147483648 it will send an error but...
        // ...if you don't specify the long value with the "L" word at the end;
        long overIntMaxValue = 2_147_483_647_265L; // It has a long key word and "L"w word at the end of the number
        System.out.println(overIntMaxValue);

        // Casting, means transform the type of a number
        byte myNewByteValue = (byte) (myMinByteValue / 2);
    }
}
