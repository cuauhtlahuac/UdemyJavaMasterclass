package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == true) { // code block save the day
            System.out.println("It is not an alien");
            System.out.println("And I´m scared of aliens");
        }

        // Usando datos en duro
        calculateScore(true, 800, 5, 100);

        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 300;
        // Usando datos de las variables
        calculateScore( gameOver, score, levelCompleted, bonus);

        AndOperator();

        TernaryOperator();
    }

    public static void AndOperator() {
        // one billion 1,000,000,000
        int MyGrandPa = 86;
        int MyGrandMa = 75;
        double Chabelo = 13_700_000_001d;
        double Universe = 13_700_000_000d;

        if (MyGrandPa > MyGrandMa) {
            System.out.println("Grand ma is most younger");
        }
        ;
        if ((Chabelo > Universe) && (Universe > MyGrandPa)) {
            System.out.println("Chabelo is a little old than the universe, that is True, not fake");
        }
    }

    public static void TernaryOperator() {
        boolean isRed = false;
        boolean isColor = isRed ? true : false;
        if (isColor) {
            System.out.println("isColor");
        } else {
            System.out.println("is not a color");
        }

    }

    // this method will return data, must be change void keyword for the data type of the returned value
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }
}

