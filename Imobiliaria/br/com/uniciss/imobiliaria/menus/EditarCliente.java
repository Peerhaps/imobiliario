package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Cliente;
import br.com.uniciss.imobiliaria.util.ValidaCpf;

public class EditarCliente {
	/**
	 * Classe para editar clientes
	 */
	private static Scanner entrada;

	/**
	 * Metodo editarCliente, feito para editar clientes pelo nome
	 * 
	 * @throws IOException
	 */
	public static void editarCliente() throws IOException {

		System.out.println("Determine o nome do Cliente: ");

		Cliente cliente = new Cliente();
		entrada = new Scanner(System.in);

		String nome = entrada.nextLine();
		if (!Cliente.existe("clientes.txt", nome)) {
			System.out.println("Cliente inexistente.");
			return;
		}

		System.out.println("Determine CPF: ");
		/**
		 * Preenchimento do cpf com validação
		 */
		String cpf = entrada.nextLine();
		while (!ValidaCpf.valido(cpf)) {
			System.out.println("CPF inválido, informe novamente: ");
			cpf = entrada.nextLine();
			entrada.nextLine();
		}
		cliente.setCpf(cpf);

		boolean erro = false;
		do {
			try {
				System.out.println("Determine o RG: ");
				/**
				 * Preenchimento do RG com validação para não digitar letras
				 */
				int rg = 0;
				rg = entrada.nextInt();
				entrada.nextLine();
				cliente.setRg(rg);
				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		do {
			try {
				System.out.println("Determine o Telefone: ");
				/**
				 * Preenchimento do TELEFONE com validação para não digitar
				 * letras
				 */
				int telefone = entrada.nextInt();
				cliente.setTelefone(String.valueOf(telefone));

				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		System.out.println("Determine o endereco: ");
		Scanner entrada2 = new Scanner(System.in);
		String endereco = entrada2.nextLine();
		cliente.setEndereco(endereco);

		System.out.println("Determine o numero da conta Bancaria: ");
		String bancario = entrada.nextLine();
		entrada.nextLine();
		cliente.setNumeroContaBancaria(Integer.parseInt(bancario));

		cliente.salvar();
		return;
	}

}
