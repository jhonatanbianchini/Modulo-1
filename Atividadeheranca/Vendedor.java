package Atividadeheranca;

public class Vendedor extends Pessoa {
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor (String nome, String endereco, String cpf, double valorvendas, double comissao)
	{
		super(nome, endereco, cpf);
		this.valorVendas = valorvendas;
		this.comissao = comissao;
	}
	public void cacularvalor()
	{
		double venda_total =valorVendas - (valorVendas*(comissao/100));
		System.out.println("O valor de total da comissão com as vendas do vendedor "+getNome()+ "é: ");
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
