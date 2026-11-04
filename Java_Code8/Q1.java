
import java.awt.*;
import java.awt.event.*;

public class Q1 extends Frame implements ActionListener {
    TextField name, roll, course;
    Checkbox male, female;
    Choice semester;
    Button submit, reset;

    Q1() {
        setTitle("Student Registration Form");
        setLayout(new GridLayout(7, 2, 10, 10));

        name = new TextField();
        roll = new TextField();
        course = new TextField();

        male = new Checkbox("Male");
        female = new Checkbox("Female");

        CheckboxGroup gender = new CheckboxGroup();
        male.setCheckboxGroup(gender);
        female.setCheckboxGroup(gender);

        semester = new Choice();
        for (int i = 1; i <= 8; i++)
            semester.add("Semester " + i);

        submit = new Button("Submit");
        reset = new Button("Reset");

        add(new Label("Student Name:")); add(name);
        add(new Label("Roll Number:")); add(roll);
        add(new Label("Course:")); add(course);
        add(new Label("Gender:"));
        Panel p = new Panel();
        p.add(male); p.add(female);
        add(p);
        add(new Label("Semester:")); add(semester);
        add(submit); add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = male.getState() ? "Male" :
                       female.getState() ? "Female" : "Not Selected";

            System.out.println("Name: " + name.getText());
            System.out.println("Roll: " + roll.getText());
            System.out.println("Course: " + course.getText());
            System.out.println("Gender: " + g);
            System.out.println("Semester: " + semester.getSelectedItem());
        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            male.setState(false);
            female.setState(false);
            semester.select(0);
        }
    }

    public static void main(String[] args) {
        new Q1();
    }
}
