package ru.javabegin.calc.listeners;

import ru.javabegin.calc.Calculator;
import ru.javabegin.calc.operations.CalcOperations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonListener implements ActionListener {
    public static final String ERROR_MESSAGE = "Wrong numbers!";
    private JTextField txtNumberOne;
    private JTextField txtNumberTwo;
    private JTextField txtResult;

    public CalcButtonListener(JTextField txtNumberOne, JTextField txtNumberTwo, JTextField txtResult) {
        this.txtNumberOne = txtNumberOne;
        this.txtNumberTwo = txtNumberTwo;
        this.txtResult = txtResult;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(e.getSource() instanceof JButton)) {
            return;
        }
        JButton btn = (JButton) e.getSource();
        final Double a;
        final Double b;
        try {
            a = Double.parseDouble(txtNumberOne.getText());
            b = Double.parseDouble(txtNumberTwo.getText());
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(btn.getRootPane(), ERROR_MESSAGE);
            return;
        }
        if (btn.getActionCommand().equals(Calculator.ADDITION_TEXT)) {
            txtResult.setText(String.valueOf(CalcOperations.add(a, b)));
        } else if (btn.getActionCommand().equals(Calculator.SUBTRACTION_TEXT)) {
            txtResult.setText(String.valueOf(CalcOperations.subtract(a, b)));
        } else if (btn.getActionCommand().equals(Calculator.MULTIPLICATION_TEXT)) {
            txtResult.setText(String.valueOf(CalcOperations.multiply(a, b)));
        } else if (btn.getActionCommand().equals(Calculator.DIVISION_TEXT)) {
            txtResult.setText(String.valueOf(CalcOperations.divide(a, b)));
        }
    }

}
