
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q10 extends JFrame implements ActionListener {
    JTextField acc, name, balance, amount;
    JButton deposit, withdraw, check, clear;

    Q10() {
        setTitle("Mini Banking Application");
        setLayout(new GridLayout(6, 2, 10, 10));

        acc = new JTextField();
        name = new JTextField();
        balance = new JTextField("1000");
        amount = new JTextField();

        balance.setEditable(false);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        check = new JButton("Check Balance");
        clear = new JButton("Clear");

        add(new JLabel("Account Number:")); add(acc);
        add(new JLabel("Customer Name:")); add(name);
        add(new JLabel("Current Balance:")); add(balance);
        add(new JLabel("Amount:")); add(amount);

        add(deposit); add(withdraw);
        add(check); add(clear);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        check.addActionListener(this);
        clear.addActionListener(this);

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            acc.setText("");
            name.setText("");
            amount.setText("");
            return;
        }

        try {
            double b = Double.parseDouble(balance.getText());

            if (e.getSource() == check) {
                JOptionPane.showMessageDialog(this,
                    "Current Balance: " + b);
                return;
            }

            double a = Double.parseDouble(amount.getText());

            if (a <= 0) {
                JOptionPane.showMessageDialog(this,
                    "Amount must be positive");
                return;
            }

            if (e.getSource() == deposit) {
                b += a;
                JOptionPane.showMessageDialog(this,
                    "Amount Deposited Successfully");
            }

            else if (e.getSource() == withdraw) {
                if (a > b) {
                    JOptionPane.showMessageDialog(this,
                        "Insufficient Balance");
                    return;
                }

                b -= a;
                JOptionPane.showMessageDialog(this,
                    "Amount Withdrawn Successfully");
            }

            balance.setText(String.valueOf(b));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Enter valid amount");
        }
    }

    public static void main(String[] args) {
        new Q10();
    }
}
