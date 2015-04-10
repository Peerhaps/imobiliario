package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.Scanner;

public class MenuAgendar {
private Scanner entrada;

public void agendarVisita() throws IOException{
	System.out.println("Agenda de Visitas\n"
			+ "1 - Agendar\n"
			+ "2 - Excluir\n"
			+ "3 - Sair\n");
	String opcao;
	CadastroVisita visita = new CadastroVisita();
	do{
		
		entrada = new Scanner(System.in);
		opcao=entrada.nextLine();
		System.out.println("");
		switch (opcao) {
		case "1":
			System.out.println("Agendar");
			
			visita.cadastrarVisita();
			break;

		case "2":
			System.out.println("Excluir agendamento");
			visita.excluirVisita();
			break;
		case "3":
			System.out.println("Sair");
			return;
		default:
			System.out.println("Digite a opção correta");
			break;
		}
		System.out.println("Agenda de Visitas\n"
				+ "1 - Agendar\n"
				+ "2 - Excluir\n"
				+ "3 - Sair\n");
		opcao=entrada.nextLine();
	}while(!(opcao=="3"));
}
}
