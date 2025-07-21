import java.util.Scanner;

// Base class for addition and subtraction
public class AddSub {
    int N1, N2;

    public AddSub(int N1, int N2) {
        this.N1 = N1;
        this.N2 = N2;
    }

    int add() {
        return N1 + N2;
    }

    int sub() {
        return N1 - N2;
    }
}

// Subclass for multiplication and division
class MulDiv extends AddSub {

    public MulDiv(int N1, int N2) {
        super(N1, N2); // Correctly calling the superclass constructor
    }

    public int multiply() {
        return N1 * N2;
    }

    public double divide() {
        if (N2 != 0) {
            return (double) N1 / N2;
        } else {
            System.out.println("Number cannot be divided by zero");
            return 0;
        }
    }
}

// Main class to test the program
 class MathOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the two numbers
        System.out.print("Enter first number: ");
        int N1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int N2 = sc.nextInt();

        // Creating an object of MulDiv class
        MulDiv MOp = new MulDiv(N1, N2);

        // Performing and displaying operations
        System.out.println("Addition: " + MOp.add());
        System.out.println("Subtraction: " + MOp.sub());
        System.out.println("Multiplication: " + MOp.multiply());
        System.out.println("Division: " + MOp.divide());
    }
}
