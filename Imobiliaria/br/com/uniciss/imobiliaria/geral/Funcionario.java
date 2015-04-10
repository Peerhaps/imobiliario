package br.com.uniciss.imobiliaria.geral;

public class Funcionario extends Dado {

	public void setNome(String nome) {
		this.dados.put("Nome", nome);
	}
	
	public String getSenha() {
		return this.dados.getString("Senha");
	}

	@Override
	protected String getKey() {
		return this.dados.getString("Nome");
	}

	@Override
	protected String getArquivo() {
		return "funcionarios.txt";
	}
	
	public String getFuncao() {
		return this.dados.getString("Função");
	}

}
