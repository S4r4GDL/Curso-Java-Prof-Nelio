package module_8;

public class Rectangle {
	
	double weight;
	double height;
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getArea() {
		return height * weight;
	}
	
	public double getPerimeter() {
		return height + weight + height + weight;
	}
	
	public double getDiagonal() {
		return Math.sqrt( Math.pow(weight, 2) + Math.pow(height, 2));
	}

}
