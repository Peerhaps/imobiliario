package br.com.uniciss.imobiliaria;

public class Cliente extends Pessoa {

	/**
	 * Retorna o n�mero da conta banc�ria de cliente
	 * 
	 * @return int - Conta banc�ria de cliente.
	 */
	public int getNumeroContaBancaria() {
		return this.dados.getInt("N�mero da Conta banc�ria");
	}

	/**
	 * Edita o n�mero da conta banc�ria de cliente.
	 * 
	 * @param int - Novo n�mero da conta.
	 */
	public void setNumeroContaBancaria(int numeroContaBancaria) {
		this.dados.put("N�mero da Conta banc�ria", numeroContaBancaria);
	}

	/**
	 * Fun��o do cliente. Pode ser: Locat�rio, Locador, Propriet�rio e Locador.
	 * @return String
	 */
	public String getTipoCliente() {
		return this.dados.getString("Tipo");
	}

	public void setTipo(String tipo) {
		this.dados.put("Tipo", tipo);
	}

}
