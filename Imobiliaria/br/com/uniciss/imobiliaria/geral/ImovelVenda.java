package br.com.uniciss.imobiliaria.geral;

public class ImovelVenda extends Imovel {

	public double getPreco() {
		return this.dados.getDouble("Pre�o");
	}

	public void setPreco(double preco) {
		this.dados.put("Pre�o", preco);
	}

}