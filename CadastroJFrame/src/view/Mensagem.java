package view;

import javax.swing.JOptionPane;

public class Mensagem {

	public static void AdministradorSucess() {
		JOptionPane.showMessageDialog(null, "Administrador validado com sucesso!");
	}
	
	public static void AdministradorError() {
		JOptionPane.showMessageDialog(null, "Administrador inválido.");
	}
	
	public static void UsuarioLoginSucess() {
		JOptionPane.showMessageDialog(null, "Usuário logado com sucesso!");
	}
	
	public static void UsuarioLoginError() {
		JOptionPane.showMessageDialog(null, "Usuário inválido.");
	}
	
	public static void UsuarioSucess() {
		JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
	}
	
	public static void UsuarioError() {
		JOptionPane.showMessageDialog(null, "Erro ao adicionar usuário.");
	}
}
