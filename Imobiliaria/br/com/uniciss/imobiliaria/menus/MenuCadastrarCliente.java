package br.com.uniciss.imobiliaria.menus;

import java.util.List;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Cliente;

public class MenuCadastrarCliente {
	private static Scanner entrada;

	public static void main(String[] args) throws Exception {
		System.out.println("Menu Cadastro de Clientes:\n" + "1 - Cadastrar\n"
				+ "2 - Listar\n" + "3 - Alterar\n" + "4 - Excluir\n"
				+ "5 - Voltar ao menu anterior  ");

		String opcao = "";
		entrada = new Scanner(System.in);
		opcao = entrada.nextLine();

		/**
		 * Menu para cadastrar, listar, alterar e excluir cliente Secretario e
		 * Corretor tem acesso ao mesmo
		 */
		do {
			switch (opcao) {
			case "1":
				System.out.println("Cadastrar novo Cliente");
				CadastroCliente.main();

				break;

			case "2":
				System.out.println("Listar Cliente");

				List<String> clientes = Cliente.listar("clientes.txt");

				if (clientes.size() == 0)
					System.out.println("Não há clientes cadastrados");
				else {
					for (String c : clientes) {
						System.out.println("Nome: " + c);
					}
				}
				break;

			case "3":
				System.out.println("Alterar Cliente");
				EditarCliente.editarCliente();
				break;

			case "4":
				System.out.print("Nome do cliente: ");
				Cliente cliente = new Cliente();
				cliente.setNome(entrada.nextLine());
				
				cliente.excluir();


				break;

			case "5":
				System.out.println("Voltar ao menu anterior");
				return;
			default:
				System.out.println("Informaste o valor errado!");
				break;

			}
			System.out.println("Menu Cadastro de Secretario:\n" + "1 - Cadastrar\n"
					+ "2 - Listar\n" + "3 - Alterar\n" + "4 - Excluir\n"
					+ "5 - Voltar ao menu anterior  ");
			opcao = entrada.nextLine();
		} while (!opcao.equals("5"));

	}
}
