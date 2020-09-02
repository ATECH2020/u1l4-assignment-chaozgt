import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println("How many students in the first class?");
        int classA = scanner.nextInt() + 1;
        System.out.println("How many students in the seconds class?");
        int classB = scanner.nextInt() + 1;
        System.out.println("How many students in the third class?");
        int classC = scanner.nextInt() + 1;
        
        //your code goes here
        int desks = classA / 2 + classB / 2 + classC / 2;
        System.out.println("The school needs " + desks + " desks.");
        // closing the scanner object
        scanner.close();
    }
}