public class StudentAverage {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 75, 90},
            {65, 70, 85},
            {90, 88, 95}
        };
        int total = 0;
        int count = 0;
        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }
        double average = (double) total / count;
        System.out.println("Average marks: " + average);
    }
}
