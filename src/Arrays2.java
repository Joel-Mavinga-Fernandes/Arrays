import java.util.Scanner;
//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//� Os n�meros pares digitados;  
//� A soma dos n�meros pares digitados; 
//� Os n�meros �mpares digitados; 
//� A quantidade de n�meros �mpares digitados.

public class Arrays2 {

	public static void main(String[] args) {
		
		int[] num = new int [6];
		int i, somaP=0, somaI=0,par=0;
	
		Scanner sis = new Scanner (System.in);
		
		System.out.println("Digite os n�meros inteiros: ");
		for(i=0; i<6; i++) {
		num[i] = sis.nextInt();
		
		
		if(num[i]%2==0) {
			
			somaP+=num[i];
			//System.out.println("par "+ num[i]);
	}
		else {
			somaI+=num[i];
			//System.out.println("impar "+ num[i]);
		}
		}
		System.out.print("Os n�meros pares s�o: ");
		for(i=0; i<6; i++) {
			if (num[i]%2==0) {
				System.out.print(num[i] + ";");
			}
			
		}
		System.out.print("\nOs n�meros impares s�o: ");
		for(i=0; i<6; i++) {
			if (num[i]%2!=0) {
				System.out.print(num[i] + ";");
			}
		}
		
		System.out.println("\nA soma dos numeros pares �: "+ somaP);
		System.out.println("A soma dos numeros impares �: "+ somaI);
		
}
	}
