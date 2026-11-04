
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 extends JFrame implements ActionListener {
    JTextField[] marks = new JTextField[5];
    JLabel result;
    JButton calculate;

    Q4() {
        setTitle("Student Marksheet");
        setLayout(new GridLayout(7, 2, 10, 10));

        String[] subjects = {
            "English", "Mathematics", "Java",
            "DBMS", "Computer Networks"
        };

        for (int i = 0; i < 5; i++) {
            add(new JLabel(subjects[i] + ":"));
            marks[i] = new JTextField();
            add(marks[i]);
        }

        calculate = new JButton("Calculate Result");
        result = new JLabel("Result will appear here");

        add(calculate);
        add(result);

        calculate.addActionListener(this);

        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int total = 0;
            boolean pass = true;

            for (int i = 0; i < 5; i++) {
                int m = Integer.parseInt(marks[i].getText());

                if (m < 0 || m > 100) {
                    JOptionPane.showMessageDialog(this,
                            "Marks must be between 0 and 100");
                    return;
                }

                total += m;

                if (m < 40)
                    pass = false;
            }

            double percentage = total / 5.0;
            String grade;

            if (percentage >= 90)
                grade = "A+";
            else if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else
                grade = "F";

            String status = pass ? "PASS" : "FAIL";

            result.setText("<html>Total: " + total +
                    "<br>Percentage: " + percentage + "%" +
                    "<br>Grade: " + grade +
                    "<br>Status: " + status + "</html>");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid marks");
        }
    }

    public static void main(String[] args) {
        new Q4();
    }
}
