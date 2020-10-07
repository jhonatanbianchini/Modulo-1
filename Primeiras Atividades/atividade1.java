package pa;

import java.util.Scanner;

public class pa2 {
	public static void main(String args[])
	{
		int idade, anos, dias, totaldias, meses;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a Idade");
		idade = ler.nextInt();
		
		anos = 365*idade;
		meses = 12 * idade;
		System.out.println("Idade anos vividos " + idade);
		System.out.println("Meses vividos " + meses);
		System.out.println("Dias vividos " + anos);
		
	}

}
