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
	 * @param numeroContaBancaria
	 *            int - Novo n�mero da conta.
	 */
	public void setNumeroContaBancaria(int numeroContaBancaria) {
		this.dados.put("N�mero da Conta banc�ria", numeroContaBancaria);
	}

	/**
	 * Obter a fun��o do cliente. Pode ser: Locat�rio, Locador, Propriet�rio e
	 * Locador.
	 * 
	 * @return String - tipo de cliente. TODO mudar tipo para enum.
	 */
	public String getTipoCliente() {
		return this.dados.getString("Tipo");
	}

	/**
	 * Alterar a fun��o do cliente. Pode ser: Locat�rio, Locador, Propriet�rio e
	 * Comprador.
	 * 
	 * @param tipo
	 *            String - tipo de cliente. TODO mudar tipo para enum.
	 * @throws Exception
	 */
	public void setTipo(String tipo) throws Exception {

		switch (tipo.toLowerCase()) {
		case "locat�rio":
			this.arquivo = "locatarios.json";
			break;
		case "pocador":
			this.arquivo = "locadores.json";
			break;
		case "propriet�rio":
			this.arquivo = "proprietarios.json";
			break;
		case "comprador":
			this.arquivo = "locadores.json";
			break;
		default:
			throw new Exception("Tipo incorreto.");
		}

		this.dados.put("Tipo", tipo);
	}

}
