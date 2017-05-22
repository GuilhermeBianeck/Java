public class HeartRates
{
	// TODOS OA ATRIBUTOS DO PROJETO;
	private String nome;
	private String sobrenome;
	private int nascDia;
	private int nascMes;
	private int nascAno;
	private int dia;
	private int mes;
	private int ano;
	private int idade;
	private int fmax;
	private double fa1;
	private double fa2;

	// MÈTODO CONSTRUTOR
	public HeartRates (String userNome, String userSobrenome, int userDia, int userMes, int userAno, int anoAtual, int mesAtual, int diaAtual)
	{
		//Atribuindo valores
		this.nome = userNome;
		this.sobrenome = userSobrenome;
		this.nascDia = userDia;
		this.nascMes = userMes;
		this.nascAno = userAno;
		this.dia = diaAtual;
		this.mes = mesAtual;
		this.ano = anoAtual;
	}

	// Métodos Get > Atribuição de valores.
	public String getNome(){
		return nome;
	}
	public String getSobrenome(){
		return sobrenome;
	}
	public int getNascDia(){
		return nascDia;
	}
	public int getNascMes(){
		return nascMes;
	}
	public int getNascAno(){
		return nascAno;
	}
	public int getDia(){
		return dia;
	}
	public int getMes(){
		return mes;
	}
	public int getAno(){
		return ano;
	}
	public int getIdade(){
		return idade;
	}
	public int getFmax(){
		return fmax;
	}
	public double getFa1(){
		return fa1;
	}
	public double getFa2(){
		return fa2;
	}

	//Métodos para definir valores.
	public int idade(){
		return this.ano-this.nascAno;
	}

	public int calculaIdade(){
		if(this.ano > this.nascAno){
			if(this.mes > this.nascMes){
				this.idade = idade();
			}else if (this.mes == this.nascMes){
				if (this.dia >= this.nascDia){
					this.idade = idade();
				}else {
					this.idade = idade() - 1;
				}
			}else if (this.mes < this.nascMes){
				this.idade = idade() -1;
			}
		}
		return idade;
	}

	// FREQUENCIA CARDIACA MÁXIMOA
	public int calculaFmax(){
		this.fmax = 220 - this.idade;
		return fmax;
	}

	// FREQUENCIA CARDIACA ALVO
	public void calculaFa(){
		this.fa1 = this.fmax * 0.5;
		this.fa2 = this.fmax * 0.85;
	}

}