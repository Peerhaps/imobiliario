package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

public class AreaCorretor {
	public static void areaCorretor() {
		System.out.println("BEM VINDO A �REA DO CORRETOR");
		System.out.println("\n ESCOLHA AS OP��ES: "
				+ "1-Menu Cliente\n"
				+ "2-Receber Mensalidade\n"
				+ "3-Menu Im�veis\n"
				+ "4-Agendar Visitas\n"
				+ "6-Vender Im�vel\n"
				+ "7-Alugar Im�vel\n"
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
				System.out.println("OP��O ERRADA!");
				break;
			}
		}while(!option.equals("8"));
		
	}
}
