class StringReverse {
    static int totalReversals = 0;

    void reverseString(String str) {
       
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        totalReversals++;

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse);
        System.out.println("Total Reversals: " + totalReversals);
    }

    public static void main(String[] args) {
        StringReverse s = new StringReverse();
        s.reverseString("Hello");
    }
}
