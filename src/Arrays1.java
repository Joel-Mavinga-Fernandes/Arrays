
public class Arrays1 {
//	1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros.
//	O programa deve executar os seguintes passos: 
//	(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
//	(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
//	(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
//	(d) Mostre na tela cada valor do vetor A, um em cada linha.

	public static void main(String[] args) {
		
		double [] A = new double [6];
		int i=0;
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		
		double soma = A[0]+A[1]+A[5];
		
		System.out.printf("A soma das posi��es solicitadas �: ", soma);
		
		A[4] = 100;
		
		for(i=0; i<6; i++) {
			System.out.println( A[i]);
		}
		
		                                                
	}
	}

