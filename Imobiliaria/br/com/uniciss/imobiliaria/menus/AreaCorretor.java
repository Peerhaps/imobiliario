package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Cliente;
import br.com.uniciss.imobiliaria.geral.Corretor;
import br.com.uniciss.imobiliaria.geral.Imovel;

public class AreaCorretor {  
	public static void areaCorretor() throws Exception {
		
		/**
		 * Switch com as opcoes de menu;
		 */
		Scanner entrada = new Scanner(System.in);
		String option;
		
		do{
			System.out.println("\nÁREA DO CORRETOR\n");
			System.out.println("ESCOLHA ENTRE AS OPÇÕES:\n"
					+ "1-Menu Cliente\n"
					+ "2-Receber Mensalidade\n"
					+ "3-Menu Imóveis\n"
					+ "4-Agendar Visitas\n"
					+ "5-Vender Imóvel\n"
					+ "6-Alugar Imóvel\n"
					+ "7-Sair");
			option = entrada.nextLine();
			
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
				MenuAgendar agenda = new MenuAgendar();
				agenda.agendarVisita();
				break;
			case "5"://diz que A venda nao tem no imoveis.txt mas tem
				Cliente cliente = new Cliente();
				Imovel imovel = new Imovel();
				
				System.out.println("Informe o nome do cliente");
				String nome = entrada.nextLine();
				
				if (!cliente.existe("clientes.txt", nome)) {
					System.out.println("Cliente Inexistente");
					return;
				}else{
					cliente.setNome(nome);
					
					System.out.println("Informe o id do Imovel");
					int id = entrada.nextInt();
					entrada.nextLine();
					
					imovel.setKey(id);
					
					if(imovel.existe()){
						if(Corretor.vender(imovel, cliente)){
							System.out.println("Venda Concluida");
							System.out.println("Comprador:"+nome);
							System.out.println("Id Imovel vendido:"+id);
						}else{
							System.out.println("Imovel não esta a venda");
						}
					}else{
						System.out.println("Imovel Inexistente");
					}
				}
				break;	
			case "6"://aLocação nao tem no imoveis.txt
				Cliente locatorio = new Cliente();
				Imovel imovelAluguel = new Imovel();
				
				System.out.println("Informe o nome do cliente");
				String nomeLocatorio = entrada.nextLine();
				
				if (!locatorio.existe("clientes.txt", nomeLocatorio)){
					System.out.println("Cliente Inexistente");
					return;
				}else{
					locatorio.setNome(nomeLocatorio);
					
					System.out.println("Informe o id do Imovel");
					int id = entrada.nextInt();
					entrada.nextLine();
					
					imovelAluguel.setKey(id);
					
					if(imovelAluguel.existe()){
						if(Corretor.alugar(locatorio, imovelAluguel)){
							System.out.println("Imovel alugado com sucesso");
							System.out.println("Locatario:"+nomeLocatorio);
							System.out.println("Id Imovel alugado:"+id);
						}else{
							System.out.println("Imovel não esta para alugar");
						}
					}else{
						System.out.println("Imovel Inexistente");
					}
				}
				break;
			case "7":
				break;
			default:
				System.out.println("OPÇÃO ERRADA!");
				break;
			}
		}while(!option.equals("7"));
		
	}
}
