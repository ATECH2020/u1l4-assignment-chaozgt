import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int Input = scanner.nextInt();

        //your code goes here
        int minuteHand = Input * 12;
        while(minuteHand > 360)
        {
          minuteHand = minuteHand - 360;
        }//ends the while loop

        System.out.print(minuteHand);

        // closing the scanner object
        scanner.close();
    }
}