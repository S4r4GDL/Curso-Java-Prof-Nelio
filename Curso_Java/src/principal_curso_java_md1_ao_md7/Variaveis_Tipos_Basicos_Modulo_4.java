package principal_curso_java_md1_ao_md7;

import javax.swing.JOptionPane;

public class Variaveis_Tipos_Basicos_Modulo_4 {

	public static void main(String[] args) {
		
		
		
		String name;
		
		Double height;
		
		char gender;
		
		float weight;
		
		Integer age;
		
		Object[] genders = {"Female", "Male", "Non-Binary", "Queer", "Others"};
		
		
		name = JOptionPane.showInputDialog("Your name:");
		
		age = Integer.valueOf(JOptionPane.showInputDialog("Your age:"));
		
		height = Double.valueOf(JOptionPane.showInputDialog("Your height \n(Format -> xx.xx):"));
		
		weight = Float.parseFloat(JOptionPane.showInputDialog("Your weight \n(Format -> xx.xx):"));
		
		gender = (JOptionPane.showInputDialog(null,
		          "Your gender", "Gender",
	              JOptionPane.INFORMATION_MESSAGE, null,
	              genders, genders [0])).toString().charAt(0); 
		
		
		Double imc = imcCalculator(height, weight);
		
		JOptionPane.showMessageDialog(
				null, "Your name: " + name + 
				"\nYour age: " + age.toString() +
				"\nYour height: " + height.toString() +
				"\nYour weight: " + String.valueOf(weight) +
				"\nYour gender: " + String.valueOf(gender) +
				"\nYour imc: " + String.format("%.3f", imc)+
				"\nThank you for your time!",
				"\nYour personal informations",
				JOptionPane.INFORMATION_MESSAGE);
		
		

	}

	
	private static Double imcCalculator(Double height, float weight) {

		return weight/(Math.pow(height, 2));
		
	}
}
