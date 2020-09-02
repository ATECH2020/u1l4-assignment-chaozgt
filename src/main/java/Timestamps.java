import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.print("How many hours for your first timestamp?");
        int hours1 = scanner.nextInt();
        System.out.print("How many minutes for your first timestamp?");
        int minutes1 = scanner.nextInt();
        System.out.print("How many seconds for your first timestamp?");
        int seconds1 = scanner.nextInt();
        System.out.print("How many hours for your second timestamp?");
        int hours2 = scanner.nextInt();
        System.out.print("How many minutes for your second timestamp?");
        int minutes2 = scanner.nextInt();
        System.out.print("How many seconds for your second timestamp?");
        int seconds2 = scanner.nextInt();

        // your code goes here
        //math
        int hours = hours2 - hours1;
        int minutes = minutes2 - minutes1;
        int seconds = seconds2 - seconds1;
        seconds = seconds + (hours * 3600) + (minutes * 60);
        //print
        System.out.println("So far, it has been " + seconds + " seconds between both timestamps");
        

        // closing the scanner object
        scanner.close();
    }
}