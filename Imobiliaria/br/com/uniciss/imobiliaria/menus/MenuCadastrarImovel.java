package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Imovel;

public class MenuCadastrarImovel {      
	private static Scanner ler;

	public static void main(String[] args) {
		String opcao="";
		ler = new Scanner(System.in);
		
		
		do{
			System.out.println("Menu Cadastro de Imovel:\n" + "1 - Cadastrar Imóvel \n"
					+ "2 - Listar\n" + "3 - Alterar\n" + "4 - Excluir\n"
					+ "5 - Voltar ao menu anterior  ");
			opcao=ler.nextLine();
			
			switch (opcao){
			case "1":
				System.out.println("\nCadastrar novo Imóvel para Venda\n---------------------------------");
				CadastroImovel cI=new CadastroImovel();
				cI.cadastraImovel();
			break;
			
			case "2":
				System.out.println("Listar Imóvel");
				Imovel i=new Imovel();
				//i.listarImoveis();
				
			break;
			
			case "3":
				System.out.println("Alterar Imovel");
				
			break;
				
			case "4":
				System.out.println("Excluir Imovel");
				
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
