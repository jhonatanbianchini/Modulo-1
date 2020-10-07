package Atividadepolimorfo;

public class Preguica extends Animal{
	private String nome;
	private String idade;
	private String emitesom;
	private String subirArvore;
	
	
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
	public String getSubirArvore() {
		return subirArvore;
	}
	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	public String getNome()
	{
		return "Preguiça: " +super.getNome()+ " o Som "+ this.getEmitesom();
	}
	

}
