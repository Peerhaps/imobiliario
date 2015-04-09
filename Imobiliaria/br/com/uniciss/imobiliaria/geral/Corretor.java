package br.com.uniciss.imobiliaria.geral;


public class Corretor extends Secretario {
	public static void vender(ImovelVenda imovel, Cliente comprador) {
		
		
		
		imovel.excluir();
	}

	public static void alugar(Cliente locatario, ImovelAluguel imovel) {

	}
	
	@Override
	public String getFuncao() {
		return "corretor";
	}
}
