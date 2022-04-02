package com.Facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepAPI;

public class Facade {
	
	public void migrarCLiente(String nome , String cep) {
		
		String cidade = CepAPI.getInstancia().recuperarCidade();
		String estado = CepAPI.getInstancia().recuperarEstado();
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
