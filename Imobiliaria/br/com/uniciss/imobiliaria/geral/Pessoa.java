package br.com.uniciss.imobiliaria.geral;

public abstract class Pessoa extends Dado {
 
	@Override
	protected String getKey() {
		return this.getNome();
	}
	
	/**
	 * Retorna o nome do dado.
	 * 
	 * @return String - Nome do dado.
	 */
	public String getNome() {
		return this.dados.getString("Nome");
	}

	/**
	 * Edita o nome do dado.
	 * 
	 * @param nome
	 *            String - Novo nome.
	 */
	public void setNome(String nome) {
		this.dados.put("Nome", nome);
	}
	
	/**
	 * Retorna o CPF do cliente.
	 * 
	 * @return String - Nome do cliente.
	 */
	public String getCpf() {
		return this.dados.getString("CPF");
	}

	/**
	 * Edita o CPF do cliente.
	 * 
	 * @param cpf
	 *            String - Novo CPF.
	 */
	public void setCpf(String cpf) {
		this.dados.put("CPF", cpf);
	}

	/**
	 * Retorna o RG do cliente.
	 * 
	 * @return Int - RG do cliente.
	 */
	public int getRg() {
		return this.dados.getInt("RG");
	}

	/**
	 * Edita o RG do cliente.
	 * 
	 * @param rg
	 *            String - Novo RG.
	 */
	public void setRg(int rg) {
		this.dados.put("RG", rg);
	}

	/**
	 * Retorna o endereço do cliente.
	 * 
	 * @return String - Endereço do cliente.
	 */
	public String getEndereco() {
		return this.dados.getString("Endereço");
	}

	/**
	 * Edita o endereço do cliente
	 * 
	 * @param endereco
	 *            String - Novo endereço.
	 */
	public void setEndereco(String endereco) {
		this.dados.put("Endereço", endereco);
	}

	/**
	 * Retorna o telefone do cliente.
	 * 
	 * @return String - Nome do cliente.
	 */
	public String getTelefone() {
		return this.dados.getString("Nome");
	}

	/**
	 * Edita o telefone do cliente.
	 * 
	 * @param telefone
	 *            String - Novo telefone.
	 */
	public void setTelefone(String telefone) {
		this.dados.put("Telefone", telefone);
	}

	@Override
	public String toString() {
		return this.dados.toString();
	}
}
