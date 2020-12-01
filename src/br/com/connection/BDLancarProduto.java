package br.com.connection;

import java.sql.ResultSet;

import br.com.domain.model.LancarProdutoModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

//This class is response for management data 

public class BDLancarProduto {
	
	// method for put the data in BD
	
	public void inserindoDados(){
	
	//declare of the connection object and objects for commands of the BD
		
		
	ClaseConexao connectionClass = new ClaseConexao();
	Connection con = connectionClass.getConnection();
	ResultSet rs = null;
	PreparedStatement stmt = null;
	Statement statement = null;
	
	// object Model for get attributes
	LancarProdutoModel lPM = new LancarProdutoModel();

	
	try {
		
		
		
		stmt = (PreparedStatement) con.prepareStatement("insert into lancandoErro(nome_erro,obs_erro,usuario_id_fk,codigo_produto_fk) values (?,?,?,?);");
		
		
		stmt.setString(1, lPM.getNameErro());
		stmt.setString(2, lPM.getObsErro());
		stmt.setInt(3, 1);
		stmt.setString(4, lPM.getCodigoProduto());	
		
	
		stmt.executeUpdate();
		
	} catch (Exception e) {
		System.out.println(e);
		
	} finally {
		ClaseConexao.closeConnection(con, stmt);
	}

	}
	

	
	public void pesquisarIdEmUso(){
		
	}
	
}








