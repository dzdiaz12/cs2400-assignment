public class Calculator{
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        int sum = myCalculator.add(5, 3);
        System.out.println("The sum is: " + sum);

        int difference = myCalculator.subtract(5, 3);
        System.out.println("The difference is: " + difference);
    }
}