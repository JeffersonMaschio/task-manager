package com.todo.demo.gui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());


        setResizable(false);
        setVisible(true);
    }

    private JToolBar criarSidebar() {
        JToolBar sidebar = new JToolBar();
        sidebar.setOrientation(JToolBar.VERTICAL);
        sidebar.setFloatable(false);
        return sidebar;
    }





}
