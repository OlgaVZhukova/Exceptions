package HW1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(firstMethod(3, 0)); // ArithmeticException: / by zero
        
    }

    private static int firstMethod(int a, int b) {
        return a / b;
    }

}
