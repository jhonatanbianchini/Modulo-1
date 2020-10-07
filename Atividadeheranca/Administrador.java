package Atividadeheranca;

public class Administrador extends Pessoa{
	
	private Double ajudaDeCustos;
	
	public Administrador (String nome, String endereco, String cpf, double ajudadecustos)
	{
		super(nome, endereco, cpf);
		this.ajudaDeCustos = ajudadecustos;
		
	}

	public Double getAjudaDeCustos() {
		return ajudaDeCustos;
	}

	public void setAjudaDeCustos(Double ajudaDeCustos) {
		this.ajudaDeCustos = ajudaDeCustos;
	}
	

}
