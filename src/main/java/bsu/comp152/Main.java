package bsu.comp152;

public class Main {

    public static void main(String[] args) {

        System.out.println("Countdown!");
        // Initialize the loop variable(s).
        int number = -1;
        // It is possible to have a while loop
        // that is not entered even once.
        while (number >= 0) {
            System.out.println(number);
            // Update a loop variable in the body
            // of the while.
            number--;
        }
        System.out.println("Blastoff!");

        System.out.println("Countdown!");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Blastoff!");

        System.out.println("Countdown!");
        // Initialize the loop variable(s).
        number = 10;
        // The body of do-while is executed
        // at least once.
        do {
            System.out.println(number);
            // Update a loop variable in the body
            // of the do-while.
            number--;
        } while (number >= 0);

        System.out.println("Blastoff!");

        int day = 0;
        switch (day) {
            case 0:
                System.out.println("Sun");
                // What happens in case 0 without break?!
                // break;
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}
