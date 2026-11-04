public class StoreVisitors {
    public static void main(String[] args) {

        int visitors = 0;
        System.out.println("Visitors before entry: " + visitors);
        visitors++;
        System.out.println("After one visitor enters: " + visitors);
        System.out.println("Next visitor enters: " + ++visitors);
        System.out.println("Visitors before leaving: " + visitors);
        visitors--;
        System.out.println("After one visitor leaves: " + visitors);
        System.out.println("Next visitor leaves: " + --visitors);
    }
}
