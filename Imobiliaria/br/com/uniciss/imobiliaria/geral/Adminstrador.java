package br.com.uniciss.imobiliaria.geral;
public class Adminstrador extends Autenticavel {
	
	public void cadastrarSecretarios(Secretario secretario) {
	}
	
	public void cadastrarCorretor(Corretor corretor) {
	
	}

	@Override
	public String getFuncao() {
		return "admin";
	}
}
