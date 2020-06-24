package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	byte myByte = Byte.MAX_VALUE / 4;
	short myShort = Short.MAX_VALUE / 3;
    int myInt = Byte.MIN_VALUE * (-900);
        System.out.println(myInt);
    long myLong = 5000000000000000000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);
    short shortTotal = (short) (999999999 + 10 * (myByte + myShort + myInt)); // an example that overflow number
        System.out.println(shortTotal);
    }

}
