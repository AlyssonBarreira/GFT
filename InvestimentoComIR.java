package testeGFT;

public class InvestimentoComIR extends Investimento{

	
	public double calcularLucro(double meses) {
		
		if (meses < 6) {
			
			double vInicial = this.getValorInicial();
			double JMensais = this.getJurosMensais();
			double soma = Math.pow( 1 + JMensais, 0.225);
			
			return (vInicial * soma) - JMensais;
		}
		else if(meses >= 6 && meses < 12) {
			
			double vInicial = this.getValorInicial();
			double JMensais = this.getJurosMensais();
			double soma = Math.pow( 1 + JMensais, 0.2);
			
			return (vInicial * soma) - JMensais;
		}
		else if(meses >= 12 && meses < 24) {
			double vInicial = this.getValorInicial();
			double JMensais = this.getJurosMensais();
			double soma = Math.pow( 1 + JMensais, 0.175);
			
			return (vInicial * soma) - JMensais;
		}
		else {
			double vInicial = this.getValorInicial();
			double JMensais = this.getJurosMensais();
			double soma = Math.pow( 1 + JMensais, 0.15);
			
			return (vInicial * soma) - JMensais;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", Juros calculado = " + calcularLucro(getJurosMensais()) ;
	}	
	
}
