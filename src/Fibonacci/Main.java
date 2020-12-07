package Fibonacci;

public class Main {

	public static void main(String[] args) {
		// Calculando o Fibonacci de 10
		calculaFibonacci(10);
	}
	
	public static int calculaFibonacci(int num) {
		
		int[] valores = new int[num+1];
		
		for(int i = 0; i <= num; i++) {
			if(i == 0) {
				valores[0] = 0;
			}
			else if(i == 1) {
				valores[1] = 1;
			}
			else {
				valores[i] = valores[i-2] + valores[i-1];
			}
			// Mostra o Fibonacci de todos os valores até o desejado
			System.out.println(i + " = " + valores[i]);
		}
		
		return valores[num];
	}

}
