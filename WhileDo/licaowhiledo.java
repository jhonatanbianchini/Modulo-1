package atividade;

import java.util.Scanner;

public class licaowhiledo {
	public static void main(String args[])
	{
		int num, soma=0,total=0;
		Scanner leia = new Scanner (System.in);
		
		do
		{
			System.out.println("Isira um numero: ");
			num = leia.nextInt();
			soma = soma+num;
			
			
		}                                                                                                                                                                   
		while(num>0);
		soma++;
		
		
		System.out.printf("a soma total é: "+ soma);
		 
		 
		 
				
	}

}
