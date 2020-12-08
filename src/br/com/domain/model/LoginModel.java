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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idUsuarioL ^ (idUsuarioL >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginModel other = (LoginModel) obj;
		if (idUsuarioL != other.idUsuarioL)
			return false;
		return true;
	}

	
	

}
