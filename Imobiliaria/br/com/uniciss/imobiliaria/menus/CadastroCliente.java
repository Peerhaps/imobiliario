package br.com.uniciss.imobiliaria.menus;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import br.com.uniciss.imobiliaria.geral.Cliente;
import br.com.uniciss.imobiliaria.util.ValidaCpf;

public class CadastroCliente {
	private static Scanner entrada;
	private static Scanner entrada2;

	public static void main() throws Exception {
		entrada = new Scanner(System.in);
		Cliente cliente = new Cliente();
		String nome;
		/**Nome da Pessoa com validação*/
		do {

			System.out.println("Determine o nome: ");
			nome = entrada.nextLine();
			cliente.setNome(nome);

		} while (nome.equals(""));

		System.out.println("Determine CPF: ");
		/**
		 * Preenchimento do cpf com validação
		 */
		String cpf = entrada.nextLine();
		while (!ValidaCpf.valido(cpf)) {
			System.out.println("CPF inválido, informe novamente: ");
			cpf = entrada.nextLine();
			entrada.nextLine();
		}
		cliente.setCpf(cpf);

		boolean erro = false;
		do {
			try {
				System.out.println("Determine o RG: ");
				/**
				 * Preenchimento do RG com validação para não digitar letras
				 */
				int rg = 0;
				rg = entrada.nextInt();
				entrada.nextLine();
				cliente.setRg(rg);
				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		do {
			try {
				System.out.println("Determine o Telefone: ");
				/**
				 * Preenchimento do TELEFONE com validação para não digitar
				 * letras
				 */
				int telefone = entrada.nextInt();
				cliente.setTelefone(String.valueOf(telefone));

				erro = false;

			} catch (Exception e) {
				erro = true;
				entrada.nextLine();
			}
		} while (erro);

		System.out.println("Determine o endereco: ");
		Scanner entrada2 = new Scanner(System.in);
		String endereco = entrada2.nextLine();
		cliente.setEndereco(endereco);

		System.out.println("Determine o numero da conta Bancaria: ");
		String bancario = entrada.nextLine();
		entrada.nextLine();
		cliente.setNumeroContaBancaria(Integer.parseInt(bancario));

		cliente.salvar();
		return;
	}
}