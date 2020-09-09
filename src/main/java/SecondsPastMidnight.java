import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int number = scanner.nextInt();

        //Your code goes here
        int hours = 0;
        int minutes = 0;
        if(number > 3600)
        {
          hours = number / 3600;
        }//ends the if statement
        
        if(number > 60)
        {
          minutes = number / 60;
        }//ends the if statement
        System.out.print(hours + " " + minutes);
        // closing the scanner object
        scanner.close();
    }
}