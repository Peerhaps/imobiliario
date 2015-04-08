package br.com.uniciss.imobiliaria.geral;

import java.io.IOException;

import org.json.JSONObject;

import br.com.uniciss.imobiliaria.util.IO;

public abstract class Pessoa {

	protected JSONObject dados = new JSONObject();
	protected String arquivo;
	
	/**
	 * Retorna o nome do cliente.
	 * @return String - Nome do cliente.
	 */
	public String getNome() {
		return this.dados.getString("Nome");
	}

	/**
	 * Edita o nome do cliente.
	 * @param nome String - Novo nome.
	 */
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

	/**
	 * Edita o CPF do cliente.
	 * @param cpf String - Novo CPF.
	 */
	public void setCpf(String cpf) {
		this.dados.put("CPF", cpf);
	}

	/**
	 * Retorna o RG do cliente.
	 * @return String - RG do cliente.
	 */
	public String getRg() {
		return this.dados.getString("Nome");
	}
	
	/**
	 * Edita o RG do cliente.
	 * @param rg String - Novo RG.
	 */
	public void setRg(String rg) {
		this.dados.put("RG", rg);
	}
	
	/**
	 * Retorna o endereço do cliente.
	 * @return String - Endereço do cliente.
	 */
	public String getEndereco() {
		return this.dados.getString("Endereço");
	}

	public void setEndereco(String endereco) {
		this.dados.put("Endereço", endereco);
	}

	/**
	 * Retorna o telefone do cliente.
	 * @return String - Nome do cliente.
	 */
	public String getTelefone() {
		return this.dados.getString("Nome");
	}

	/**
	 * Edita o telefone do cliente.
	 * @param telefone String - Novo telefone.
	 */
	public void setTelefone(String telefone) {
		this.dados.put("Telefone", telefone);
	}

	@Override
	public String toString() {
		return this.dados.toString();
	}
	
	/**
	 * Grava os dados do objeto.
	 * @return boolean Gravação feita com sucesso?
	 */
	public boolean salvar() {
		try {
			String conteudo = IO.getConteudoDoArquivo(this.arquivo);
			JSONObject registros = new JSONObject(conteudo);
			
			registros.put(this.getNome(), this.dados);
			
			IO.setConteudoDoArquivo(this.arquivo, registros.toString());
			
			return true;
		} catch(IOException e) {
			return false;
		}
	}
}
