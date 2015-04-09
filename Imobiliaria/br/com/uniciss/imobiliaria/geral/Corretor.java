package br.com.uniciss.imobiliaria.geral;

public class Corretor extends Secretario {
	public static boolean vender(ImovelVenda imovel, Cliente comprador) {
		return imovel.aVenda() && imovel.excluir();
	}

	public static void alugar(Cliente locatario, ImovelAluguel imovel) {

	}

	@Override
	public String getFuncao() {
		return "corretor";
	}
}
