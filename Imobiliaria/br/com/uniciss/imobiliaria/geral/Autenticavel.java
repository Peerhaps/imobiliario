package br.com.uniciss.imobiliaria.geral;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONObject;

public abstract class Autenticavel extends Pessoa {
	
	public abstract String getFuncao();
	
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
	
	public static List<String> listar(String arquivo, String atributo,
			String funcao) throws IOException {
		JSONObject contas = getDadosConteudo(arquivo);

		List<String> lista = new ArrayList<String>();

		Iterator<String> keys = contas.keys();

		while (keys.hasNext()) {
			String key = keys.next();
			JSONObject oClientes = contas.getJSONObject(key);

			if (oClientes.get("Função").equals("funcao"))
				lista.add(oClientes.getString(atributo));
		}

		return lista;
	}


}
