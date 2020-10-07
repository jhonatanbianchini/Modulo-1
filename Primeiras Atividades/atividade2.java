package pa;

import java.util.Scanner;

public class pa2 {
	public static void main(String args[])
	{
		float idade, anos, dias, totaldias, meses;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com os dias vividos");
		dias = ler.nextFloat();
		
		meses = dias/30;
		anos = dias/365;
		System.out.println("Dias vividos " + dias);
		System.out.println("Meses vividos " + meses);
		System.out.println("Anos vividos " + anos);
		
	}

}