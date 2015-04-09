package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Corretor;
import br.com.uniciss.imobiliaria.geral.ImovelVenda;

public class AreaCorretor {  
	public static void areaCorretor() throws Exception {
		System.out.println("BEM VINDO A �REA DO CORRETOR");
		System.out.println("\n ESCOLHA AS OP��ES:\n "
				+ "1-Menu Cliente\n"
				+ "2-Receber Mensalidade\n"
				+ "3-Menu Im�veis\n"
				+ "4-Agendar Visitas\n"
				+ "5-Vender Im�vel\n"
				+ "6-Alugar Im�vel\n"
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
				System.out.println("OP��O ERRADA!");
				break;
			}
		}while(!option.equals("8"));
		
	}
}
