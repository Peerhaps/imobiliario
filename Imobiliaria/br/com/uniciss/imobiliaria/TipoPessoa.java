package br.com.uniciss.imobiliaria;

public enum TipoPessoa {
	LOCATOR(0), LOCATARIO(1), PROPRIETARIO(2), COMPRADOR(3);
	
	private final int valor; TipoPessoa(int valorOpcao){
		valor = valorOpcao;
	} 
	
	public int getValor() { 
		return valor;
	}
		
}