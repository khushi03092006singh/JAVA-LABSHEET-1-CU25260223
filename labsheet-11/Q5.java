
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q5 extends JFrame implements ActionListener {
    JTextField name;
    JComboBox<String> course;
    JRadioButton male, female;
    JCheckBox java, dbms, networking;
    JButton submit, reset;

    Q5() {
        setTitle("Course Selection Form");
        setLayout(new GridLayout(6, 2, 10, 10));

        name = new JTextField();
        course = new JComboBox<>(new String[]{
            "BCA", "BBA", "B.Tech", "MCA"
        });

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        java = new JCheckBox("Java");
        dbms = new JCheckBox("DBMS");
        networking = new JCheckBox("Networking");

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        add(new JLabel("Student Name:")); add(name);
        add(new JLabel("Course:")); add(course);

        JPanel gender = new JPanel();
        gender.add(male);
        gender.add(female);
        add(new JLabel("Gender:")); add(gender);

        JPanel subjects = new JPanel();
        subjects.add(java);
        subjects.add(dbms);
        subjects.add(networking);
        add(new JLabel("Subjects:")); add(subjects);

        add(submit); add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = male.isSelected() ? "Male" :
                       female.isSelected() ? "Female" : "Not Selected";

            String s = "";
            if (java.isSelected()) s += "Java ";
            if (dbms.isSelected()) s += "DBMS ";
            if (networking.isSelected()) s += "Networking ";

            JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nCourse: " + course.getSelectedItem() +
                "\nGender: " + g +
                "\nSubjects: " + s);
        } else {
            name.setText("");
            course.setSelectedIndex(0);
            male.setSelected(false);
            female.setSelected(false);
            java.setSelected(false);
            dbms.setSelected(false);
            networking.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Q5();
    }
}

