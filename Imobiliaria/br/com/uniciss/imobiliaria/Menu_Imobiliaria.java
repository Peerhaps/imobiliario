package br.com.uniciss.imobiliaria;

import java.util.Scanner;

public class Menu_Imobiliaria {
	//Menu Geral Programa
	public static void main(String[] args) {
		System.out.println("BEM VINDO AO IMOBILIARIA SOFTWARE");
		System.out.println("\n ESCOLHA AS OPÇÕES: "
				+ "1-MENU SECRETARIO\n"
				+ "2-MENU CORRETOR\n"
				+ "3-MENU ADMINISTRADOR\n"
				+ "4-SAIR");
		//Switch com as opcoes de menu;
		Scanner entrada = new Scanner(System.in);
	
		String option = entrada.nextLine();
		do{
			switch (option) {
			case "1":
				
				
				break;

			default:
				break;
			}
			
			
			
			
		}while(!option.equals("7"))
		
	}

}
