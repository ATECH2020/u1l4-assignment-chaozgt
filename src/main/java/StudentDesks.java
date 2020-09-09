import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt() + 1;
        int classB = scanner.nextInt() + 1;
        int classC = scanner.nextInt() + 1;
        
        //your code goes here
        int desks = classA / 2 + classB / 2 + classC / 2;
        System.out.print(desks);
        // closing the scanner object
        scanner.close();
    }
}