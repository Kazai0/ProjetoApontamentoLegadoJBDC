package br.com.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.connection.BDLancarProduto;
import br.com.domain.model.LancarProdutoModel;

public class TestingBDLancarProduto {

	
	//method of test methods of the classes BDlancarProduto and LancarProdutoModel 
	
	@Test
	public void testingLPMLPBD() {
		LancarProdutoModel lPM = new LancarProdutoModel();
		
		lPM.setCodigoProduto("800.3599.03");
		lPM.setNameErro("Faltando");
		lPM.setObsErro("faltando Parafuso");
		
		BDLancarProduto bdLP = new BDLancarProduto();
		
		bdLP.inserindoDados();
	
		
		
			
	}
	
		
	}
	
	


