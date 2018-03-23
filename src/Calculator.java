import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JTextArea textArea1;
    private JButton DELETEButton;
    private JButton div;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton mul;
    private JButton sub;
    private JButton add;
    private JButton point;
    private JButton a0Button;
    private JButton result;
    private JPanel CALCULATOR;
    private JButton CLEARButton;
    private JLabel Label1;

    double num, ans;
    int calculation;

    public void arithmeticOperation() {
        switch (calculation)
        {
            case 1: //Addition
                ans = num + Double.parseDouble(textArea1.getText());
                textArea1.setText(Double.toString(ans));
                break;

            case 2: //Substraction
                ans = num - Double.parseDouble(textArea1.getText());
                textArea1.setText(Double.toString(ans));
                break;

            case 3: //Multiciplation
                ans = num * Double.parseDouble(textArea1.getText());
                textArea1.setText(Double.toString(ans));
                break;

            case 4: //Division
                ans = num / Double.parseDouble(textArea1.getText());
                textArea1.setText(Double.toString(ans));
                break;
        }
    }

    public Calculator() {
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                Label1.setText("Calculation");
            }
        });

        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = textArea1.getText().length();
                int number = textArea1.getText().length() - 1;
                String store;

                if (length > 0)
                {
                    StringBuilder back = new StringBuilder(textArea1.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    textArea1.setText(store);
                }
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textArea1.getText());
                calculation = 4;
                textArea1.setText("");
                Label1.setText(num + "/");
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textArea1.getText());
                calculation = 3;
                textArea1.setText("");
                Label1.setText(num + "x");
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textArea1.getText());
                calculation = 2;
                textArea1.setText("");
                Label1.setText(num + "-");
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textArea1.getText());
                calculation = 1;
                textArea1.setText("");
                Label1.setText(num + "+");
            }
        });
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmeticOperation();
                Label1.setText("Calculation");
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + ".");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "9");
            }
        });
    }

    public JPanel getCALCULATOR() {
        return CALCULATOR;
    }
}
