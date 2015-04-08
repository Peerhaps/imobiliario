package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Cliente;
import br.com.uniciss.imobiliaria.util.ValidadorCpf;

public class CadastroCliente {
	private static Scanner entrada;
	private static Scanner entrada2;

	public static void main() throws Exception {

		/*
		 * Area para cadastro de clientes que podem ser: Locatário, Locador,
		 * Proprietario ou Comprador..
		 */

		Cliente cliente = new Cliente();
		System.out.println("Determine o nome do Cliente: ");
		entrada = new Scanner(System.in);
		cliente.setNome(entrada.nextLine());

		System.out.println("Determine o CPF do Cliente: ");

		entrada2 = new Scanner(System.in);

		String cpf = entrada2.nextLine();
		while (!ValidadorCpf.validaCpf(cpf)) {
			System.out.println("CPF inválido, informe novamente: ");
			cpf = entrada2.nextLine();
		}

		cliente.setCpf(cpf);

		System.out.println("Determine o RG do Cliente: ");
		cliente.setRg(entrada.nextLine());

		System.out.println("Determine o Telefone do Cliente: ");
		cliente.setTelefone(entrada2.nextLine());

		System.out.println("Determine o Endereço do Cliente: ");
		cliente.setEndereco(entrada.nextLine());

		System.out.println("Determine o numero da conta Bancaria: ");
		cliente.setNumeroContaBancaria(entrada2.nextInt());

		cliente.salvar();

	}
}