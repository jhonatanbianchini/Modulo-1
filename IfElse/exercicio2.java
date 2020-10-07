package atividade;

import java.util.Scanner;

public class exercicio2 {
	public static void main (String args[])
	{
		int num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num = ler.nextInt();
		
		if(num%2==0)
		{
			num = (int) Math.sqrt(num);
			System.out.println("Raiz do numero par é:"+ num);
		}
		else
		{
			num = (int) Math.pow(num, 2);
			System.out.println("A potencia do numero impar é:"+ num);
		}
	}
	

}