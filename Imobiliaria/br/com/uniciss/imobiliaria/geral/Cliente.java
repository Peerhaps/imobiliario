package br.com.uniciss.imobiliaria.geral;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONObject;

import br.com.uniciss.imobiliaria.util.IO;

public class Cliente extends Pessoa {

	private List<Imovel> imoveisAluguelVenda;
	private List<ImovelAluguel> imoveisAlugados;

	public Cliente() {
		this.arquivo = "clientes.txt";
	}

	public static boolean existeCliente(String nome) throws IOException {
		List<String> nomes = listarClientes();
		return nomes.contains(nome);
	}

	public static List<String> listarClientes() throws IOException {
		String clientesString = IO.getConteudoDoArquivo("clientes.txt");
		JSONObject clientes = new JSONObject(clientesString);

		List<String> lista = new ArrayList<String>();

		Iterator<String> keys = clientes.keys();

		while (keys.hasNext()) {
			String key = keys.next();
			//clientes.getJSONObject(key)
			//lista.add((clientes.get(key)));
		}

		return lista;
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
