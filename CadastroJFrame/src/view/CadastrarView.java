package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastrarView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel nomeLabel, cpfLabel, loginLabel, senhaLabel;
	JPasswordField senhaField;
	JTextField nomeField, cpfField, loginField;
	MaskFormatter cpfFormatter;
	JRadioButton masculinoButton, femininoButton;
	ButtonGroup buttonGroup;
	JButton entrarButton, sairButton;
	
	public CadastrarView() {
		setTitle("Cadastro");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(200, 240);
		setResizable(false);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		nomeLabel = new JLabel("Nome:");
		nomeField = new JTextField(10);
		
		loginLabel = new JLabel("Login:");
		loginField = new JTextField(10);
		
		cpfLabel = new JLabel("CPF:");
		try {
			cpfFormatter = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cpfField = new JFormattedTextField(cpfFormatter);
		cpfField.setPreferredSize(new Dimension(124, 28));
		
		senhaLabel = new JLabel("Senha:");
		senhaField = new JPasswordField(10);
		
		masculinoButton = new JRadioButton("Masculino");
		femininoButton = new JRadioButton("Feminino");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(masculinoButton);
		buttonGroup.add(femininoButton);
		
		entrarButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		add(nomeLabel);
		add(nomeField);
		add(loginLabel);
		add(loginField);
		add(cpfLabel);
		add(cpfField);
		add(senhaLabel);
		add(senhaField);
		add(masculinoButton);
		add(femininoButton);
		add(entrarButton);
		add(sairButton);
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JRadioButton getMasculinoButton() {
		return masculinoButton;
	}

	public JRadioButton getFemininoButton() {
		return femininoButton;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}
	
}
