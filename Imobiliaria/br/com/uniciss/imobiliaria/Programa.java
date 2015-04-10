package br.com.uniciss.imobiliaria;

import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Funcionario;
import br.com.uniciss.imobiliaria.menus.AreaCorretor;
import br.com.uniciss.imobiliaria.menus.AreaSecretario;
import br.com.uniciss.imobiliaria.menus.MenuAdministrador;

public class Programa {
	private static Scanner entrada;

	// Menu Geral Programa
	public static void main(String[] args) throws Exception {

		entrada = new Scanner(System.in);
		boolean logado = false;

		do {
			System.out.println("Nome: ");
			String nome = entrada.nextLine();

			System.out.println("Senha: ");
			String senha = entrada.nextLine();

			Funcionario funcionario = new Funcionario();
			funcionario.setNome(nome);

			if (Funcionario.existe("funcionarios.txt", nome)) {
				funcionario.carregar();
				if (funcionario.getSenha().equals(senha)) {
					logado = true;

					switch (funcionario.getFuncao()) {
					case "admin":
						MenuAdministrador.main(null);
						break;
					case "corretor":
						AreaCorretor.areaCorretor();
						break;
					case "secretario":
						AreaSecretario.areaSecretario();
						break;
					default:
						break;
					}

				} else {
					System.out.println("Login ou senha incorretos");
				}
			} else {
				System.out.println("Login ou senha incorretos");
			}

		} while (!logado);

	}

}
