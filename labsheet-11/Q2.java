
import java.awt.*;
import java.awt.event.*;

public class Q2 extends Frame implements ActionListener {
    TextField t1, t2, result;
    Button add, sub, mul, div;

    Q2() {
        setTitle("Simple Calculator");
        setLayout(new GridLayout(5, 2, 10, 10));

        t1 = new TextField();
        t2 = new TextField();
        result = new TextField();
        result.setEditable(false);

        add = new Button("Addition");
        sub = new Button("Subtraction");
        mul = new Button("Multiplication");
        div = new Button("Division");

        add(new Label("First Number:")); add(t1);
        add(new Label("Second Number:")); add(t2);
        add(new Label("Result:")); add(result);
        add(add); add(sub);
        add(mul); add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(350, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double r = 0;

            if (e.getSource() == add)
                r = a + b;
            else if (e.getSource() == sub)
                r = a - b;
            else if (e.getSource() == mul)
                r = a * b;
            else if (e.getSource() == div) {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                r = a / b;
            }

            result.setText(String.valueOf(r));
        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new Q2();
    }
}
