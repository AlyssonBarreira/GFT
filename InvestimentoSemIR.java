package testeGFT;

public class InvestimentoSemIR extends Investimento{


	public double calcularLucro(double meses) {
		if (this.getValorInicial() > 1000) {
			
			double vInicial = this.getValorInicial();
			double JMensais = this.getJurosMensais();
			double soma = Math.pow( 1 + JMensais, 0.225);
			
			return (vInicial * soma) - JMensais;
		}
		else {
			System.out.println("O valor Inicial não pode ser menor que R$1000");
			return 0;
		}
	
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Juros calculado = " + calcularLucro(getJurosMensais()) ;
	}	
}
