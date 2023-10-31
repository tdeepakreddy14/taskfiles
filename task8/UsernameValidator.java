import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        try {
        	if(username.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
        		throw new InvalidUsernameException("Invalid username,special characters not allowed ");
        	}
        	System.out.println("username valid");
        } catch(InvalidUsernameException e){
        System.out.println("aerror : "+e.getMessage());
    }
    }  
}
