package br.com.uniciss.imobiliaria;
import java.util.Scanner;
public class CadastrarCorretor {

	private static Scanner entrada;
		
		public static void main(String[] args) {
			System.out.println("Menu Cadastro de Corretor:\n" + "1 - Cadastrar\n"
					+ "2 - Listar\n" + "3 - Alterar\n" + "4 - Excluir\n"
					+ "5 - Voltar ao menu anterior  ");
		

			String opcao="";
			entrada = new Scanner(System.in);
			opcao=entrada.nextLine();
			
			
			
			do{
				switch (opcao){
				case "1":
					System.out.println("Cadastrar novo Corretor");
					
				break;
				
				case "2":
					System.out.println("Listar Corretor");
					
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
				opcao="0";
				opcao=entrada.nextLine();
			}while(!opcao.equals("5"));
			
			
			
			
		}
}
