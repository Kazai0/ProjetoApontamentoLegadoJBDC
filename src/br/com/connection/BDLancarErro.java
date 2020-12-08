package br.com.connection;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.domain.model.LancarErroModel;
import br.com.domain.model.LoginModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

//This class is response for management data 

public class BDLancarErro {

	// method for put the data in BD

	public void inserindoDados() {

		// declare of the connection object and objects for commands of the BD

		ClaseConexao connectionClass = new ClaseConexao();
		Connection con = connectionClass.getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
		Statement statement = null;

		// object Model for get attributes
		LancarErroModel lPM = new LancarErroModel();
		LoginModel lM = new LoginModel();

		
		//box of verification SQL 
		JOptionPane Mensagem = new JOptionPane();
		
		
		// Exception for insert the dates in the Data center

		try {

			stmt = (PreparedStatement) con
					.prepareStatement("insert into lancandoErro(nome_erro,obs_erro,usuario_id_fk,codigo_produto_fk) values (?,?,?,?);");

			// setter parameters in the query SQL

			stmt.setString(1, lPM.getNameErro());
			stmt.setString(2, lPM.getObsErro());
			stmt.setLong(3,lM.getIdUsuarioL());
			stmt.setString(4, lPM.getCodigoProduto());

			// execute the SQL command

			stmt.executeUpdate();
			
			//message for show if SQL it's OK

			Mensagem.showMessageDialog(null, "Erro foi apontado com sucesso");
			
		} catch (Exception e) {
			Mensagem.showMessageDialog(null, e);

		}

		// closet the connections with data center
		finally {
			ClaseConexao.closeConnection(con, stmt);
		}

	}

}
