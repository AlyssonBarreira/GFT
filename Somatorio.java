package testeGFT;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double soma = 0;
		do {
			
			System.out.println("Digite um valor: ");
			double valor = entrada.nextDouble();
			
			if(valor > 0) {
				
				soma += valor;
				
			}else {
				
				System.out.println("Números negativos não são permitidos");
			}
			
			
		}while(soma < 300);

		System.out.println(soma);
		
		entrada.close();
		
		}
	}
