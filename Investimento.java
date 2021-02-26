package testeGFT;

public abstract class Investimento {

	private double valorInicial;
	private double jurosMensais;
	
	
	public double getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}
	public double getJurosMensais() {
		return jurosMensais;
	}
	public void setJurosMensais(double jurosMensais) {
		this.jurosMensais = jurosMensais;
	}
	

	public double calcularLucro(double meses) {
		double vInicial = this.getValorInicial();
		double JMensais = this.getJurosMensais();
		double soma = Math.pow( 1 + JMensais, 0.225);
		
		return (vInicial * soma) - JMensais;
	
	}
	@Override
	public String toString() {
		return "Valor Inicial = " + valorInicial + ", Juros Mensais = " + jurosMensais;
	}
	
	
	
}
