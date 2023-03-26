package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel loginLabel, senhaLabel;
	JTextField loginField;
	JPasswordField senhaField;
	JButton entrarButton, sairButton;
	
	public LoginView() {
		setTitle("Login");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(210, 150);
		setResizable(false);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		loginLabel = new JLabel("Login:");
		loginField = new JTextField(10);
		
		senhaLabel = new JLabel("Senha:");
		senhaField = new JPasswordField(10);
		
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(entrarButton);
		add(sairButton);
		
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

}
