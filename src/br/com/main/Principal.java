package br.com.main;

import br.com.connection.BDLancarErro;
import br.com.connection.ClaseConexao;
import br.com.view.TelaLogin;


public class Principal {
	
	
	public static void main (String [] args){
		
	
		ClaseConexao cx = new ClaseConexao();
		
		if( cx.getConnection() != null){
			System.out.println("thank you God");
			
			TelaLogin tL = new TelaLogin();
			
			tL.TelaLogin();
			
			

			
		}
		else{
			System.out.println("thank you very much God");
		}
		
		
		
	
	
	}
	
	
	

}
