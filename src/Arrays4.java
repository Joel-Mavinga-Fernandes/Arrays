import java.util.Scanner;
//4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
//(1) somar as duas matrizes 
//(2) subtrair a primeira matriz da segunda 
//(3) adicionar uma constante as duas matrizes
//(4) imprimir as matrizes 
//Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.

public class Arrays4 {

	   
	public static void main(String[] args) {
		 Scanner sis = new Scanner (System.in);
		 
		 int matriz1 [][] = new int [2][2];
		 int matriz2 [][] = new int [2][2];
		 int matriz3 [][] = new int [2][2];
		 int l=0,c=0, opcoes;
		 String constante;
		 
		 	for(l=0; l<matriz1.length; l++) {
		 		for(c=0; c<matriz1.length; c++) {
		 			System.out.println("Digite os valores da primeira matriz: ");
		 			matriz1 [l][c] = sis.nextInt();
		 	}	
		 	}
		 	for(l=0; l<matriz2.length; l++) {
		 		for(c=0; c<matriz2.length; c++) {
		 			System.out.println("Digite os valores da segunada matriz: ");
		 			matriz2 [l][c] = sis.nextInt();
		 	}
		 	}
		 	
		 	System.out.println("Escolha uma op��o: \n1-Soma \n2-Subtra��o \n3-Adicionar uma constante as duas matrizes \n4-imprimir as matrizes");
		 	opcoes = sis.nextInt();
		 	
		 
		 	if(opcoes==1) {
		 		for(l=0; l<matriz1.length; l++) {
			 		for(c=0; c<matriz1.length; c++) {
		 		matriz3[l][c]= matriz1[l][c] + matriz2[l][c];
		 		System.out.println("A soma da matriz1 e a matriz2 �: " + matriz3[l][c]);
		 	}
		 	}
		 	}
		 	if(opcoes==2)  {
		 		for(l=0; l<matriz1.length; l++) {
			 		for(c=0; c<matriz1.length; c++) {
		 		matriz3[l][c]= matriz1[l][c] - matriz2[l][c];
		 		System.out.println("A subtra��o entre matriz1 e a matriz2 �: " + matriz3[l][c]);
		 	}
		 	}
		 	}
		 	if(opcoes==3)  {	
		 	System.out.println("Digite uma constante: ");
		 	constante = sis.next();
		 		for(l=0; l<matriz1.length; l++) {
			 		for(c=0; c<matriz1.length; c++) {
		 		System.out.println("A constante adicionada �: " + matriz3[l][c] + constante);
			 }
			 }
		 	}
		 	if(opcoes==4) {
		 		for(l=0; l<matriz1.length; l++) {
			 		for(c=0; c<matriz1.length; c++) {
		 	System.out.println("Os valores das matriz1 �:  " + matriz1[l][c]);
			 		}
		 		}
		 		
			for(l=0; l<matriz2.length; l++) {
		 		for(c=0; c<matriz2.length; c++) {
		 	System.out.println("Os valores das matriz2 �:  " + matriz2[l][c]);
	}
	}
}
}
		 	
}

