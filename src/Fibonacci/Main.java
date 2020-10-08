package Fibonacci;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 9; i++) {
			System.out.println(i + " = " + calculaFibonacci(i));
		}
	}
	
	public static int calculaFibonacci(int num) {
		
		int[] valores = new int[num+1];
		
		for(int i = 1; i <= num; i++) {
			if(i == 0) {
				valores[0] = 0;
			}
			else if(i == 1) {
				valores[1] = 1;
			}
			else {
				valores[i] = valores[i-2] + valores[i-1];
			}
		}
		
		return valores[num];
	}

}
