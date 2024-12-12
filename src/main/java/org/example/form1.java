package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JButton sumarButton;
    private JTextField textField2;
    private JLabel label1;
    private JLabel label2;
    public JPanel mainPanel;
    private JLabel lblTotal;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;

    public form1() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(textField1.getText());
                Double n2 = Double.parseDouble(textField2.getText());
                lblTotal.setText(String.valueOf(n1+n2));
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(textField1.getText());
                Double n2 = Double.parseDouble(textField2.getText());
                lblTotal.setText(String.valueOf(n1-n2));
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(textField1.getText());
                Double n2 = Double.parseDouble(textField2.getText());
                lblTotal.setText(String.valueOf(n1*n2));
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double n1 = Double.parseDouble(textField1.getText());
                Double n2 = Double.parseDouble(textField2.getText());
                lblTotal.setText(String.valueOf(n1/n2));
            }
        });
    }
}
