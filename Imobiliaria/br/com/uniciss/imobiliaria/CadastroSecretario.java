package br.com.uniciss.imobiliaria;

import java.util.Scanner;

public class CadastroSecretario {
	/*
	 * LOCAL DE PREENCHIMENTO DE CADASTRO DE SECRETARIO;
	 */
private static Scanner entrada;
private static Scanner entrada2;

public static void main(String[] args) {
	Secretario secretario = new Secretario();
	entrada = new Scanner(System.in);
	entrada2 = new Scanner(System.in);
	
	
	
	System.out.println("Determine o nome: ");
	secretario.setNome(entrada.nextLine());
	
	System.out.println("Determine CPF: ");
	secretario.setCpf(entrada2.nextLine());
	
	System.out.println("Determine o RG: ");
	secretario.setRg(entrada.nextLine());
	
	System.out.println("Determine o Telefone: ");
	secretario.setTelefone(entrada2.nextLine());
	
	System.out.println("Determine o endereco: ");
	secretario.setEndereco(entrada.nextLine());
	
	System.out.println("Determine a Hora de Entrada: ");
	secretario.setHoraDeEntrada(entrada2.nextLine());
	
	System.out.println("Determine a Hora de Saída: ");
	secretario.setHoraDeSaida(entrada.nextLine());
	
	
}
}
