package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.Programa;

public class MenuAdministrador {
private static Scanner entrada;
	
	public static void main(String[] args) throws Exception {
		System.out.println("Menu Administrador:\n" + "1 - Cadastrar Corretor\n"
				+ "2 - Cadastrar Secretario\n" + 
				"3 - Menu Secretario\n"
				+ "4 - Menu Corretor\n"
				+ "5 - Sair\n ");
	

		String opcao="";
		entrada = new Scanner(System.in);
		opcao=entrada.nextLine();
		
		
		
		do{
			switch (opcao){
			case "1":
				System.out.println("Cadastrar novo Corretor");
				MenuCadastrarCorretor.main(null);
				
			break;
			
			case "2":
				System.out.println("Cadastrar Secretario");
				MenuCadastrarSecretario.main(null);
			break;
			
			case "3":
				System.out.println("Menu Secretario");
				AreaSecretario.areaSecretario();
				break;
			case "4":
				System.out.println("Menu Corretor");
				AreaCorretor.areaCorretor();
				break;
			case "5":
				System.out.println("Sair");
				System.out.println();
				Programa.main(null);
				
			default:
				System.out.println("Informaste o valor errado!");
				break;
			
			}
			//opcao="0";
			opcao=entrada.nextLine();
		}while(!opcao.equals("5"));
		
		
		
		
	}
}


