package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.Scanner;

public class MenuAdministrador {
private static Scanner entrada;
	
	public static void main(String[] args) throws IOException {
		System.out.println("Menu Administrador:\n" + "1 - Cadastrar Corretor\n"
				+ "2 - Cadastrar Secretario\n" + 
				"3 - Sair ");
	

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
				System.out.println("Sair");
		return;
				
			default:
				System.out.println("Informaste o valor errado!");
				break;
			
			}
			//opcao="0";
			opcao=entrada.nextLine();
		}while(!opcao.equals("3"));
		
		
		
		
	}
}


