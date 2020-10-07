package atividadePOO;

public class Aviao {
	private String asas;
	private String turbinas;
	private String cor;
	
	public Aviao (String asas, String turbinas, String cor )
	{
		this.asas = asas;
		this.turbinas = turbinas;
		this.cor = cor;
	}

	public String getAsas() {
		return asas;
	}

	public void setAsas(String asas) {
		this.asas = asas;
	}

	public String getTurbinas() {
		return turbinas;
	}

	public void setTurbinas(String turbinas) {
		this.turbinas = turbinas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
