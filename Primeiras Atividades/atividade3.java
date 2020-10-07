package pa;

import java.util.Scanner;

public class pa2 {
	public static void main(String args[])
	{
		float a,b,c,media;
		
		Scanner ler = new Scanner(System.in);
		System.out.printf("insira a nota: ");
		a = ler.nextFloat();
		System.out.printf("insira a nota: ");
		b = ler.nextFloat();
		System.out.printf("insira a nota: ");
		c = ler.nextFloat();
		
		media = a+b+c;
		media = media / 3;
				
		System.out.printf("Media das notas é: " + media);
		
		
	}

}