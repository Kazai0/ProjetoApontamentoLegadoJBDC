package br.com.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.connection.BDLogin;
import br.com.domain.model.LoginModel;

public class TestingBDLogin {

	//Verification and validation of the method "metodoVerificarNome"  of Class BDLogin  
	
	@Test
	public void VerificarFuncionalidadeMetodo() {

		//Creation the objects 
		
		LoginModel lgM = new LoginModel();
		BDLogin bdL = new BDLogin();
		
		//setter attributes of the Class 'LoginModel'
		
		lgM.setUsuario("Tatiane");
		lgM.setSenha("jesus");

	
		// Condition for verification if method will return true if sentences has true and return false if it's false this method;

		if (bdL.metodoVerificarNome(lgM.getUsuario(), lgM.getSenha()) == true) {

			System.out.println("methos it is ok");
		}

		else {
			System.out.println("method is down ");
		}

		
		
	}
	
	
	
	// this test it's for verification if method VerificadaDados of the class BDlogin it's OK.
	
	@Test
	public void metodoVerificarDados() {

	LoginModel  lgM = new LoginModel();
	BDLogin bDL = new BDLogin(); 
	
	
	lgM.setUsuario("Tatiane");
	
	bDL.VerificandoDados();
	
		
		
	}
		
}
