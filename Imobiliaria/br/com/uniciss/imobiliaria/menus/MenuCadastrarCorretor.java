package br.com.uniciss.imobiliaria.menus;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Cliente;
import br.com.uniciss.imobiliaria.geral.Corretor;
public class MenuCadastrarCorretor {

	private static Scanner entrada;
		
		public static void main(String[] args) throws IOException {
			System.out.println("Menu Cadastro de Corretor:\n" + "1 - Cadastrar\n"
					+ "2 - Listar\n" + "3 - Alterar\n" + "4 - Excluir\n"
					+ "5 - Voltar ao menu anterior  ");
		

			String opcao="";
			entrada = new Scanner(System.in);
			opcao=entrada.nextLine();
			
			
			
			do{
				System.out.println("Menu Cadastro de Corretor:\n" + "1 - Cadastrar\n"
						+ "2 - Listar\n" + "3 - Alterar\n" + "4 - Excluir\n"
						+ "5 - Voltar ao menu anterior  ");
				
				switch (opcao){
				case "1":
					System.out.println("Cadastrar novo Corretor");
					CadastroCorretor.main(null);
				break;
				
				case "2":
					System.out.println("Listar Corretor");
					List<String> corretores = Corretor.listar("corretores.txt");
					if(corretores.size()==0){
						System.out.println("Não existe Corretor Cadastrado!");
					}else{
						for(String c : corretores){
							System.out.println("Nome: "+ c);
						}
					}
				break;
				
				case "3":
					System.out.println("Alterar Corretor");
					
				break;
					
				case "4":
					System.out.println("Excluir Corretor");
					
					break;
					
				case "5":
					System.out.println("Voltar ao menu anterior");
					return;
				default:
					System.out.println("Informaste o valor errado!");
					break;
				
				}
			//	opcao="0";
				opcao=entrada.nextLine();
			}while(!opcao.equals("5"));
			
			
			
			
		}
}
