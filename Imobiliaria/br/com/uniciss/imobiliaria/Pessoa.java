package br.com.uniciss.imobiliaria;

import java.io.IOException;

import org.json.JSONObject;

import br.com.uniciss.imobiliaria.util.IO;

public abstract class Pessoa {

	protected JSONObject dados;
	protected String arquivo;
	
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
		return this.dados.getString("Endereço");
	}

	public void setEndereco(String endereco) {
		this.dados.put("Endereço", endereco);
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
	
	/*
	 * 
	 */
	public boolean salvar() {
		try {
			String conteudo = IO.getConteudoDoArquivo(this.arquivo);
			JSONObject registros = new JSONObject(conteudo);
			
			registros.put(this.getNome(), this.dados);
			
			return true;
		} catch(IOException e) {
			return false;
		}
	}
}
