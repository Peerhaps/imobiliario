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
	
	public void adicionarImovel(Imovel imovel) {
		
	}
	
	public void removerImovel(Imovel imovel) {
		
	}
	
	public void alugarImovel(ImovelAluguel imovel) {
		
	}
}
