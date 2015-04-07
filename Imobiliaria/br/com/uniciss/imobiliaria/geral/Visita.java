package br.com.uniciss.imobiliaria.geral;
import java.util.Date;

public class Visita {
	private Date data;
	private Cliente cliente;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
