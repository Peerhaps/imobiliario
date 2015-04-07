package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

public class MenuCadastrarSecretario {
private static Scanner entrada;
	
	public static void main(String[] args) {
		System.out.println("Menu Cadastro de Secretario:\n" + "1 - Cadastrar\n"
				+ "2 - Listar\n" + "3 - Alterar\n" + "4 - Excluir\n"
				+ "5 - Voltar ao menu anterior  ");
	

		String opcao="";
		entrada = new Scanner(System.in);
		opcao=entrada.nextLine();
		
		
		
		do{
			switch (opcao){
			case "1":
				System.out.println("Cadastrar novo Secretario");
				CadastroSecretario.main(null);
			break;
			
			case "2":
				System.out.println("Listar Secretario");
				
			break;
			
			case "3":
				System.out.println("Alterar Secretario");
				
			break;
				
			case "4":
				System.out.println("Excluir Secretario");
				
				break;
				
			case "5":
				System.out.println("Voltar ao menu anterior");
				return;
			default:
				System.out.println("Informaste o valor errado!");
				break;
			
			}
			opcao="0";
			opcao=entrada.nextLine();
		}while(!opcao.equals("5"));
		
		
		
		
	}
}



