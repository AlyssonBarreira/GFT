package testeGFT;

public class InvestimentoMain {

	public static void main(String[] args) {
		
		InvestimentoComIR icr = new InvestimentoComIR();
		InvestimentoSemIR isr = new InvestimentoSemIR();
		
		icr.setValorInicial(5000);
		icr.setJurosMensais(0.012);
		icr.calcularLucro(17);
		
		
		isr.setValorInicial(500);
		isr.setJurosMensais(0.007);
		isr.calcularLucro(10);
		
		System.out.println();
		
		System.out.println(icr);
		
		System.out.println();
		
		System.out.println(isr);
		
		
		
		
		
	}
}
