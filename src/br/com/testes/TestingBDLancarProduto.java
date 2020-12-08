package br.com.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.connection.BDLancarErro;
import br.com.domain.model.LancarErroModel;

public class TestingBDLancarProduto {

	
	//method of test methods of the classes BDlancarProduto and LancarProdutoModel 
	
	@Test
	public void testingLPMLPBD() {
		LancarErroModel lPM = new LancarErroModel();
		
		lPM.setCodigoProduto("800.3599.03");
		lPM.setNameErro("Faltando");
		lPM.setObsErro("faltando Parafuso");
		
		BDLancarErro bdLP = new BDLancarErro();
		
		bdLP.inserindoDados();
	
		
		
			
	}
	
		
	}
	
	


