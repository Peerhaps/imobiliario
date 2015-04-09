package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Corretor;
import br.com.uniciss.imobiliaria.geral.ImovelVenda;

public class AreaCorretor {  
	public static void areaCorretor() throws Exception {
		System.out.println("BEM VINDO A ÁREA DO CORRETOR");
		System.out.println("\n ESCOLHA AS OPÇÕES:\n "
				+ "1-Menu Cliente\n"
				+ "2-Receber Mensalidade\n"
				+ "3-Menu Imóveis\n"
				+ "4-Agendar Visitas\n"
				+ "5-Vender Imóvel\n"
				+ "6-Alugar Imóvel\n"
				+ "7-Sair");
		/**
		 * Switch com as opcoes de menu;
		 */
		Scanner entrada = new Scanner(System.in);
	
		String option = entrada.nextLine();
		do{
			switch (option) {
			case "1":
				MenuCadastrarCliente.main(null);
				break;
			case "2":
				System.out.println("OPCAO DESABILITADA");
				break;
			case "3":
				MenuCadastrarImovel.main(null);
				break;
			case "4":
				
				break;
			case "5":
				Corretor corretor = new Corretor();	
				corretor.vender();
				break;	
			case "6":
			//	Corretor.vender(imovel, comprador);
				break;
			case "7":
			//	Corretor.alugar(locatario, imovel);
				break;
			case "8":
				
			default:
				System.out.println("OPÇÃO ERRADA!");
				break;
			}
		}while(!option.equals("8"));
		
	}
}
