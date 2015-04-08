package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Cliente;
import br.com.uniciss.imobiliaria.util.ValidadorCpf;

public class EditarCliente {

	private static Scanner entrada;
	private static Scanner entrada2;

	public static void editarCliente() throws IOException{
		/*
		 * Classe para editar clientes 
		 */
		System.out.println("Determine o nome do Cliente: ");
	    
		Cliente cliente = new Cliente();
		entrada = new Scanner(System.in);
	
		String nome=entrada.nextLine();
		cliente.existeCliente(nome);
		
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
