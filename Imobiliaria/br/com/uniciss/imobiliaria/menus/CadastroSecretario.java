package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Secretario;
import br.com.uniciss.imobiliaria.util.ValidaCpf;

public class CadastroSecretario {
	/*
	 * LOCAL DE PREENCHIMENTO DE CADASTRO DE SECRETARIO;
	 */
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		Secretario secretario = new Secretario();
		String nome;
		do {

			System.out.println("Determine o nome: ");
			nome = entrada.nextLine();
			secretario.setNome(nome);

		} while (nome.equals(""));
		// entrada.nextLine();

		System.out.println("Determine CPF: ");
		String cpf = entrada.nextLine();

		while (!ValidaCpf.valido(cpf)) {
			System.out.println("CPF inválido, informe novamente: ");
			cpf = entrada.nextLine();
			entrada.nextLine();
		}
		secretario.setCpf(cpf);

		boolean erro = false;
		do {
			try {
				System.out.println("Determine o RG: ");
				int rg = 0;
				rg = entrada.nextInt();
				entrada.nextLine();
				secretario.setRg(rg);
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
				secretario.setTelefone(String.valueOf(telefone));

				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		System.out.println("Determine o endereco: ");
		String endereco = entrada.nextLine();
		entrada.nextLine();
		secretario.setEndereco(endereco);

		int validaHora = 0;

		do {
			try {
				System.out.println("Determine a Hora de Entrada: ");
				validaHora = entrada.nextInt();
				entrada.nextLine();
				while ((validaHora > 24) || (validaHora < 0)) {
					System.out.println("Inserte uma hora correta: ");
					validaHora = entrada.nextInt();
				}
				secretario.setHoraDeEntrada(String.valueOf(validaHora));

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
				secretario.setHoraDeSaida(String.valueOf(validaHora));

				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		String senha;
		do {
			System.out.println("Determine a Senha do Secretario: ");
			senha = entrada.nextLine();
			secretario.setSenha(senha);

		} while (senha.equals(""));
		secretario.salvar();
		return;
	}
}
