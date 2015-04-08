package br.com.uniciss.imobiliaria.geral;

public class ImovelVenda extends Imovel {

	public double getPreco() {
		return this.dados.getDouble("Preço");
	}

	public void setPreco(double preco) {
		this.dados.put("Preço", preco);
	}

}