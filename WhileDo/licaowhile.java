package atividade;

import java.util.Scanner;

public class licaowhile {
	public static void main ( String args[])
	{
		int idade,total21=1,total50=0;
		
		Scanner ler = new Scanner (System.in);
		System.out.println(" Insira uma idade: ");
	    idade = ler.nextInt();
				 
		while(idade<99)
		{
				System.out.println(" Insira uma idade: ");
			    idade = ler.nextInt();
			
			if(idade<=21)
			{
				total21= total21 + idade;
				total21++;
			}
			if(idade>=50)
			{
				total50=total50 + idade;
				total50++;	
			}
			else
			{
				System.out.println("Digite outra idade");
			}
			
		
			System.out.println("Quantidade de pessoas com até 21 anos é:"+ total21);
			System.out.println("Quantidade de pessoas com mais de 50 anos é:"+ total50);
		}
	}
}

			
		
	
	


