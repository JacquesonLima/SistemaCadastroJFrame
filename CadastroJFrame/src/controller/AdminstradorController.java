package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.BaseDados;
import view.AdministradorView;
import view.LoginView;
import view.Mensagem;
import view.MenuView;

public class AdminstradorController {
	
	MenuView menu;
	JFrame frame;
	AdministradorView administrador;
	LoginView login;

	public boolean usuarioLogado = false;

	public AdminstradorController(JFrame frame, JFrame men) {
		administrador = (AdministradorView) frame;
		menu = (MenuView) men;
		administrador = new AdministradorView();
		administrador.setVisible(true);
		
		administrador.getValidarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == administrador.getValidarButton()) {
					@SuppressWarnings("deprecation")
					String senha = administrador.getChaveAcessoField().getText().toString();
					if (BaseDados.isAdmin(senha)  ) {
						Mensagem.AdministradorSucess();
						usuarioLogado = true;
						administrador.getChaveAcessoField().setText(null);
						administrador.dispose();
						menu.getCadastrarButton().setEnabled(true);
					} else {
						Mensagem.AdministradorError();
					}
				}
			}
		});
		
	}
	
}
