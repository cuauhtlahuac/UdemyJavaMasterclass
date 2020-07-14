package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double twenty = 20.00;
	    double eighty = 80.00;

	    double myValueTotal = (twenty + eighty) * 100.00;
        System.out.println(myValueTotal);
	    double myReminder =  myValueTotal % 40.00;
        System.out.println(myReminder);
	    boolean isZero = myReminder == 0 ? true : false;

        System.out.println("result is: " + isZero);

        if(!isZero){
            System.out.println("Got some reminder");;
        }
    }
}
