package atividade;

import java.util.Scanner;

public class vetor1 {
	public static void main (String args[])
	{
		
		
	Scanner ler = new Scanner(System.in);
	int x,somaim=0,somapar=0;
	int[] num = new int [6];
	
	 for (int i = 0; i < num.length; i++)
	{
		System.out.println("Digite um numero: ");
		num[i] = ler.nextInt();
		if(num[i]%2==0)
		{
			somapar = somapar +num[i];
			System.out.println("numero par é: "+num[i]);
		}
		else
		{
			somaim++;
			System.out.println("numero impar é: "+num[i]);
		}
		
		
	}
	 System.out.println("A soma de par é:"+ somapar);
		System.out.println("A quantidade de impares "+ somaim);
	}

}
