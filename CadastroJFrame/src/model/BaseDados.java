package model;

import java.util.ArrayList;

public class BaseDados {
	
	private static ArrayList<Pessoa> pessoas;
	
	public static void createBase() {
		inicializarBase();
		Usuario usuario1 = new Usuario("Maria Silva", "833.533.163-34", "F", "mariasilva", "mAriA");
		Usuario usuario2 = new Usuario("João Silva", "833.533.163-34", "M", "joaoSilva", "joaoSilva");
		Usuario usuario3 = new Usuario("Jose Santos", "123.456.789-00", "M", "joseSantos", "joseSantos");
		Administrador adm1 = new Administrador("Jacqueson", "110.717.504-61", "M", "jacqueson", "admin", "ADMIN001");
		Administrador adm2 = new Administrador("Godofredo Silva", "358.251.830-27", "M", "admin", "admin", "ADMIN002");
		adicionarPessoa(adm1);
		adicionarPessoa(adm2);
		adicionarPessoa(usuario1);
		adicionarPessoa(usuario2);
		adicionarPessoa(usuario3);
		listUsuarios();
		
	}
	
	private static void inicializarBase() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	private static Pessoa buscarPessoa(String cpf) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				return pessoa;
			}
		}
		return null;
	}
	
	public static boolean isPessoa(Pessoa pessoa) {
		for (Pessoa p : pessoas) {
			if (p.getCpf().equals(pessoa.getCpf())) {
				if (((Usuario) pessoa).login == null) {
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
	public static boolean isUsuario(String login, String senha) {
		for (Pessoa pessoa : pessoas) {
			Usuario user = ((Usuario) pessoa);
			if (user.getLogin() != null) {
				if (user.getLogin().equals(login) && user.getSenha().equals(senha)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean isUsuario(Usuario usuario) {
		for (Pessoa p : pessoas) {
			if (p.getCpf().equals(((Usuario)usuario).getCpf())) {
				if (((Usuario) usuario).login != null) {
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
	public static boolean isAdmin(String chaveAcesso) {
		for (Pessoa pessoa : pessoas) {
			Administrador adm = (Administrador) pessoa;
			if (adm.getChaveAcesso().equals(chaveAcesso)) {
				return true;
				
			}
		}
		return false;
	}
	
	public static boolean adicionarPessoa(Pessoa pessoa) {
		if (buscarPessoa(pessoa.getCpf()) == null) {
			if (ValidadorCPF.validarCPF(pessoa.getCpf())) {
				if (pessoa instanceof Usuario) {
					Usuario usuario = (Usuario) pessoa;
					pessoas.add(usuario);
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean removerPessoa(Pessoa pessoa) {
		return pessoas.remove(pessoa);
	}
	
	public static ArrayList<String> listPessoas() {
		for (Pessoa pessoa : pessoas) {
			if (isPessoa(pessoa)) {
				System.out.println(pessoa);
			}
		}
		return null;
	}
	
	public static ArrayList<String> listUsuarios() {
		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Usuario) {
				if (isUsuario(((Usuario)pessoa))) {
					System.out.println(pessoa);
				}
			}
		}
		return null;
	}

}
