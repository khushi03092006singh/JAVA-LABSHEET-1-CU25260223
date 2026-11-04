
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q7 extends JFrame implements ActionListener {
    JTextField temp;
    JRadioButton cToF, fToC;
    JButton convert, clear;
    JLabel result;

    Q7() {
        setTitle("Temperature Converter");
        setLayout(new GridLayout(4, 2, 10, 10));

        temp = new JTextField();
        cToF = new JRadioButton("Celsius to Fahrenheit");
        fToC = new JRadioButton("Fahrenheit to Celsius");

        ButtonGroup bg = new ButtonGroup();
        bg.add(cToF);
        bg.add(fToC);
        cToF.setSelected(true);

        convert = new JButton("Convert");
        clear = new JButton("Clear");
        result = new JLabel("Result:");

        add(new JLabel("Temperature:")); add(temp);
        add(cToF); add(fToC);
        add(convert); add(clear);
        add(result);

        convert.addActionListener(this);
        clear.addActionListener(this);

        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            temp.setText("");
            result.setText("Result:");
            return;
        }

        try {
            double t = Double.parseDouble(temp.getText());
            double r;

            if (cToF.isSelected())
                r = (t * 9 / 5) + 32;
            else
                r = (t - 32) * 5 / 9;

            result.setText("Result: " + r);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Enter a valid temperature");
        }
    }

    public static void main(String[] args) {
        new Q7();
    }
}

