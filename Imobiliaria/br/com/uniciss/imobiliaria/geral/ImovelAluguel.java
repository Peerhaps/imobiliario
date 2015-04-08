package br.com.uniciss.imobiliaria.geral;

public class ImovelAluguel extends Imovel {
	
	public ImovelAluguel() {
		this.arquivo = "imoveis_aluguel.txt";
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
