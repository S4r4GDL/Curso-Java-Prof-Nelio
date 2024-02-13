package module_4;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Processamento_De_Dados_Modulo_4{
	
	
	

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel newPanel = new JPanel();
		
		JLabel lbName = new JLabel("Name");
		JLabel lbBirth = new JLabel("Birth");
		JLabel lbHeight = new JLabel("Height");
		JLabel lbWeight  = new JLabel("Weight");
		
		JTextField txtName = new JTextField(null, 20);
		JTextField txtBirth = new JTextField(null, 20);
		JTextField txtHeight = new JTextField(null, 20);
		JTextField txtWeight = new JTextField(null, 20);
		
		JButton btSalvar = new JButton("Gravar");
		JButton btFechar = new JButton("Fechar");
		
		frame.setLayout(new FlowLayout()); 
		
		frame.setTitle("Set your informations");
		
		frame.getContentPane().add(lbName);
		frame.getContentPane().add(txtName);
		frame.getContentPane().add(lbBirth);
		frame.getContentPane().add(txtBirth);
		frame.getContentPane().add(lbHeight);
		frame.getContentPane().add(txtHeight);
		frame.getContentPane().add(lbWeight);
		frame.getContentPane().add(txtWeight);
		
		frame.getContentPane().add(btSalvar);
		frame.getContentPane().add(btFechar);
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add(newPanel);
		frame.setSize(300,200);
		frame.setVisible(true);
		
		
		
		
		
	}
}
