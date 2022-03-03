package com.sapient.aem.ui;

import com.sapient.aem.service.Circle;
import com.sapient.aem.service.Rectangle;
import com.sapient.aem.service.Shape;

public class ShapeDemo {
	public static void main(String args[]) {
		Shape shape[] = new Shape[2];
		shape[0] = new Circle(5.0);
		shape[1] = new Rectangle(3.0,5.0);
		
		for(Shape s : shape) {
			if( s instanceof Circle) {
				System.out.println("Area of circle="+s.area());
			}else if(s instanceof Rectangle) {
				System.out.println("Area of Rectangle="+s.area());
			}

		}
	}
}
