package principal_curso_java_md8_ao_md16;

public class Triangle {
	
	public double a, b, c;

	public double perimeter() {
		return a + b + c;
	}
	
	public double area() {
		
		double p = (a + b + c)/2.0;
		double result = Math.sqrt( p * (p - a) * (p - b) * (p - c));
		return result;
		
	}
}

