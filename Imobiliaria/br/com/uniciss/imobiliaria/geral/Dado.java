package br.com.uniciss.imobiliaria.geral;

import java.io.IOException;

import org.json.JSONObject;

import br.com.uniciss.imobiliaria.util.IO;

public abstract class Dado {

	protected JSONObject dados = new JSONObject();
	protected String arquivo;

	/**
	 * Retorna o nome do dado.
	 * 
	 * @return String - Nome do dado.
	 */
	public String getNome() {
		return this.dados.getString("Nome");
	}

	/**
	 * Edita o nome do dado.
	 * 
	 * @param nome
	 *            String - Novo nome.
	 */
	public void setNome(String nome) {
		this.dados.put("Nome", nome);
	}

	/**
	 * Grava os dados do objeto.
	 * 
	 * @return boolean Gravação feita com sucesso?
	 */
	public boolean salvar() {
		try {
			String conteudo = IO.getConteudoDoArquivo(this.arquivo);
			JSONObject registros = new JSONObject(conteudo);

			registros.put(this.getNome(), this.dados);

			IO.setConteudoDoArquivo(this.arquivo, registros.toString());

			return true;
		} catch (IOException e) {
			return false;
		}
	}

}
