package Atividadeheranca;

public class Main2 {
	public static void main (String args)
	{
	
	Pessoa maria = new Pessoa ("Maria","Taubaté","45854214588");
	
	System.out.println("\nNome: "+maria.getNome());
	System.out.println("\nEndereco: "+maria.getEndereco());
	System.out.println("\nCPF :"+maria.getCpf());
	
	Vendedor socrates = new Vendedor ("Sócrates","Grécia","52463254785", 800, 30);
	
	System.out.println("\nNome: "+socrates.getNome());
	System.out.println("\nEndereco: "+socrates.getEndereco());
	System.out.println("\nCPF: "+socrates.getCpf());
	System.out.println("\nValor das vendas: "+socrates.getValorVendas());
	System.out.println("\nComissão: "+socrates.getComissao());
	socrates.cacularvalor();
	
	Administrador platao = new Administrador("Platão","Grécia","32547154875", 850);
	
	System.out.println("\nNome: "+platao.getNome());
	System.out.println("\nEdereço: "+platao.getEndereco());
	System.out.println("\nCPF: "+platao.getCpf());
	System.out.println("\nAjuda de custos: "+platao.getAjudaDeCustos());
	}

}
