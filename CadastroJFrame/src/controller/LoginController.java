package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.BaseDados;
import view.AdministradorView;
import view.LoginView;
import view.Mensagem;
import view.MenuView;

public class LoginController implements ActionListener {

	MenuView menu;
	BaseDados base;
	LoginView login;
	AdministradorView adm;
	
	public LoginController(JFrame log, JFrame men) {
		login = (LoginView) log;
		menu = (MenuView) men;
		login.getEntrarButton().addActionListener(this);
		login.getSairButton().addActionListener(this);
	}

	@SuppressWarnings({ "deprecation"})
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == login.getEntrarButton()) {
			String log = login.getLoginField().getText().toString();
			String pass = login.getSenhaField().getText().toString();
			if ((BaseDados.isUsuario(log, pass) && (pass.equals("admin")))) {
				login.getLoginField().setText(null);
				login.getSenhaField().setText(null);
				new AdminstradorController(adm, menu);
				login.dispose();
			}
			else if (BaseDados.isUsuario(log, pass)) {
				login.getLoginField().setText(null);
				login.getSenhaField().setText(null);
				login.dispose();
				Mensagem.UsuarioLoginSucess();
			} else {
				Mensagem.UsuarioLoginError();
			}
		}

		if (e.getSource() == login.getSairButton()) {
			login.dispose();
			login.getLoginField().setText(null);
			login.getSenhaField().setText(null);
		}
	}
	
}
