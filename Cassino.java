import java.util.Random;

public class Cassino {
	private String nome;
	private int ano;
	private String cnpj;
	private static Cassino cassino;

	private Cassino() {

	}

	public static Cassino getInstance() {
		if (cassino == null) {
			cassino = new Cassino();
		}
		return cassino;

	}

	public int getRandomInt(int maxNumber) {
		int[] valorAmazena = new int[maxNumber];
		int valor = 0;
		Random radom = new Random();
		radom.nextInt(maxNumber);
		for (int i = 0; i < valorAmazena.length; i++) {
			if (valorAmazena[i] != radom.nextInt(maxNumber)) {
				valor = radom.nextInt(maxNumber);
				for (int j = 0; j < valorAmazena.length; j++) {
					if (valorAmazena[j] == 0) {
						valorAmazena[j] = radom.nextInt(maxNumber);
					}

				}
			}

		}
	return valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	
}
