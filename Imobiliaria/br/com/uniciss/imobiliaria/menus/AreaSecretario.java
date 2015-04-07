package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

public class AreaSecretario {
	public static void areaSecretario() throws Exception{
		System.out.println("ÁREA SECRETARIO\n");
		System.out.println("ESCOLHA AS OPÇÕES: \n"
				+ "1-Menu Cliente\n"
				+ "2-Menu Imovel\n"
				+ "3-Receber Mensalidade\n"
				+ "4-Agendar Visita\n"
				+ "");
		String option;
		Scanner entrada = new Scanner(System.in);
		option=entrada.nextLine();
		do{
		switch (option) {
		case "1":
			MenuCadastrarCliente.main(null);
			break;
		case "2":
			MenuCadastrarImovel.main(null);
			break;
		case "3":
			System.out.println("OPCAO DESABILITADA");
			break;
		case "4":
			System.out.println("OPCAO DESABILITADA");
			break;
		case "5":
			break;
		default:
			System.out.println("Opção Errada!");
			break;
		}
	
		option="0";
		
		
	}while(!option.equals("5"));
}
}
