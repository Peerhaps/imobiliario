package br.com.uniciss.imobiliaria.geral;

public class ImovelAluguel extends Imovel {
	
	public String getLocatario() {
		return this.dados.getString("Locat�rio");
	}
	
	public void setLocatario(String nomeLocatario) {
		this.dados.put("Locat�rio", nomeLocatario);
	}
	
	public double getMensalidade() {
		return this.dados.getDouble("Mensalidade");
	}

	public void setMensalidade(double mensalidade) {
		this.dados.put("Mensalidade", mensalidade);
	}

	public String getFimContrato() {
		return this.dados.getString("Fim do contrato");
	}

	public void setFimContrato(String fimContrato) {
		this.dados.put("Fim do contrato", fimContrato);
	}
}
