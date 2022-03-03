package com.sapient.aem.service;

public class Rectangle extends Shape{
	
		private Double length,breath;
		
		public Rectangle() {
			
		}	

		
		public Rectangle(Double length, Double breath) {
			super();
			this.length = length;
			this.breath = breath;
		}

		public Double getLength() {
			return length;
		}


		public void setLength(Double length) {
			this.length = length;
		}


		public Double getBreath() {
			return breath;
		}


		public void setBreath(Double breath) {
			this.breath = breath;
		}


		@Override
		public double area() {		
			return length*breath;
		}

}
