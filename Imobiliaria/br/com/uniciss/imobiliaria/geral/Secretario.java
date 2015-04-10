package br.com.uniciss.imobiliaria.geral;

public class Secretario extends Autenticavel {

	private String horaDeEntrada;
	private String horaDeSaida;

	public String getHoraDeEntrada() {
		return horaDeEntrada;
	}

	public void setHoraDeEntrada(String horaDeEntrada) {
		this.dados.put("Hora de entrada", horaDeEntrada);
	}

	public String getHoraDeSaida() {
		return horaDeSaida;
	}

	public void setHoraDeSaida(String horaDeSaida) {
		this.dados.put("Hora de saida", horaDeSaida);
	}

	public void cadastrarCliente(Cliente cliente) {

	}

	public void cadastrarImovel(Imovel imovel) {

	}

	public void receberMensalidade(Cliente locatario) {

	}

	public void listarImovel() {

	}

	public void gerarRelatorio(Cliente cliente) {

	}

	public void gerarRelatorio(Imovel imovel) {

	}

	public void gerarRelatorio(Corretor corretor) {

	}

	public void agendarVisita(Cliente cliente, Imovel imovel) {

	}

	@Override
	public String getFuncao() {
		return "secretario";
	}
	
	public boolean salvar() {
		this.dados.put("Função", this.getFuncao());
		return super.salvar();
	}

}
