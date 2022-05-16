package padraoFacade;

import padraoFacade.subsistema1.crm.CrmService;
import padraoFacade.subsistema2.crm.CepApi;

public class Facade {

	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
