package br.com.uniciss.imobiliaria;

public class Cliente extends Pessoa {

	/**
	 * Retorna o número da conta bancária de cliente
	 * 
	 * @return int - Conta bancária de cliente.
	 */
	public int getNumeroContaBancaria() {
		return this.dados.getInt("Número da Conta bancária");
	}

	/**
	 * Edita o número da conta bancária de cliente.
	 * 
	 * @param int - Novo número da conta.
	 */
	public void setNumeroContaBancaria(int numeroContaBancaria) {
		this.dados.put("Número da Conta bancária", numeroContaBancaria);
	}

	/**
	 * Função do cliente. Pode ser: Locatário, Locador, Proprietário e Locador.
	 * @return String
	 */
	public String getTipoCliente() {
		return this.dados.getString("Tipo");
	}

	public void setTipo(String tipo) {
		this.dados.put("Tipo", tipo);
	}

}
