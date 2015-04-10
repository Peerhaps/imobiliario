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
		// Nome da Pessoa com validação
		do {

			System.out.println("Determine o nome: ");
			nome = entrada.nextLine();
			corretor.setNome(nome);

		} while (nome.equals(""));

		System.out.println("Determine CPF: "); // Preenchimento do cpf com
												// validação
		String cpf = entrada.nextLine();
		while (!ValidaCpf.valido(cpf)) {
			System.out.println("CPF inválido, informe novamente: ");
			cpf = entrada.nextLine();
			entrada.nextLine();
		}
		corretor.setCpf(cpf);

		boolean erro = false;
		do {
			try {
				System.out.println("Determine o RG: "); // Preenchimento do RG
														// com validação para
														// não digitar letras
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
				System.out.println("Determine o Telefone: ");// Preenchimento do
																// TELEFONE com
																// validação
																// para não
																// digitar
																// letras
				int telefone = entrada.nextInt();
				corretor.setTelefone(String.valueOf(telefone));

				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		System.out.println("Determine o endereco: ");
		Scanner entrada2 = new Scanner(System.in);
		String endereco = entrada2.nextLine();
		corretor.setEndereco(endereco);

		int validaHora; // Variavel que vai servir de auxilio para validar a
						// hora de entrada e saida do trabalho
		do {
			try {
				System.out.println("Determine a Hora de Entrada: ");
				validaHora = entrada.nextInt();
				entrada.nextLine();
				while ((validaHora > 24) || (validaHora < 0)) {
					System.out.println("Inserte uma hora correta: ");
					validaHora = entrada.nextInt();
				}
				corretor.setHoraDeEntrada(String.valueOf(validaHora));
				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		do {
			try {
				System.out.println("Determine a Hora de Saida: ");
				validaHora = entrada.nextInt();
				entrada.nextLine();
				while ((validaHora > 24) || (validaHora < 0)) {
					System.out.println("Inserte uma hora correta: ");
					validaHora = entrada.nextInt();
				}
				corretor.setHoraDeSaida(String.valueOf(validaHora));

				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		String senha; // Variavel auxiliar para senhas
		do {
			System.out.println("Determine a Senha do Corretor: ");
			senha = entrada.nextLine();
			corretor.setSenha(senha);

		} while (senha.equals(null));
		corretor.salvar();
		return;
	}

}
