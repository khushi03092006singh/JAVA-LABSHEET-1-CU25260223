class Armstrong {
    static int totalChecks = 0;

    void checkArmstrong(int number) {
        // Local variables
        int original = number;
        int sum = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        totalChecks++;

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");

        System.out.println("Total Checks: " + totalChecks);
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.checkArmstrong(153);
    }
}