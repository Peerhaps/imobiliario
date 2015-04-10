package br.com.uniciss.imobiliaria.geral;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.uniciss.imobiliaria.util.IO;
import br.com.uniciss.imobiliaria.util.RegistroInexistente;

public class Imovel extends Dado {

	private int id = -1;
	
	public String getProprietario() {
		return this.dados.getString("Propriet�rio");
	}
	
	public void setProprietario(String nomeProprietario) {
		this.dados.put("Propriet�rio", nomeProprietario);
	}

	@Override
	public boolean salvar() {
		if (id < 0) {
			try {
				String conteudo = IO.getConteudoDoArquivo(this.getArquivo());
				JSONObject registros = new JSONObject(conteudo);
				this.id = registros.length();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}

		return super.salvar();
	}

	@Override
	protected String getArquivo() {
		return "imoveis.txt";
	}

	protected String getKey() {
		return String.valueOf(id);
	}
	
	public void setKey(int key) {
		this.id = key;
	}

	/**
	 * Retorna o endere�o do im�vel.
	 * 
	 * @return String - Endere�o do im�vel.
	 */
	public String getEndereco() {
		return this.dados.getString("Endere�o");
	}

	/**
	 * Edita o endere�o do im�vel
	 * 
	 * @param endereco
	 *            String - Novo endere�o.
	 */
	public void setEndereco(String endereco) {
		this.dados.put("Endere�o", endereco);
	}

	/***
	 * Retorna a �rea total do im�vel.
	 * 
	 * @return double �rea do im�vel
	 */
	public double getArea() {
		return this.dados.getDouble("�rea");
	}

	/***
	 * Editar �rea do im�vel.
	 * 
	 * @param area
	 *            area �rea do im�vel
	 */
	public void setArea(double area) {
		this.dados.put("�rea", area);
	}

	public String getTipo() {
		return this.dados.getString("Tipo");
	}

	public void setTipo(String tipo) {
		this.dados.put("Tipo", tipo);
	}

	public int getNumeroDeQuartos() {
		return this.dados.getInt("N�mero de quartos");
	}

	public void setNumeroDeQuartos(int numeroDeQuartos) {
		this.dados.put("N�mero de quartos", numeroDeQuartos);
	}

	public int getNumeroDeBanheiros() {
		return this.dados.getInt("N�mero de banheiros");
	}

	public void setNumeroDeBanheiros(int numeroDeBanheiros) {
		this.dados.put("N�mero de banheiros", numeroDeBanheiros);
	}

	public boolean isTemGaragem() {
		return this.dados.getBoolean("Tem garagem");
	}

	public void setTemGaragem(boolean temGaragem) {
		this.dados.put("Tem garagem", temGaragem);
	}

	public String getContrato() {
		return this.dados.getString("Contrato");
	}

	public void setContrato(String contrato) {
		this.dados.put("Contrato", contrato);
	}

	public boolean getOcupado() {
		return this.dados.getBoolean("Ocupado");
	}

	public void setOcupado(boolean ocupado) {
		this.dados.put("Ocupado", ocupado);
	}

	public JSONArray getVisitasAgendadas() {
		return this.dados.getJSONArray("Visitas agendadas");
	}

	public void setVisitasAgendadas(JSONArray visitasAgendadas) {
		this.dados.put("Venda e aluguel", visitasAgendadas);
	}
	
	public boolean agendarVisita(String nomeCliente, int dia, int mes, int ano) {
		
		
		return true;
	}

	public boolean aVenda() {
		return this.dados.getBoolean("A venda");
	}

	public void setAVenda(boolean aVenda) {
		this.dados.put("A venda", aVenda);
	}

	public boolean aLocacao() {
		return this.dados.getBoolean("A loca��o");
	}

	public void setALocacao(boolean aLocacao) {
		this.dados.put("A loca��o", aLocacao);
	}
	
	public static List<String> listarImoveis()
			throws IOException {
		JSONObject contas = getDadosConteudo("imoveis.txt");

		List<String> lista = new ArrayList<String>();

		Iterator<String> keys = contas.keys();

		while (keys.hasNext()) {
			String key = keys.next();
			JSONObject oClientes = contas.getJSONObject(key);
			lista.add(key + " " + oClientes.getString("Endere�o"));
		}

		return lista;
	}
	
	@Override
	public boolean excluir() {
		try {
			if(!this.existe())
				throw new RegistroInexistente();
			
			JSONObject contas = getDadosConteudo(this.getArquivo());
			contas.remove(this.getKey());
			IO.setConteudoDoArquivo(getArquivo(), contas.toString());

			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
	public boolean existe(){
		try {
			this.dados = getDadosConteudo(getArquivo()).getJSONObject(getKey());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
