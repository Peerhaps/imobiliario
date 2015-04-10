package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.Cliente;
import br.com.uniciss.imobiliaria.geral.Imovel;

public class EditarImovel {
	/**
	 * Classe para editar imovel 
	 */
	
	/**
	 * Metodo editarImovel, feito para editar imovel pelo id 
	 * @throws IOException 
	 */
	public static void editarImovel() throws IOException{
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o id do Imovel");
		int id=ler.nextInt();
		ler.nextLine();
		
		Imovel imovel = new Imovel();
		imovel.setKey(id);
		
		if(imovel.existe()){
			CadastroImovel cadastroImovel = new CadastroImovel();
			editandoImovel(id);
		}else{
			System.out.println("Imovel Inexistente");
		}
		
	}
	public static void editandoImovel(int key) throws IOException{
		Scanner ler=new Scanner(System.in);
		String end;
		double area = 0;
		String tipo;   
		int numQ = 0;  
		int numB = 0;
		boolean possuiGaragem;
		String contrato = "";
		double preco;
		double mensalidade = 0;
		String nome;
		String linha = "";
		
		System.out.println("Nome do proprietário");
		
		boolean cont=false;
		Cliente cliente=new Cliente();
		
		do{  
			nome = ler.nextLine();
			
			if(cliente.existe("clientes.txt", nome)){
				cliente.setNome(nome);
				cont=false;
			}else{
				System.out.println("Não Existe");
				cont=true;
			}
		}while(cont == true);
		
		
		System.out.println("Endereço do Imóvel");
		end = ler.nextLine();
		
		//Trata Excessão informaçao errada para área
		boolean repete = false;
		System.out.println("Area do Imóvel");
		do{
			try{
				area = ler.nextDouble();
				ler.nextLine();
				repete = false;
			}catch(InputMismatchException e){
				System.out.println("Área Incorreta\n");
				ler.nextLine();
				repete = true;
			}
		}while(repete == true);
		
		
		System.out.println("Tipo de Imóvel");
		tipo = ler.nextLine();
		
		//Trata Excessão informaçao errada para numero de quartos
		System.out.println("Numero de quartos");
		do{
			try{
				numQ = ler.nextInt();
				ler.nextLine();
				repete = false;
			}catch(InputMismatchException e){
				System.out.println("Digite apenas numeros Inteiros\n");
				ler.nextLine();
				repete = true;
			}
		}while(repete == true);
		
		//Trata Excessão informaçao errada para numero de quartos
		System.out.println("Numero de Banheiros");
		do{
			try{
				numB = ler.nextInt();
				ler.nextLine();
				repete = false;
			}catch (InputMismatchException e) {
				System.out.println("Digite apenas numeros Inteiros\n");
				ler.nextLine();
				repete = true;
			}
		}while(repete == true);

		System.out.println("Possui Garagem - S-Sim/N-Não");
		String pG = ler.nextLine();
			
		possuiGaragem = false;
		if(pG.toUpperCase().equals("S")){
			possuiGaragem = true;
		}else if(pG.toUpperCase().equals("N")){
			possuiGaragem = false;
		}
		
		System.out.println("Digite o contrato / Digite Sair para finalizar");
		do{
			contrato=contrato+" "+linha;
			linha = ler.nextLine();
		}while(!linha.toLowerCase().equals("sair"));
		
		boolean aVenda=false;
		boolean aLocacao=false;
		
		
		System.out.println("Deseja colocar a Venda? - S-Sim/N-Não");
		String vender = ler.nextLine();
		if(vender.toUpperCase().equals("S")){
			aVenda=true;
			
			//Trata Excessão para valor de venda informada incorretamente
			System.out.println("Digite o valor para Venda");
			do{
				try{
					preco = ler.nextDouble();
					ler.nextLine();
					repete = false;
				}catch(InputMismatchException e){
					System.out.println("Valor Invalido\n");
					ler.nextLine();
					repete = true;	
				}
			}while(repete == true);
		}
		
		System.out.println("Deseja colocar para alugar? - S-Sim N-Não");
		String alugar = ler.nextLine();
		
		if(alugar.toUpperCase().equals("S")){
			aLocacao=true;
			
			//Trata Excessão para valor de mensalidade informada incorretamente
			System.out.println("Digite o valor da Mensalidade");
			do{
				try{
					mensalidade = ler.nextDouble();
					ler.nextLine();
											
					repete = false;
				}catch(InputMismatchException e){
					System.out.println("Valor Invalido\n");
					ler.nextLine();
					repete = true;	 
				}
			}while(repete == true);
		}
		
		//Intancia Imovel Alugar e seta Valores 
		Imovel imovel = new Imovel();
		imovel.setEndereco(end);
		imovel.setArea(area);
		imovel.setTipo(tipo);
		imovel.setNumeroDeQuartos(numQ);
		imovel.setNumeroDeBanheiros(numB);
		imovel.setTemGaragem(possuiGaragem);
		imovel.setContrato(contrato);
		imovel.setOcupado(false);
		imovel.setMensalidade(mensalidade);
		imovel.setALocacao(aLocacao);
		imovel.setAVenda(aVenda);
		imovel.setProprietario(nome);
		imovel.salvar();
	}
}
