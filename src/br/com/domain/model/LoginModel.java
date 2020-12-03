package br.com.domain.model;

public class LoginModel {
	
	static private String usuario;
	static private String senha;
	
	static private long idUsuarioL;
	
	
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
	public static long getIdUsuarioL() {
		return idUsuarioL;
	}
	public static void setIdUsuarioL(long idUsuarioL) {
		LoginModel.idUsuarioL = idUsuarioL;
	}
	
	
	

}
