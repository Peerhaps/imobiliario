package br.com.uniciss.imobiliaria.geral;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.uniciss.imobiliaria.util.IO;
import br.com.uniciss.imobiliaria.util.RegistroInexistente;

public abstract class Dado {

	protected JSONObject dados = new JSONObject();

	protected abstract String getKey();

	protected abstract String getArquivo();

	/**
	 * Grava os dados do objeto.
	 * 
	 * @return boolean Gravação feita com sucesso?
	 * @throws IOException
	 */
	public boolean salvar() {
		try {
			JSONObject contas = getDadosConteudo(this.getArquivo());

			contas.put(this.getKey(), this.dados);

			IO.setConteudoDoArquivo(this.getArquivo(), contas.toString());

			return true;
		} catch (IOException e) {
			return false;
		}
	}

	/**
	 * Checa se há registro o registro com a chave "nome".
	 * 
	 * @param arquivo
	 *            String - Arquivo a ser verificado.
	 * @param nome
	 *            String - valor da chave.
	 * @return boolean - o registro existe no arquivo?
	 * @throws IOException
	 */
	public static boolean existe(String arquivo, String nome)
			throws IOException {
		List<String> nomes = listar(arquivo);
		return nomes.contains(nome);
	}

	public static List<String> listar(String arquivo, String atributo)
			throws IOException {
		JSONObject contas = getDadosConteudo(arquivo);

		List<String> lista = new ArrayList<String>();

		Iterator<String> keys = contas.keys();

		while (keys.hasNext()) {
			String key = keys.next();
			JSONObject oClientes = contas.getJSONObject(key);
			lista.add(oClientes.getString(atributo));
		}

		return lista;
	}

	public static List<String> listar(String arquivo) throws IOException {
		return listar(arquivo, "Nome");
	}

	public boolean excluir() {
		try {
			if (!existe(getArquivo(), getKey()))
				throw new RegistroInexistente();

			JSONObject contas = getDadosConteudo(this.getArquivo());
			contas.remove(this.getKey());
			IO.setConteudoDoArquivo(getArquivo(), contas.toString());

			return true;
		} catch (IOException e) {
			return false;
		}
	}

	protected static JSONObject getDadosConteudo(String arquivo)
			throws IOException {
		String contas = IO.getConteudoDoArquivo(arquivo);
		return new JSONObject(contas);
	}

	public boolean carregar() {
		try {
			this.dados = getDadosConteudo(getArquivo()).getJSONObject(getKey());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
