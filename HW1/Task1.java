package HW1;

public class Task1 {
    public static void main(String[] args) {
        //System.out.println(firstMethod(3, 0)); // ArithmeticException: / by zero
        System.out.println(secondMethod()); // NullPointerException: Cannot invoke "String.length()" because "a" is null

    }

    /*
    private static int firstMethod(int a, int b) {
        return a / b;
    }
    */
    private static int secondMethod() {
        String a = null;
        return a.length();
    }

}
