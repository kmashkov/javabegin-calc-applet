package ru.javabegin.calc.jcomponents;

import javax.swing.*;
import java.awt.*;

public class CalcInput extends JTextField {

    public CalcInput(String text, int columns) {
        this(columns);
        super.setText(text);
    }

    public CalcInput(int columns) {
        super.setColumns(columns);
        Font font = new Font("Courier New", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }

    public CalcInput(int columns, Color textColor) {
        super.setColumns(columns);
        Font font = new Font("Courier New", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
    
}
