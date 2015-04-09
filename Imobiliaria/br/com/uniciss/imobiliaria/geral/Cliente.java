package br.com.uniciss.imobiliaria.geral;

import java.util.HashSet;
import java.util.Set;

public class Cliente extends Pessoa {

	private Set<Integer> imoveisAluguelVenda = new HashSet<Integer>();
	private Set<Integer> imoveisAlugados = new HashSet<Integer>();
	
	protected String getArquivo() {
		return "clientes.txt";
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
		int chave = Integer.parseInt(imovel.getKey());
		
		if(!this.imoveisAluguelVenda.contains(chave))
			this.imoveisAluguelVenda.add(chave);
	}

	public void removerImovel(Imovel imovel) {
		int chave = Integer.parseInt(imovel.getKey());
		
		if(this.imoveisAluguelVenda.contains(chave))
			imoveisAluguelVenda.remove(chave);
	}

	public void alugarImovel(ImovelAluguel imovel) {

	}
}
