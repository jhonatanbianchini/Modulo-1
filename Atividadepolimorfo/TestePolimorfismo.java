package Atividadepolimorfo;

public class TestePolimorfismo {
	public static void main(String args[])
	{
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Nyck");
		cachorro.setEmitesom("AuAu");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Spirit");
		cavalo.setEmitesom("brurururu");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Juju");
		preguica.setEmitesom("Arrwww");
		
		Animal[] animais = new Animal[3];
		animais[0]=cachorro;
		animais[1]=cavalo;
		animais[3]=preguica;
		
		for(Animal animal:animais)
		{
			System.out.println(animal.getNome());
		}
		
	}

}
