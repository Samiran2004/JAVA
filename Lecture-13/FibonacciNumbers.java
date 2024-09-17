public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(findFibonacci(5));
    }

    static int findFibonacci(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }
}
