class InvalidAgeException extends Exception {

InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above for voting.");
        } else {
System.out.println("Eligible for voting.");
        }
    }

    public static void main(String[] args) {

        try {
checkAge(Integer.parseInt(args[0]));
        } 
        catch (InvalidAgeException e) {
System.out.println("Exception caught: " + e.getMessage());
        }

System.out.println("Program continues...");
    }
}
