package br.com.uniciss.imobiliaria.geral;
public abstract class Autenticavel extends Pessoa {
	
	@Override
	public String getArquivo() {
		return "funcionarios.txt";
	}
	
	public String getSenha() {
		return this.dados.getString("Senha");
	}
	
	public void setSenha(String senha) {
		this.dados.put("Senha", senha); 
	}
	
	public void logar(String login, String senha) {
	
	}
}
