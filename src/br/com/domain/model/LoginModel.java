package br.com.domain.model;

public class LoginModel {
	
	static private String usuario;
	static private String senha;
	
	
	public static String getUsuario() {
		return usuario;
	}
	public static void setUsuario(String usuario) {
		LoginModel.usuario = usuario;
	}
	public static String getSenha() {
		return senha;
	}
	public static void setSenha(String senha) {
		LoginModel.senha = senha;
	}
	
	

}
