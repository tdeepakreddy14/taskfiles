import java.util.Scanner;
public class IntegerParsingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String string = sc.nextLine();// A valid integer as a string
       
        try {
            int number = Integer.parseInt(string);
            System.out.println("Parsed integer: " + number);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
        }
    }
}