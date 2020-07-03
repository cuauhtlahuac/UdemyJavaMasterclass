package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String myString = "this string";
        System.out.println("my string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("my string is equal to " + myString);
        myString = myString + ", \u00A92020";
        System.out.println("my string is equal to " + myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LasString is equal to " + lastString);
        // Java is smart enough to say ok I note the myInt you've defined is an integer
        // but I also know that you're trying to add it to a String and convert automatically the int into a string
    }
}
