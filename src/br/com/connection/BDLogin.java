package br.com.connection;

import java.sql.Connection;
import java.sql.ResultSet;

import br.com.domain.model.LancarProdutoModel;
import br.com.domain.model.LoginModel;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

//This class is response for management data's Login

public class BDLogin {

	// method for put the verification login's users

	public void VerificandoDados() {

		// declare of the connection object and objects for commands of the BD

		ClaseConexao connectionClass = new ClaseConexao();
		Connection con = connectionClass.getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
		Statement statement = null;

		LoginModel lm = new LoginModel();

		try {

			String resultset = "select *from tb_usuario = '" + lm.getUsuario()
					+ "'";

		} catch (Exception e) {

			// TODO: handle exception
		}

	}

	public boolean metodoVerificarNome(String nome, String senha) {

		// declare of the connection object and objects for commands of the BD
		
		ClaseConexao connectionClass = new ClaseConexao();
		Connection con = connectionClass.getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
		Statement statement = null;
		
		
		try {
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		return true;
	}

}
