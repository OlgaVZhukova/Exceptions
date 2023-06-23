package HW1;

public class Task1 {
    public static void main(String[] args) {
        //System.out.println(firstMethod(3, 0)); // ArithmeticException: / by zero
        // System.out.println(secondMethod()); // NullPointerException: Cannot invoke "String.length()" because "a" is null
        System.out.println(thirdMethod(10, 11, 1)); // ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 10
    }

    /*
    private static int firstMethod(int a, int b) {
        return a / b;
    }
    
    private static int secondMethod() {
        String a = null;
        return a.length();
    }
    */

    private static int[] thirdMethod(int a, int b, int c) {
        int[] arr = new int[a];
        arr[b] = c;
        return arr;
    }

}
