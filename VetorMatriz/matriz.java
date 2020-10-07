package atividade;

import java.util.Scanner;

public class matriz {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int matriz[][] =new int[3][3];
		int maior=0,linha,coluna;
		
		for( linha = 0; linha < matriz.length; linha++)
		{
			
			for( coluna = 0; coluna < matriz.length; coluna++)
			{
				System.out.println("Digite um numero: ");
				matriz[linha][coluna]= ler.nextInt();
							
				
			}
			if(matriz[linha][coluna]>10)
			{
				maior=matriz[linha][coluna];
				System.out.println("os numeros maiores são: "+maior);
			}
		}
		
		
		
	}

}
