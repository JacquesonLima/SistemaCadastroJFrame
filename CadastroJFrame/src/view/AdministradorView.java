package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class AdministradorView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel chaveAcessoLabel;
	JPasswordField chaveAcessoField;
	JButton validarButton;
	
	public AdministradorView() {
		setTitle("Chave");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(200, 140);
		setResizable(false);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		chaveAcessoLabel = new JLabel("ChaveAcesso");
		
		chaveAcessoField = new JPasswordField(10);
		
		validarButton = new JButton("Validar");
		
		add(chaveAcessoLabel);
		add(chaveAcessoField);
		add(validarButton);
	}

	public JPasswordField getChaveAcessoField() {
		return chaveAcessoField;
	}

	public JButton getValidarButton() {
		return validarButton;
	}
	
}
