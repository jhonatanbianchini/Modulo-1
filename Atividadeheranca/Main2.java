package Atividadeheranca;

public class Main2 {
	public static void main (String args)
	{
	
	Pessoa maria = new Pessoa ("Maria","Taubat�","45854214588");
	
	System.out.println("\nNome: "+maria.getNome());
	System.out.println("\nEndereco: "+maria.getEndereco());
	System.out.println("\nCPF :"+maria.getCpf());
	
	Vendedor socrates = new Vendedor ("S�crates","Gr�cia","52463254785", 800, 30);
	
	System.out.println("\nNome: "+socrates.getNome());
	System.out.println("\nEndereco: "+socrates.getEndereco());
	System.out.println("\nCPF: "+socrates.getCpf());
	System.out.println("\nValor das vendas: "+socrates.getValorVendas());
	System.out.println("\nComiss�o: "+socrates.getComissao());
	socrates.cacularvalor();
	
	Administrador platao = new Administrador("Plat�o","Gr�cia","32547154875", 850);
	
	System.out.println("\nNome: "+platao.getNome());
	System.out.println("\nEdere�o: "+platao.getEndereco());
	System.out.println("\nCPF: "+platao.getCpf());
	System.out.println("\nAjuda de custos: "+platao.getAjudaDeCustos());
	}

}
