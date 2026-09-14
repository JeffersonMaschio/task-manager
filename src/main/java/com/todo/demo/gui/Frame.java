package com.todo.demo.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame {

    private final Color bg = new Color(30, 30, 46);
    private final Color fg = new Color(205, 214, 244);


    public Frame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        add(criarTopbar(), BorderLayout.NORTH);
        add(centerPanel(), BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private JToolBar criarTopbar() {
        JToolBar topBar = new JToolBar();
        topBar.setOrientation(JToolBar.HORIZONTAL);
        topBar.setFloatable(false);

        topBar.setBackground(getBg());
        topBar.setPreferredSize(new Dimension(0, 40));

        //---------------------------
        // Exit Button
        JButton exit = new JButton();
        exit.addActionListener(e -> {
            this.dispose();
        });

        Dimension buttonExitSize = new Dimension(30, 30);
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/exit.png"));
        exit.setIcon(icon);
        exit.setText(null);

        exit.setPreferredSize(buttonExitSize);
        exit.setMinimumSize(buttonExitSize);
        exit.setMaximumSize(buttonExitSize);
        exit.setBackground(Color.red);
        exit.setFocusPainted(false);
        topBar.add(Box.createHorizontalGlue());

        //---------------------------

        topBar.add(exit);
        return topBar;
    }

    private JScrollPane centerPanel() {
        JScrollPane centerPanel = new JScrollPane();

        centerPanel.setBackground(getBg());
        centerPanel.setForeground(getFg());

        centerPanel.setBorder(new EmptyBorder(7, 7, 7, 7));

        for (int i = 0; i < 3; i++) {
            JButton but = new JButton();
            but.setAlignmentX(Component.CENTER_ALIGNMENT);
            but.setMaximumSize(new Dimension(100, 60));
            centerPanel.add(but);
        }

        return centerPanel;
    }


    public Color getBg() {
        return bg;
    }

    public Color getFg() {
        return fg;
    }
}
