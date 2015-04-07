package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Corretor;
import br.com.uniciss.imobiliaria.util.ValidadorCpf;

public class CadastroCorretor {
	/*
	 *LOCAL DE PREENCHIMENTO DE CADASTRO DE CORRETOR
	 */
	private static Scanner entrada;
	private static Scanner entrada2;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		entrada2 = new Scanner(System.in);
		Corretor corretor = new Corretor();
		
		
		System.out.println("Determine o nome: ");
		corretor.setNome(entrada.nextLine());
		
		System.out.println("Determine CPF: ");
		String cpf = entrada2.nextLine();
		while (!ValidadorCpf.validaCpf(cpf)) {
			System.out.println("CPF inválido, informe novamente: ");
			cpf = entrada2.nextLine();
		}

		
		System.out.println("Determine o RG: ");
		corretor.setRg(entrada.nextLine());
		
		System.out.println("Determine o Telefone: ");
		corretor.setTelefone(entrada2.nextLine());
		
		System.out.println("Determine o endereco: ");
		corretor.setEndereco(entrada.nextLine());
		
		System.out.println("Determine a Hora de Entrada: ");
		corretor.setHoraDeEntrada(entrada2.nextLine());
		
		System.out.println("Determine a Hora de Saída: ");
		corretor.setHoraDeSaida(entrada.nextLine());
		
		
	}

}
