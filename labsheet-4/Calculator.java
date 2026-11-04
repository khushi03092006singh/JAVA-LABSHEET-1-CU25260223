class Calculator {
    static int operationsCount = 0;

    int add(int a, int b) {
        int result = a + b;    
        operationsCount++;
        return result;
    }

    int subtract(int a, int b) {
        int result = a - b;
        operationsCount++;
        return result;
    }

    int multiply(int a, int b) {
        int result = a * b;
        operationsCount++;
        return result;
    }

    double divide(int a, int b) {
        double result = (double) a / b;
        operationsCount++;
        return result;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Add: " + c.add(10, 5));
        System.out.println("Subtract: " + c.subtract(10, 5));
        System.out.println("Multiply: " + c.multiply(10, 5));
        System.out.println("Divide: " + c.divide(10, 5));

        System.out.println("Total Operations: " + operationsCount);
    }
}
