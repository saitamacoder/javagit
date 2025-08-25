public class Factorial {
    public static void main(String[] args) {
        int number = 5; 
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Calculating factorial...");
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
// This program calculates the factorial of a given number (5 in this case) and prints the result.