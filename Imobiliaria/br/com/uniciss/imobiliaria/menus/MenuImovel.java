package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

public class MenuImovel {      
	private static Scanner ler;  

	public static void main(String[] args) {
		System.out.println("Menu Cadastro de Imovel:\n" + "1 - Cadastrar Imóvel \n"
				+ "2 - Listar\n" + "3 - Alterar\n" + "4 - Excluir\n"
				+ "5 - Voltar ao menu anterior  ");
		
		String opcao="";
		
		ler = new Scanner(System.in);
		opcao=ler.nextLine();
		
		do{
			switch (opcao){
			case "1":
				System.out.println("\nCadastrar novo Imóvel para Venda\n---------------------------------");
				CadastraImovel cI=new CadastraImovel();
				cI.cadastraImovel();
			break;
			
			case "2":
				System.out.println("Listar Cliente");
				
			break;
			
			case "3":
				System.out.println("Alterar Cliente");
				
			break;
				
			case "4":
				System.out.println("Excluir Cliente");
				
				break;
				
			case "5":
				System.out.println("Voltar ao menu anterior");
				return;
			default:
				System.out.println("Informaste o valor errado!");
				break;
			
			}
			opcao="0";
			opcao=ler.nextLine();
		}while(!opcao.equals("5"));
		
	}

}
