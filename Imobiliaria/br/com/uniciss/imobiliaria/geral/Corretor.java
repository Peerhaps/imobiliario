package br.com.uniciss.imobiliaria.geral;

public class Corretor extends Secretario {
	public static boolean vender(Imovel imovel, Cliente comprador) {
		return imovel.aVenda() && imovel.excluir();
	}

	public static boolean alugar(Cliente locatario, Imovel imovel) {
		if(!imovel.aLocacao())
			return false;
		
		imovel.setALocacao(false);
		imovel.setOcupado(false);
		imovel.setLocatario(locatario.getNome());
				
		return imovel.salvar();
	}

	@Override
	public String getFuncao() {
		return "corretor";
	}
}
