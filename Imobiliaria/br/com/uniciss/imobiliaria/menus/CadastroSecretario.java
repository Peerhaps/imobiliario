package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Secretario;
import br.com.uniciss.imobiliaria.util.ValidaCpf;

public class CadastroSecretario {
	/*
	 * LOCAL DE PREENCHIMENTO DE CADASTRO DE SECRETARIO;
	 */
	private static Scanner entrada;
	private static Scanner entrada2;

	public static void main(String[] args) throws IOException {
		System.out.println("Cadastro Secretario\n");
		Secretario secretario = new Secretario();
		entrada = new Scanner(System.in);
		entrada2 = new Scanner(System.in);

		System.out.println("Determine o nome: ");
		secretario.setNome(entrada.toString());
		entrada.hasNext();

		System.out.println("Determine CPF:  ");
		String cpf = entrada2.nextLine();
		while (!ValidaCpf.valido(cpf)) {
			System.out.println("CPF inválido, informe novamente: ");
			cpf = entrada2.nextLine();
		}
		secretario.setCpf(cpf);

		System.out.println("Determine o RG: ");
		secretario.setRg(entrada.nextInt());

		System.out.println("Determine o Telefone: ");
		secretario.setTelefone(entrada2.nextLine());

		System.out.println("Determine o endereco: ");
		secretario.setEndereco(entrada.nextLine());

		System.out.println("Determine a Hora de Entrada: ");
		secretario.setHoraDeEntrada(entrada2.nextLine());

		System.out.println("Determine a Hora de Saída: ");
		secretario.setHoraDeSaida(entrada.nextLine());
		
		System.out.println("Determine a Senha do Secretario: ");
		secretario.setSenha(entrada2.nextLine());
		secretario.salvar();

	}
}
