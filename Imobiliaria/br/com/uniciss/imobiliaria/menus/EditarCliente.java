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
	private static Scanner entrada2;

	/**
	 * Metodo editarCliente, feito para editar clientes pelo nome 
	 * @throws IOException
	 */
	public static void editarCliente() throws IOException{
		
		System.out.println("Determine o nome do Cliente: ");
	    
		Cliente cliente = new Cliente();
		entrada = new Scanner(System.in);
	
		String nome=entrada.nextLine();
		if(!Cliente.existe("clientes.txt", nome)) {
			System.out.println("Cliente inexistente.");
			return;
		}
		
		System.out.println("Determine o CPF do Cliente: ");

		entrada2 = new Scanner(System.in);

		String cpf = entrada2.nextLine();
		while (!ValidaCpf.valido(cpf)) {
			System.out.println("CPF inv�lido, informe novamente: ");
			cpf = entrada2.nextLine();
		}

		cliente.setCpf(cpf);

		System.out.println("Determine o RG do Cliente: ");
		cliente.setRg(entrada.nextInt());

		System.out.println("Determine o Telefone do Cliente: ");
		cliente.setTelefone(entrada2.nextLine());

		System.out.println("Determine o Endere�o do Cliente: ");
		cliente.setEndereco(entrada.nextLine());

		System.out.println("Determine o numero da conta Bancaria: ");
		cliente.setNumeroContaBancaria(entrada2.nextInt());

		cliente.salvar();

	}
	
	
}
