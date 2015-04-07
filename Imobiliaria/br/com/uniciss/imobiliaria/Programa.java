package br.com.uniciss.imobiliaria;


import java.util.Scanner;

import br.com.uniciss.imobiliaria.menus.AreaCorretor;
import br.com.uniciss.imobiliaria.menus.AreaSecretario;
import br.com.uniciss.imobiliaria.menus.MenuAdministrador;

public class Programa {
	//Menu Geral Programa
	public static void main(String[] args) throws Exception {
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
				AreaSecretario.areaSecretario();
				break;
			case "2":
				AreaCorretor.areaCorretor();
				break;
			case "3":
				MenuAdministrador.main(null);
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
