package ru.javabegin.calc.jcomponents;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static final int INIT_WIDTH = 200;
    private static final int INIT_HEIGHT = 200;
    public static final BorderLayout BORDER_LAYOUT = new BorderLayout(2, 2);

    public MainFrame(String title, int width, int height) {
        super(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
//        this.setVisible(true);
    }

    public MainFrame(String title, int width, int height, Component comp) {
        this(title, width, height);
        super.getContentPane().add(comp);
    }
    
    public MainFrame(String title, int width, int height, LayoutManager lm) {
        this(title, width, height);
        super.setLayout(lm);
    }

    public MainFrame(String title) {
        this(title, INIT_WIDTH, INIT_HEIGHT, BORDER_LAYOUT);
    }
}
