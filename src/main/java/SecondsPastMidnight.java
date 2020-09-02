import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        System.out.print("How many seconds has passed since midnight?" + "\n");
        int number = scanner.nextInt();

        //Your code goes here
        int hours = 0;
        int minutes = 0;
        int minutesFull = 0;
        int seconds = 0;
        if(number > 3600)
        {
          hours = number / 3600;
          seconds = number % 3600;
        }//ends the if statement
        
        if(number > 60)
        {
          minutes = number / 60;
          minutesFull = seconds / 60;
          seconds = seconds % 60;
        }//ends the if statement
        System.out.println(hours + " hours has passed since midnight" + "\n\n" + minutes + " minutes has passed since midnight" + "\n\n");
        System.out.print("It is now" + "\n" + hours + " hours, " + minutesFull + " minutes, and " + seconds + " seconds past midnight!");

        // closing the scanner object
        scanner.close();
    }
}