package Atividadesexta;

import java.util.Scanner;

public class Sistema {  
	
	public static void main (String args[])
	{ 
	      
	Scanner ent = new Scanner (System.in);	  
	int op�ao;	       
	int opc; 
	Calculadora pessoa1 = new Calculadora ();  
	 
	System.out.println("\n****************************CGADM********************************");
	System.out.println("\n*****************************************************************");
	System.out.println("\n****FA�A SEUS CALCULOS CORPORATIVOS COM QUALIDADE E SEGURAN�A****");
	System.out.println("\n*****************************************************************");
	
	System.out.println("\n" + "\\QUAL OP��O DESEJA EXECUTAR?/");
	System.out.println("\n1- CALCULADORA SALARIAL \n2- CALCULADORA DE RECIS�O");
	opc = ent.nextInt();
	 
	while (opc != 1 && opc != 2)
	{
		System.out.println("Digite uma op��o v�lida: ");
		opc = ent.nextInt();
	}
	if (opc == 1)
	{
		System.out.println(pessoa1.opc1());
	}
	else if (opc ==2)
	{
		System.out.println(pessoa1.opc2());
	}
 
	
	System.out.println ("\nDeseja rodar nosso sitema novamente?");
	System.out.println ("\n1- SIM \n2- N�O ");
	op�ao = ent.nextInt();
	while (op�ao == 1)    
	{
		System.out.println("\n"+ "\\QUAL OP��O DESEJA EXECUTAR?/");
		System.out.println("\n1- CALCULADORA SALARIAL \n2- CALCULADORA DE RECIS�O");
		opc = ent.nextInt();
		
		while (opc != 1 && opc != 2)
		{
			System.out.println("Digite uma op��o v�lida: ");
			opc = ent.nextInt();
		}   
		
		if (opc == 1)
		{
			System.out.println(pessoa1.opc1());
		}
		else if (opc ==2)
		{
			System.out.println(pessoa1.opc2());
		}
		else 
		{
			System.out.println("Digite uma op��o v�lida: ");
			opc = ent.nextInt();
		}
		
		System.out.println ("\nDeseja rodar nosso sitema novamente?");
		System.out.println ("\n1- SIM \n2- N�O ");
		op�ao = ent.nextInt();		
	}

	System.out.println ("****************OBRIGADO POR ULTILIZAR NOSSO SISTEMA!!!****************");
	
	}
	
}