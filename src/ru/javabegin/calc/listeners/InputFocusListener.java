package ru.javabegin.calc.listeners;

import ru.javabegin.calc.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class InputFocusListener implements FocusListener {
    private JTextField field;

    public InputFocusListener(JTextField field) {
        this.field = field;
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().equals(Calculator.INPUT_NUMBER)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().equals("")) {
            field.setText(Calculator.INPUT_NUMBER);
            field.setForeground(Color.GRAY);
        }
    }

}
