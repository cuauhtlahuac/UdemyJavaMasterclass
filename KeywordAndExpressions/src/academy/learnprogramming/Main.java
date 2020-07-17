package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 Kilometers
        double kilometers = (100 * 1.609344); // ← this line is an expression.
        int highScore = 50; // ← all things after int keyword is an expression
        if (highScore == 50) { // ← all between parenthesis is an expression
            System.out.println("this is an expression"); // ← also all between parenthesis is an expression
        }


        // in the code bellow write down what part of the code are expression
        int score = 100; //  data type and semicolon aren't part of the expression
        // score = 100
        if (score == 100) { // if and the brackets aren't part of an expression
            // score == 100
            System.out.println("You got the high score"); //
            // "You got the high score"
            score = 0;
            // score = 0
        }
    }

    void statements() {
        int myVariable = 50;// ← this entirely line is an statement.
        myVariable++;// ← also this entirely line is an statement.
        myVariable--;// ← also this entirely line is an statement.
        System.out.println("This is a completely java statement");
        System.out.println("Also this" +
                "line sections" +
                "is a statement");// Java doesn't care if a statement has one line or many, we use it to make it more readable;
    }
}
