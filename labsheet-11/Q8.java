
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Q8 extends JFrame implements ActionListener {
    JTextArea area;
    JFileChooser chooser;
    File file;

    JMenuItem newFile, open, save, exit;

    Q8() {
        setTitle("Simple Notepad");
        area = new JTextArea();
        chooser = new JFileChooser();

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("File");

        newFile = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        menu.add(newFile);
        menu.add(open);
        menu.add(save);
        menu.add(exit);
        bar.add(menu);

        setJMenuBar(bar);
        add(new JScrollPane(area));

        newFile.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == newFile) {
                area.setText("");
                file = null;
            }

            else if (e.getSource() == open) {
                if (chooser.showOpenDialog(this) ==
                    JFileChooser.APPROVE_OPTION) {

                    file = chooser.getSelectedFile();
                    BufferedReader br =
                        new BufferedReader(new FileReader(file));

                    area.setText("");
                    String line;

                    while ((line = br.readLine()) != null)
                        area.append(line + "\n");

                    br.close();
                }
            }

            else if (e.getSource() == save) {
                if (file == null) {
                    if (chooser.showSaveDialog(this) !=
                        JFileChooser.APPROVE_OPTION)
                        return;

                    file = chooser.getSelectedFile();
                }

                FileWriter fw = new FileWriter(file);
                fw.write(area.getText());
                fw.close();

                JOptionPane.showMessageDialog(this,
                    "File Saved Successfully");
            }

            else if (e.getSource() == exit) {
                System.exit(0);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                "File Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Q8();
    }
}
