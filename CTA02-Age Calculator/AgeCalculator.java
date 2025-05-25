import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class AgeCalculator extends JFrame {
    private JTextField birthYearField;
    private JLabel resultLabel;

    public AgeCalculator() {
        setTitle("Age Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        birthYearField = new JTextField("Enter birth year (e.g., 1990)");
        JButton calculateButton = new JButton("Calculate Age");
        resultLabel = new JLabel("Age will appear here");

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int birthYear = Integer.parseInt(birthYearField.getText());
                    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                    int age = currentYear - birthYear;
                    if (age >= 0 && age <= 150) {
                        resultLabel.setText("Your age is: " + age);
                    } else {
                        resultLabel.setText("Invalid age");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Enter a valid year");
                }
            }
        });

        panel.add(birthYearField);
        panel.add(calculateButton);
        panel.add(resultLabel);
        add(panel);
    }

    public static void main(String[] args) {
        new AgeCalculator().setVisible(true);
    }
}