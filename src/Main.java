import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner for user input
        // Display a menu with D, R, and I
        // Ask the user to enter their party affiliation
        // If they enter D, display Democratic Donkey
        // Else if they enter R, display Republican Elephant
        // Else if they enter I, display Independent Person
        // Otherwise, display Other

        Scanner in = new Scanner(System.in);

        String choice = "";

        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");

        choice = in.nextLine();

        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}
