package Atividadepolimorfo;

public class Cachorro extends Animal {
	private String nome;
	private String idade;
	private String emitesom;
	private String correr;
	
		
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEmitesom() {
		return emitesom;
	}
	public void setEmitesom(String emitesom) {
		this.emitesom = emitesom;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public String getNome()
	{
		return "Cachorro: " +super.getNome()+ " o Som "+ this.getEmitesom();
	}
	

}
