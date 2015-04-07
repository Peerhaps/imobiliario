package br.com.uniciss.imobiliaria;

import org.json.JSONObject;

public abstract class Pessoa {

	protected JSONObject dados;
	
	/**
	 * Retorna o nome do cliente.
	 * @return String - Nome do cliente.
	 */
	public String getNome() {
		return this.dados.getString("Nome");
	}

	public void setNome(String nome) {
		this.dados.put("Nome", nome);
	}

	/**
	 * Retorna o CPF do cliente.
	 * @return String - Nome do cliente.
	 */
	public String getCpf() {
		return this.dados.getString("CPF");
	}

	public void setCpf(String cpf) {
		this.dados.put("CPF", cpf);
	}

	public String getRg() {
		return this.dados.getString("Nome");
	}

	public void setRg(String rg) {
		this.dados.put("RG", rg);
	}

	public String getEndereco() {
		return this.dados.getString("Endere�o");
	}

	public void setEndereco(String endereco) {
		this.dados.put("Endere�o", endereco);
	}

	public String getTelefone() {
		return this.dados.getString("Nome");
	}

	public void setTelefone(String telefone) {
		this.dados.put("Telefone", telefone);
	}

	@Override
	public String toString() {
		return this.dados.toString();
	}
}
