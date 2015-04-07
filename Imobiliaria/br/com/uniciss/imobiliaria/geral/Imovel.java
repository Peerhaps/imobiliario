package br.com.uniciss.imobiliaria.geral;

import org.json.JSONArray;
import org.json.JSONObject;

public class Imovel {

	protected JSONObject dados = new JSONObject();

	public String getEndereco() {
		return this.dados.getString("Endere�o");
	}

	public void setEndereco(String endereco) {
		this.dados.put("Endere�o", endereco);
	}

	public double getArea() {
		return this.dados.getDouble("�rea");
	}

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

	public boolean isVendaEAluguel() {
		return this.dados.getBoolean("Venda e aluguel");
	}

	public void setVendaEAluguel(boolean vendaEAluguel) {
		this.dados.put("Venda e aluguel", vendaEAluguel);
	}

}
