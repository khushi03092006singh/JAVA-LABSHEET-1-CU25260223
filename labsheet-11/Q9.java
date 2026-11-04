
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q9 extends JFrame implements ActionListener {
    JTextField name, roll, course;
    JRadioButton[] rating = new JRadioButton[5];
    JCheckBox teaching, lab, material, assignment;
    JTextArea comments;
    JButton submit, reset;

    Q9() {
        setTitle("Student Feedback Form");
        setLayout(new GridLayout(7, 2, 5, 5));

        name = new JTextField();
        roll = new JTextField();
        course = new JTextField();

        add(new JLabel("Student Name:")); add(name);
        add(new JLabel("Roll Number:")); add(roll);
        add(new JLabel("Course:")); add(course);

        String[] rates = {
            "Excellent", "Very Good", "Good", "Average", "Poor"
        };

        JPanel rp = new JPanel();
        ButtonGroup bg = new ButtonGroup();

        for (int i = 0; i < 5; i++) {
            rating[i] = new JRadioButton(rates[i]);
            bg.add(rating[i]);
            rp.add(rating[i]);
        }

        add(new JLabel("Rating:")); add(rp);

        teaching = new JCheckBox("Teaching");
        lab = new JCheckBox("Laboratory");
        material = new JCheckBox("Course Material");
        assignment = new JCheckBox("Assignments");

        JPanel cp = new JPanel();
        cp.add(teaching);
        cp.add(lab);
        cp.add(material);
        cp.add(assignment);

        add(new JLabel("Feedback:")); add(cp);

        comments = new JTextArea(3, 15);
        add(new JLabel("Comments:"));
        add(new JScrollPane(comments));

        submit = new JButton("Submit");
        reset = new JButton("Reset");
        add(submit); add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String r = "Not Selected";

            for (JRadioButton b : rating)
                if (b.isSelected())
                    r = b.getText();

            String f = "";
            if (teaching.isSelected()) f += "Teaching ";
            if (lab.isSelected()) f += "Laboratory ";
            if (material.isSelected()) f += "Course Material ";
            if (assignment.isSelected()) f += "Assignments ";

            JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nRoll: " + roll.getText() +
                "\nCourse: " + course.getText() +
                "\nRating: " + r +
                "\nFeedback: " + f +
                "\nComments: " + comments.getText());
        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            comments.setText("");

            for (JRadioButton b : rating)
                b.setSelected(false);

            teaching.setSelected(false);
            lab.setSelected(false);
            material.setSelected(false);
            assignment.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Q9();
    }
}
