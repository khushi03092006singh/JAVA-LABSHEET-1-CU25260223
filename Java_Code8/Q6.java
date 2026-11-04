
import java.awt.*;
import java.awt.event.*;

public class Q6 extends Frame implements ActionListener {
    TextField id, name, dept, designation, salary;
    Checkbox male, female;
    Choice department;
    TextArea output;
    Button submit, clear;

    Q6() {
        setTitle("Employee Registration");
        setLayout(new GridLayout(9, 2, 5, 5));

        id = new TextField();
        name = new TextField();
        dept = new TextField();
        designation = new TextField();
        salary = new TextField();

        CheckboxGroup cg = new CheckboxGroup();
        male = new Checkbox("Male", cg, false);
        female = new Checkbox("Female", cg, false);

        department = new Choice();
        department.add("HR");
        department.add("IT");
        department.add("Finance");
        department.add("Sales");

        output = new TextArea();
        submit = new Button("Submit");
        clear = new Button("Clear");

        add(new Label("Employee ID:")); add(id);
        add(new Label("Name:")); add(name);
        add(new Label("Department:")); add(dept);
        add(new Label("Designation:")); add(designation);
        add(new Label("Salary:")); add(salary);

        Panel g = new Panel();
        g.add(male); g.add(female);
        add(new Label("Gender:")); add(g);

        add(new Label("Department Selection:"));
        add(department);

        add(submit); add(clear);
        add(new Label("Submitted Information:"));
        add(output);

        submit.addActionListener(this);
        clear.addActionListener(this);

        setSize(500, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = male.getState() ? "Male" : "Female";

            output.setText("Employee ID: " + id.getText() +
                "\nName: " + name.getText() +
                "\nDepartment: " + dept.getText() +
                "\nDesignation: " + designation.getText() +
                "\nSalary: " + salary.getText() +
                "\nGender: " + g +
                "\nSelected Department: " +
                department.getSelectedItem());
        } else {
            id.setText("");
            name.setText("");
            dept.setText("");
            designation.setText("");
            salary.setText("");
            male.setState(false);
            female.setState(false);
            department.select(0);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Q6();
    }
}
