import java.util.Scanner;
//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class Arrays3 {

	public static void main(String[] args) {
		Scanner sis = new Scanner (System.in);
		
		double matriz[][] = new double [3][3];
		int l,c, cont=0;
		
		for(l=0; l<3; l++){
			for(c=0; c<3; c++){
				System.out.println("Digite os valores da Matriz: ");
				matriz [l][c] = sis.nextDouble();
			
			if(matriz[l][c]>10) {
				cont++;
			}
			}	
			}
			System.out.println("existem " + cont + " valores maiores que 10");
			}
	}
	

