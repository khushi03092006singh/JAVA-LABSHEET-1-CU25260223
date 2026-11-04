public class SkipPerfectSquares {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
