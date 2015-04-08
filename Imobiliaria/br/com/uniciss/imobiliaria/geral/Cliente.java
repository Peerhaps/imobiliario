package br.com.uniciss.imobiliaria.geral;

import java.util.List;

public class Cliente extends Pessoa {

	private List<Imovel> imoveisAluguelVenda;
	private List<ImovelAluguel> imoveisAlugados;
	
	public Cliente() {
		this.arquivo = "clientes.txt";
	}
	
	public boolean existeCliente(String nome) {
		return false;
	}
	
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
	
	public void adicionarImovel(Imovel imovel) {
		
	}
	
	public void removerImovel(Imovel imovel) {
		
	}
	
	public void alugarImovel(ImovelAluguel imovel) {
		
	}
}
