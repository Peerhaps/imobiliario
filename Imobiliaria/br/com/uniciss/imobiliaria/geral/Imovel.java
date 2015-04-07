package br.com.uniciss.imobiliaria.geral;
import java.util.List;

public class Imovel {
	private String endereco;
	private double area;   
	private String tipo;
	private int numeroDeQuartos;    
	private int numeroDeBanheiros;
	private boolean temGaragem;
	private String contrato;
	private boolean ocupado;   
	private List<Visita> visitasAgendadas;
	private boolean vendaEAluguel;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroDeQuartos() {
		return numeroDeQuartos;
	}

	public void setNumeroDeQuartos(int numeroDeQuartos) {
		this.numeroDeQuartos = numeroDeQuartos;
	}

	public int getNumeroDeBanheiros() {
		return numeroDeBanheiros;
	}

	public void setNumeroDeBanheiros(int numeroDeBanheiros) {
		this.numeroDeBanheiros = numeroDeBanheiros;
	}

	public boolean isTemGaragem() {
		return temGaragem;
	}

	public void setTemGaragem(boolean temGaragem) {
		this.temGaragem = temGaragem;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public List<Visita> getVisitasAgendadas() {
		return visitasAgendadas;
	}

	public void setVisitasAgendadas(List<Visita> visitasAgendadas) {
		this.visitasAgendadas = visitasAgendadas;
	}

	public boolean isVendaEAluguel() {
		return vendaEAluguel;
	}

	public void setVendaEAluguel(boolean vendaEAluguel) {
		this.vendaEAluguel = vendaEAluguel;
	}

}
