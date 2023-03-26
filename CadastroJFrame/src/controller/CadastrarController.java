package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import model.BaseDados;
import model.Usuario;
import view.CadastrarView;
import view.Mensagem;

public class CadastrarController implements ActionListener {

	CadastrarView cadastro;
	
	public CadastrarController(JFrame cad) {
		cadastro = (CadastrarView) cad;
		cadastro.getEntrarButton().addActionListener(this);
		cadastro.getSairButton().addActionListener(this);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastro.getEntrarButton()) {
			String sexo = "M";
			if (cadastro.getFemininoButton().isSelected()) {
				sexo = "F";
			}
			if (BaseDados.adicionarPessoa(new Usuario(cadastro.getNomeField().getText(), cadastro.getCpfField().getText(), sexo, cadastro.getLoginField().getText(), cadastro.getSenhaField().getText()))) {
				Mensagem.UsuarioSucess();
				BaseDados.listUsuarios();
				cadastro.getNomeField().setText(null);
				cadastro.getCpfField().setText(null);
				cadastro.getButtonGroup().clearSelection();
				cadastro.getLoginField().setText(null);
				cadastro.getSenhaField().setText(null);
			} else {
				Mensagem.UsuarioError();
			}
		}
		if (e.getSource() == cadastro.getSairButton()) {
			cadastro.dispose();
			cadastro.getNomeField().setText(null);
			cadastro.getCpfField().setText(null);
			cadastro.getButtonGroup().clearSelection();
			cadastro.getLoginField().setText(null);
			cadastro.getSenhaField().setText(null);
		}
	}
	
}
