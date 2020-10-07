package atividade;

import java.util.Scanner;

public class exercicio1 {
	public static void main (String args[])
	{
		int idade;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a Idade");
		idade = ler.nextInt();
		
		if (idade>=10 && idade<14)
		{
			System.out.println("Sua idade é do grupo de criança infantil...");
		}
		else if (idade>=15 && idade<17)
		{
			System.out.println("Sua idade é do grupo juvenil...");
		}
		else if (idade>=18 && idade<25)
		{
			System.out.println("Sua idade é de um adulto");
		}
		else
		{
			System.out.println("Idade íncorreta");
		}

	}

}
