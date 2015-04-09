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
