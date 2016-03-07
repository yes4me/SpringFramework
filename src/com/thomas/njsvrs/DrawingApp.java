package com.thomas.njsvrs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		// Triangle triangle = new Triangle();
		// triangle.draw();

		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Basic basic = (Basic) context.getBean("basic");
		System.out.println("Basic: "+ basic.getHeight());

		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

		Square square = (Square) context.getBean("square");
		square.draw();
	}
}
