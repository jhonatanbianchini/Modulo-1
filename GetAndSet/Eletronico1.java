
public class Eletronico1 {
	
	private String modelo;
	private String cor;
	private String tamanho;
	private String helice;
	
	public Eletronico1 (String modelo, String cor, String tamanho, String helice)
	{
		this.modelo=modelo;
		this.cor=cor;
		this.tamanho=tamanho;
		this.helice=helice;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getHelice() {
		return helice;
	}

	public void setHelice(String helice) {
		this.helice = helice;
	}
	

}
