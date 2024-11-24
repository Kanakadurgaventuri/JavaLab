// User-defined exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class
public class Main{
    public static void main(String[] args) {
        int age = -10;  // Invalid age to trigger exception

        try {
            // Simulate a check for invalid age
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative: " + age);
            }

            System.out.println("Age is valid: " + age);
        }
        // Catching the user-defined InvalidAgeException
        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());  // Print the exception message
        }
        // Catching any other unforeseen exceptions
        catch (Exception e) {
            System.out.println("An unexpected error occurred");
        }
        finally {
            // This will always run, whether an exception occurs or not
            System.out.println("End of exception handling.");
        }
    }
}
