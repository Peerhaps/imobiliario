package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Corretor;
import br.com.uniciss.imobiliaria.util.ValidaCpf;

public class CadastroCorretor {
	/*
	 * LOCAL DE PREENCHIMENTO DE CADASTRO DE CORRETOR
	 */
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		Corretor corretor = new Corretor();
		String nome;
		do {

			System.out.println("Determine o nome: ");
			nome = entrada.nextLine();
			corretor.setNome(nome);

		} while (nome.equals(""));
		// entrada.nextLine();

		System.out.println("Determine CPF: ");
		String cpf = entrada.nextLine();

		while (!ValidaCpf.valido(cpf)) {
			System.out.println("CPF inválido, informe novamente: ");
			cpf = entrada.nextLine();
			entrada.nextLine();
		}
		corretor.setCpf(cpf);

		// System.out.println("Determine o RG: ");
		boolean erro = false;
		do {
			try {
				System.out.println("Determine o RG: ");
				int rg = 0;
				rg = entrada.nextInt();
				entrada.nextLine();
				corretor.setRg(rg);
				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		do {
			try {
				System.out.println("Determine o Telefone: ");
				int telefone = entrada.nextInt();
				corretor.setTelefone(String.valueOf(telefone));

				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		System.out.println("Determine o endereco: ");
		corretor.setEndereco(entrada.nextLine());
		entrada.nextLine();

		System.out.println("Determine a Hora de Entrada: ");
		int validaHora = entrada.nextInt();
		entrada.nextLine();
		while ((validaHora > 24) || (validaHora < 0)) {
			System.out.println("Inserte uma hora correta: ");
			validaHora = entrada.nextInt();
			entrada.nextLine();
		}
		corretor.setHoraDeEntrada(String.valueOf(validaHora));

		System.out.println("Determine a Hora de Saída: ");
		int validaHora2 = entrada.nextInt();
		entrada.nextLine();
		while ((validaHora2 > 24) || (validaHora2 < 0)) {
			System.out.println("Inserte uma hora correta: ");
			validaHora2 = entrada.nextInt();
			entrada.nextLine();
		}
		corretor.setHoraDeSaida(String.valueOf(validaHora));

		String senha;
		do {
			System.out.println("Determine a Senha do Corretor: ");
			senha = entrada.nextLine();
			corretor.setSenha(senha);
			corretor.salvar();

		} while (senha.equals(""));
		corretor.salvar();
	}

}
