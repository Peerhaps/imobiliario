package br.com.uniciss.imobiliaria;


import java.util.Scanner;

public class Programa {
	//Menu Geral Programa
	public static void main(String[] args) {
		System.out.println("BEM VINDO AO IMOBILIARIA SOFTWARE");
		System.out.println("\n ESCOLHA AS OPÇÕES:\n"
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
			case "2":
				
				break;
			case "3":
				
				break;
			case "4":
				break;
			default:
				System.out.println("OPÇÃO ERRADA!");
				break;
			}
			
			
			
			
		}while(!option.equals("4"));
		
	}

}
