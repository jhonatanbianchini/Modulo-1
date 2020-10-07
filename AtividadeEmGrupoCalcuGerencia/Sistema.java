package Atividadesexta;

import java.util.Scanner;

public class Sistema {  
	
	public static void main (String args[])
	{ 
	      
	Scanner ent = new Scanner (System.in);	  
	int opçao;	       
	int opc; 
	Calculadora pessoa1 = new Calculadora ();  
	 
	System.out.println("\n****************************CGADM********************************");
	System.out.println("\n*****************************************************************");
	System.out.println("\n****FAÇA SEUS CALCULOS CORPORATIVOS COM QUALIDADE E SEGURANÇA****");
	System.out.println("\n*****************************************************************");
	
	System.out.println("\n" + "\\QUAL OPÇÃO DESEJA EXECUTAR?/");
	System.out.println("\n1- CALCULADORA SALARIAL \n2- CALCULADORA DE RECISÃO");
	opc = ent.nextInt();
	 
	while (opc != 1 && opc != 2)
	{
		System.out.println("Digite uma opção válida: ");
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
	System.out.println ("\n1- SIM \n2- NÃO ");
	opçao = ent.nextInt();
	while (opçao == 1)    
	{
		System.out.println("\n"+ "\\QUAL OPÇÃO DESEJA EXECUTAR?/");
		System.out.println("\n1- CALCULADORA SALARIAL \n2- CALCULADORA DE RECISÃO");
		opc = ent.nextInt();
		
		while (opc != 1 && opc != 2)
		{
			System.out.println("Digite uma opção válida: ");
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
			System.out.println("Digite uma opção válida: ");
			opc = ent.nextInt();
		}
		
		System.out.println ("\nDeseja rodar nosso sitema novamente?");
		System.out.println ("\n1- SIM \n2- NÃO ");
		opçao = ent.nextInt();		
	}

	System.out.println ("****************OBRIGADO POR ULTILIZAR NOSSO SISTEMA!!!****************");
	
	}
	
}