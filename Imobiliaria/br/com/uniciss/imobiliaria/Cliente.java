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
	 * @param numeroContaBancaria
	 *            int - Novo número da conta.
	 */
	public void setNumeroContaBancaria(int numeroContaBancaria) {
		this.dados.put("Número da Conta bancária", numeroContaBancaria);
	}

	/**
	 * Obter a função do cliente. Pode ser: Locatário, Locador, Proprietário e
	 * Locador.
	 * 
	 * @return String - tipo de cliente. TODO mudar tipo para enum.
	 */
	public String getTipoCliente() {
		return this.dados.getString("Tipo");
	}

	/**
	 * Alterar a função do cliente. Pode ser: Locatário, Locador, Proprietário e
	 * Comprador.
	 * 
	 * @param tipo
	 *            String - tipo de cliente. TODO mudar tipo para enum.
	 * @throws Exception
	 */
	public void setTipo(String tipo) throws Exception {

		switch (tipo.toLowerCase()) {
		case "locatário":
			this.arquivo = "locatarios.json";
			break;
		case "pocador":
			this.arquivo = "locadores.json";
			break;
		case "proprietário":
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
