import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        // your code goes here
        //math
        int hours = hours2 - hours1;
        int minutes = minutes2 - minutes1;
        int seconds = seconds2 - seconds1;
        seconds = seconds + (hours * 3600) + (minutes * 60);
        //print
        System.out.print(seconds);
        

        // closing the scanner object
        scanner.close();
    }
}