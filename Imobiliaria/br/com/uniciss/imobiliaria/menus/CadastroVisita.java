package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Cliente;
import br.com.uniciss.imobiliaria.geral.Imovel;

public class CadastroVisita {
	private Scanner entrada;

	public void cadastrarVisita() throws IOException {
		boolean erro = false;
		Imovel imovel = new Imovel();
		entrada = new Scanner(System.in);

		int dia = 0;
		do {
			try {
				/**
				 * Preenchimento do Dia com validação para não digitar letras
				 */
				System.out.println("Determine o dia: ");
				 dia = entrada.nextInt();
				while (dia > 31 || dia < 0) {
					System.out.println("Escreva um dia correto! ");
					dia = entrada.nextInt();
					entrada.nextLine();
				}
				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);
		
		int mes = 0;
		do {
			try {
				/**
				 * Preenchimento do Mes com validação para não digitar letras
				 */
				System.out.println("Determine o mês: ");
				mes = entrada.nextInt();
				while (mes > 12 || mes < 0) {
					System.out.println("Escreva um mes correto! ");
					mes = entrada.nextInt();
				}
				entrada.nextLine();
				
				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);
		
		int ano = 0;
		do {
			try {
				/**
				 * Preenchimento do Ano com validação para não digitar letras
				 */
				System.out.println("Determine o ano: ");
				ano = entrada.nextInt();
				entrada.nextLine();
				
				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);
		

		System.out.println("Determine o nome do Cliente: ");
		String cliente = entrada.nextLine();
		
		String nome= cliente;
		if (Cliente.existe("clientes.txt", nome)&&(imovel.existe())) {
			if(imovel.agendarVisita(cliente, dia, mes, ano)){
				imovel.salvar();
				
			}else{
				System.out.println("Ja existe visita para esta data");
			}
			

		}else{
			System.out.println("Cliente ou imovel inexistente!!");
		}

	}
}
