package br.com.uniciss.imobiliaria.menus;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.uniciss.imobiliaria.geral.ImovelAluguel;
import br.com.uniciss.imobiliaria.geral.ImovelVenda;

public class CadastroImovel {   
	Scanner ler=new Scanner(System.in);
	String end;
	double area;
	String tipo;   
	int numQ;  
	int numB;
	boolean possuiGaragem;
	String contrato;
	double preco;
	double mensalidade;
	String nome;
	String linha;
	
	/*
	 * Metodo que efetua o cadastro de um novo imovel
	 */
	public void cadastraImovel(){
		    
		System.out.println("Nome do propriet�rio");
		nome = ler.nextLine();
		
		System.out.println("Endere�o do Im�vel");
		end = ler.nextLine();
		
		//Trata Excess�o informa�ao errada para �rea
		boolean repete = false;
		do{
			try{
				System.out.println("Area do Im�vel");
				area = ler.nextDouble();
				ler.nextLine();
				repete = false;
			}catch(InputMismatchException e){
				System.out.println("�rea Incorreta\n");
				ler.nextLine();
				repete = true;
			}
		}while(repete == true);
		
		
		System.out.println("Tipo de Im�vel");
		tipo = ler.nextLine();
		
		//Trata Excess�o informa�ao errada para numero de quartos
		do{
			try{
				System.out.println("Numero de quartos");
				numQ = ler.nextInt();
				ler.nextLine();
				repete = false;
			}catch(InputMismatchException e){
				System.out.println("Digite apenas numeros Inteiros\n");
				ler.nextLine();
				repete = true;
			}
		}while(repete == true);
		
		//Trata Excess�o informa�ao errada para numero de quartos
		do{
			try{
				System.out.println("Numero de Banheiros");
				numB = ler.nextInt();
				ler.nextLine();
				repete = false;
			}catch (InputMismatchException e) {
				System.out.println("Digite apenas numeros Inteiros\n");
				ler.nextLine();
				repete = true;
			}
		}while(repete == true);

		System.out.println("Possui Garagem - S-Sim/N-N�o");
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
		
		
		System.out.println("Deseja colocar a Venda? - S-Sim/N-N�o");
		String vender = ler.nextLine();
		if(vender.toUpperCase().equals("S")){
			//Trata Excess�o para valor de venda informada incorretamente
			do{
				try{
					System.out.println("Digite o valor para Venda");
					preco = ler.nextDouble();
					ler.nextLine();
					
					//Intancia Imovel Venda e seta Valores 
					ImovelVenda iV = new ImovelVenda();
					iV.setEndereco(end);//Endere�o
					iV.setArea(area);//�rea
					iV.setTipo(tipo);//Tipo
					iV.setNumeroDeQuartos(numQ);//Numero De Quartos
					iV.setNumeroDeBanheiros(numB);//Numero de banheiros
					iV.setTemGaragem(possuiGaragem);//Possui Garagem
					iV.setContrato(contrato);//Contrato
					iV.setOcupado(false);//Ocupado
					iV.setPreco(preco);//Pre�o
					iV.salvar();
					
					repete = false;
				}catch(InputMismatchException | IOException e){
					System.out.println("Valor Invalido\n");
					ler.nextLine();
					repete = true;	
				}
			}while(repete == true);
		}
		
		System.out.println("Deseja colocar para alugar? - S-Sim N-N�o");
		String alugar = ler.nextLine();
		
		if(alugar.toUpperCase().equals("S")){
			//Trata Excess�o para valor de mensalidade informada incorretamente
			do{
				try{
					System.out.println("Digite o valor da Mensalidade");
					mensalidade = ler.nextDouble();
					ler.nextLine();
					
					//Intancia Imovel Alugar e seta Valores 
					ImovelAluguel iA = new ImovelAluguel();
					iA.setEndereco(end);//Endere�o
					iA.setArea(area);//�rea
					iA.setTipo(tipo);//Tipo
					iA.setNumeroDeQuartos(numQ);//Numero De Quartos
					iA.setNumeroDeBanheiros(numB);//Numero de banheiros
					iA.setTemGaragem(possuiGaragem);//Possui Garagem
					iA.setContrato(contrato);//Contrato
					iA.setOcupado(false);//Ocupado
					iA.setMensalidade(mensalidade);
					iA.salvar();
					
					repete = false;
				}catch(InputMismatchException | IOException e){
					System.out.println("Valor Invalido\n");
					ler.nextLine();
					repete = true;	 
				}
			}while(repete == true);
		}
	}
}
