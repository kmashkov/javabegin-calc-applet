package ru.javabegin.calc.jcomponents;

import javax.swing.*;
import java.awt.*;

public class CalcButton extends JButton {
    public static final int INIT_WIDTH = 100;
    public static final int INIT_HEIGHT = 50;
    public static final Dimension PREFERRED_SIZE = new Dimension(50, 50);

    public CalcButton(String title) {
        super.setText(title);
        super.setSize(INIT_WIDTH, INIT_HEIGHT);
        super.setPreferredSize(PREFERRED_SIZE);
    }

    public CalcButton(String title, int width, int height) {
        this(title);
        super.setSize(width, height);
    }

}
