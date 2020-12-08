package br.com.connection;

import java.sql.Connection;
import java.sql.ResultSet;

import br.com.domain.model.LancarErroModel;
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

			String resultset = "select *from tb_usuario where nome_usuario = '"
					+ lm.getUsuario() + "'";

			statement = (Statement) con
					.prepareStatement("select *from tb_usuario");

			rs = statement.executeQuery(resultset);

			while (rs.next()) {
				System.out.println("oi");

				lm.setIdUsuarioL(rs.getLong("id_usuario"));

				System.out.println(lm.getIdUsuarioL());

			}

		} catch (Exception e) {

			System.out.println(e);
		}

		finally {
			ClaseConexao.closeConnection((com.mysql.jdbc.Connection) con,
					statement, rs, stmt);
		}

	}

	public boolean metodoVerificarNome(String nome, String senha) {

		// declare of the connection object and objects for commands of the BD

		ClaseConexao connectionClass = new ClaseConexao();
		Connection con = connectionClass.getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
		Statement statement = null;

		LoginModel lgM = new LoginModel();

		// Declare of the variable for check the attributes it's corrects for
		// Data Center

		boolean FazerCheck = false;

		try {

			// String for execute command SQL
			String forStmt = "SELECT * FROM tb_usuario where nome_usuario = ? and senha_usuario = ?";

			// prepared command SQL for execute and until variable bellow
			stmt = (PreparedStatement) con.prepareStatement(forStmt);

			stmt.setString(1, lgM.getUsuario());
			stmt.setString(2, lgM.getSenha());

			// method for execute the query

			rs = stmt.executeQuery();

			// this if will do while for searching the parameters of the
			// getUsuario and GetSenha

			if (rs.next()) {
				FazerCheck = true;
			}

		} catch (Exception e) {

		}
		// closet the connections with data center

		finally {
			ClaseConexao.closeConnection((com.mysql.jdbc.Connection) con,
					statement, rs, stmt);
		}

		return FazerCheck;
	}

}
