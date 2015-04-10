package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.Programa;

public class AreaSecretario {
	private static Scanner entrada;

	public static void areaSecretario() throws Exception {
		System.out.println("ÁREA SECRETARIO\n");
		System.out.println("ESCOLHA AS OPÇÕES: \n" + "1-Menu Cliente\n"
				+ "2-Menu Imovel\n" + "3-Receber Mensalidade\n"
				+ "4-Agendar Visita\n" + "5-Sair\n");
		String option;
		entrada = new Scanner(System.in);
		option = entrada.nextLine();
		do {
			switch (option) {
			case "1":
				MenuCadastrarCliente.main(null);

				break;
			case "2":
				MenuCadastrarImovel.main(null);
				break;
			case "3":
				System.out.println("Mensalidade Recebida com sucesso!");
				break;
			case "4":
				MenuAgendar agenda = new MenuAgendar();
				agenda.agendarVisita();
				break;
			case "5":
				Programa.main(null);
				
				break;
			default:
				System.out.println("Opção Errada!");
				break;
			}

			
			System.out.println("ESCOLHA AS OPÇÕES: \n" + "1-Menu Cliente\n"
					+ "2-Menu Imovel\n" + "3-Receber Mensalidade\n"
					+ "4-Agendar Visita\n" + "5-Sair\n");
			option = entrada.nextLine();
			
		} while (!option.equals("5"));
	}
}
