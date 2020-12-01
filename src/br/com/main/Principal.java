package br.com.main;

import br.com.connection.BDLancarProduto;
import br.com.connection.ClaseConexao;


public class Principal {
	
	
	public static void main (String [] args){
		
	
		ClaseConexao cx = new ClaseConexao();
		
		if( cx.getConnection() != null){
			System.out.println("thank you God");
			

			
		}
		else{
			System.out.println("thank you very much God");
		}
		
		
		
	
	
	}
	
	
	

}
