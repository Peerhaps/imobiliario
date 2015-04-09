package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Imovel;

public class MenuCadastrarImovel {      
	private static Scanner ler;

	public static void main(String[] args) throws IOException {
		String opcao="";
		ler = new Scanner(System.in);
		String id;
		
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
				List<String>imoveis=i.listar("imoveis.txt", "Endereço");
				
				for(String c : imoveis){
					System.out.println("Imóvel no Endereço:"+c);
				}
				
				System.out.println();
			break;
			
			case "3":
				System.out.println("Alterar Imovel");
				EditarImovel.editarImovel();
			break;
				
			case "4":
				System.out.println("Excluir Imovel");
				System.out.println("Digite o id do Imovel");
				id=ler.nextLine();
				
				break;
			case "5":
				System.out.println("Voltar ao menu anterior");
				return;
			default:
				System.out.println("Informaste o valor errado!");
				break;
			
			}

		}while(!opcao.equals("5"));
		
	}

}
