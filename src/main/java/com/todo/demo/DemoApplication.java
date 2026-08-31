package com.todo.demo;

import com.todo.demo.gui.Frame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Frame::new);

		//SpringApplication.run(DemoApplication.class, args);
	}

}
