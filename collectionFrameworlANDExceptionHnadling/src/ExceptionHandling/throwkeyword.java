package ExceptionHandling;

public class throwkeyword {

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible for voting");
        }
    }

    public static void main(String args[]) {
        try {
            validate(13);
            System.out.println("Rest of the code....");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
    }


		
	}


