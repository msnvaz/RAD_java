class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    // Division
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public float divide(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Integer Addition: " + calc.add(10, 5));
        System.out.println("Float Addition: " + calc.add(10.5f, 5.5f));

        
    }
}
