package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Imovel;

public class EditarImovel {
	/**
	 * Classe para editar imovel 
	 */
	
	/**
	 * Metodo editarCliente, feito para editar clientes pelo nome 
	 * @throws IOException 
	 */
	public static void editarImovel() throws IOException{
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o id do Imovel");
		String id=ler.nextLine();
		
		Imovel imovel = new Imovel();
		
		if(imovel.existe("imoveis.txt", id)){
			System.out.println("continua");
		}else{
			System.out.println("Imovel Inexistente");
		}
		
	}
}
