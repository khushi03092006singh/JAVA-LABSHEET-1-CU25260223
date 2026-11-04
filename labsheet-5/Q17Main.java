interface Q17Printer {
    void print();
}

interface Q17Scanner {
    void scan();
}

class Q17MultiFunctionMachine implements Q17Printer, Q17Scanner {
    private String machineName;
    private int machineId;

    public void setMachineName(String name) {
        machineName = name;
    }

    public void setMachineId(int id) {
        machineId = id;
    }

    public String getMachineName() {
        return machineName;
    }

    public int getMachineId() {
        return machineId;
    }

    public void print() {
        System.out.println("Printing document.");
    }

    public void scan() {
        System.out.println("Scanning document.");
    }
}

public class Q17Main {
    public static void main(String[] args) {
        Q17MultiFunctionMachine m = new Q17MultiFunctionMachine();

        m.setMachineName("OfficeJet");
        m.setMachineId(101);

        System.out.println("Machine: " + m.getMachineName());
        System.out.println("ID: " + m.getMachineId());

        m.print();
        m.scan();
    }
}
