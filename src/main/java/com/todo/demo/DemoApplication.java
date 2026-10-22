package com.todo.demo;

import com.formdev.flatlaf.FlatDarkLaf;
import com.todo.demo.gui.Frame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//FlatDarkLaf.setup();

		//SwingUtilities.invokeLater(Frame::new);

		SpringApplication.run(DemoApplication.class, args);
	}

}
