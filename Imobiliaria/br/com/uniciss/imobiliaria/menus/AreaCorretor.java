package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

public class AreaCorretor {
	public static void areaCorretor() {
		System.out.println("BEM VINDO A ÁREA DO CORRETOR");
		System.out.println("\n ESCOLHA AS OPÇÕES: "
				+ "1-Menu Cliente\n"
				+ "2-Receber Mensalidade\n"
				+ "3-Menu Imóveis\n"
				+ "4-Agendar Visitas\n"
				+ "6-Vender Imóvel\n"
				+ "7-Alugar Imóvel\n"
				+ "8-Sair");
		//Switch com as opcoes de menu;
		Scanner entrada = new Scanner(System.in);
	
		String option = entrada.nextLine();
		do{
			switch (option) {
			case "1":
				
				break;
			case "2":
				
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;	
			case "6":
				
				break;
			case "7":
				
				break;
			case "8":
				
			default:
				System.out.println("OPÇÃO ERRADA!");
				break;
			}
		}while(!option.equals("8"));
		
	}
}
