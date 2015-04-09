package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

public class MenuAgendar {
public void agendarVisita(){
	System.out.println("Agenda de Visitas\n"
			+ "1 - Agendar\n"
			+ "2 - Editar Agenda\n"
			+ "3 - Excluir\n");
	String opcao;
	do{
		
		Scanner entrada = new Scanner(System.in);
		opcao=entrada.nextLine();
		System.out.println("");
		switch (opcao) {
		case "1":
			System.out.println("Agendar");
			break;

		case "2":
			System.out.println("Editar agenda");
			break;
		case "3":
			System.out.println("Excluir agendamento");
			break;
		case "4":
			System.out.println("Sair");
		default:
			System.out.println("Digite a opção correta");
			break;
		}
		
	}while(!(opcao=="4"));
}
}
