package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Corretor;
import br.com.uniciss.imobiliaria.util.ValidaCpf;

public class CadastroCorretor {
	/*
	 *LOCAL DE PREENCHIMENTO DE CADASTRO DE CORRETOR
	 */
	private static Scanner entrada;
	private static Scanner entrada2;
	private static Scanner entrada3;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		entrada2 = new Scanner(System.in);
		entrada3 = new Scanner(System.in);
		Corretor corretor = new Corretor();
		
		
		System.out.println("Determine o nome: ");
		corretor.setNome(entrada.toString());
		entrada.hasNext();
		
		
		System.out.println("Determine CPF: ");
		String cpf = entrada2.nextLine();
		
		while (!ValidaCpf.valido(cpf)) {
			System.out.println("CPF inválido, informe novamente: ");
			cpf = entrada2.nextLine();
		}

		
		System.out.println("Determine o RG: ");
		corretor.setRg(entrada.nextLine());
		entrada.hasNext();
		
		System.out.println("Determine o Telefone: ");
		corretor.setTelefone(entrada2.nextLine());
		entrada2.hasNext();
		
		System.out.println("Determine o endereco: ");
		corretor.setEndereco(entrada.nextLine());
		entrada.hasNext();
		
		System.out.println("Determine a Hora de Entrada: ");
		int validaHora = entrada2.nextInt();
		while ((validaHora>24)||(validaHora<0)){
			System.out.println("Inserte uma hora correta: ");
			validaHora = entrada.nextInt();
		}
		corretor.setHoraDeEntrada(String.valueOf(validaHora));
		
		
		System.out.println("Determine a Hora de Saída: ");
		int validaHora2 = entrada2.nextInt();
		while ((validaHora2>24)||(validaHora2<0)){
			System.out.println("Inserte uma hora correta: ");
			validaHora2 = entrada.nextInt();
		}
		corretor.setHoraDeSaida(String.valueOf(validaHora));
		
		System.out.println("Determine a Senha do Corretor: ");
		corretor.setSenha(entrada3.nextLine());
		
		corretor.salvar();
		
	}

}
