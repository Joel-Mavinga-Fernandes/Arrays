import java.util.Scanner;
//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados.

public class Arrays2 {

	public static void main(String[] args) {
		
		int[] num = new int [6];
		int i, somaP=0, somaI=0,par=0;
	
		Scanner sis = new Scanner (System.in);
		
		System.out.println("Digite os números inteiros: ");
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
		System.out.print("Os números pares são: ");
		for(i=0; i<6; i++) {
			if (num[i]%2==0) {
				System.out.print(num[i] + ";");
			}
			
		}
		System.out.print("\nOs números impares são: ");
		for(i=0; i<6; i++) {
			if (num[i]%2!=0) {
				System.out.print(num[i] + ";");
			}
		}
		
		System.out.println("\nA soma dos numeros pares é: "+ somaP);
		System.out.println("A soma dos numeros impares é: "+ somaI);
		
}
	}
