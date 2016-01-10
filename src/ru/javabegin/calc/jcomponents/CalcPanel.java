package ru.javabegin.calc.jcomponents;

import javax.swing.*;
import java.awt.*;

public class CalcPanel extends JPanel {

    public static final int INIT_WIDTH = 100;
    public static final int INIT_HEIGHT = 100;

    public CalcPanel(String name, int width, int height) {
        super.setName(name);
        super.setSize(width, height);
        this.setBorder(BorderFactory.createEtchedBorder());
    }

    public CalcPanel(String name, int width, int height, Component comp) {
        this(name, width, height);
        super.add(comp);

    }

    public CalcPanel(String name, int width, int height, LayoutManager layout) {
        this(name, width, height);
        super.setLayout(layout);
    }

    public CalcPanel(String name, int width, int height, LayoutManager layout, Component comp) {
        this(name, width, height);
        super.setLayout(layout);
        super.add(comp);
    }

    public CalcPanel(String name) {
        this(name, INIT_WIDTH, INIT_HEIGHT);
    }

}
