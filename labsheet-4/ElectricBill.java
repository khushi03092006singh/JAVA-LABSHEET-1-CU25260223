class ElectricBill {
    int units;
    static double fixedCharge = 100;

    void calculateBill() {
        // Local variables
        double rate, energyCharge, totalBill;

        if (units <= 100)
            rate = 5;
        else if (units <= 200)
            rate = 7;
        else
            rate = 10;

        energyCharge = units * rate;
        totalBill = energyCharge + fixedCharge;

        System.out.println("Units: " + units);
        System.out.println("Total Bill: Rs. " + totalBill);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();

        e.units = 150;
        e.calculateBill();
    }
}
