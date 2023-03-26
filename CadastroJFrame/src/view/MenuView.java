package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.CadastrarController;
import controller.LoginController;

public class MenuView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton loginButton, cadastrarButton, sairButton;
	JFrame cadastro, login, m;
	JLabel imagemLabel;
	
	public MenuView() {
		setTitle("Tela Inicial");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(230, 190);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		m = this;
		
		ImageIcon image = new ImageIcon(getClass().getResource("/logo.png"));
		imagemLabel = new JLabel();
		imagemLabel.setIcon(image);
		add(imagemLabel);
				
		loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == loginButton) {
					if (login == null) {
						login = new LoginView();
						new LoginController(login, m);
						login.setVisible(true);
					} else {
						login.setVisible(true);
						login.setState(JFrame.NORMAL);
					}
				}
			}
		});
		
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == cadastrarButton) {
					if (cadastro == null) {
						cadastro = new CadastrarView();
						new CadastrarController(cadastro);
						cadastro.setVisible(true);
					} else {
						cadastro.setVisible(true);
						cadastro.setState(JFrame.NORMAL);
					}
				}
			}
		});
		
		sairButton = new JButton("Sair");
		sairButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == sairButton) {
					System.exit(EXIT_ON_CLOSE);
				}
			}
		});
		
		
		cadastrarButton.setEnabled(false);
		
		add(loginButton);
		add(cadastrarButton);
		add(sairButton);
		
		setVisible(true);
	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

}
