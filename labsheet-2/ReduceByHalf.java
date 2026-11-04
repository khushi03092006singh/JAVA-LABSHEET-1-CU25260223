public class ReduceByHalf {
    public static void main(String[] args) {

        double number = 100;
        int steps = 0;

        while (number >= 1) {
            number /= 2;
            steps++;
        }

        System.out.println("Final value: " + number);
        System.out.println("Number of steps: " + steps);
    }
}