package model;

public class Titulo implements Comparable<Titulo> {

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	
	
	
	public Titulo(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}


	public String getNome() {
		return nome;
	}


	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}


	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}


	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}


	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}


	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}


	public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
		this.somaDasAvaliacoes = somaDasAvaliacoes;
	}


	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}


	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}


	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de Lancamento: " + anoDeLancamento);
		System.out.println("Duraçao em minutos: " + duracaoEmMinutos);
		System.out.println("Incluido no plano: " + incluidoNoPlano);
	}
	
	
	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
	
	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	public double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}


	@Override
	public String toString() {
		return "Titulo: " + this.getNome()+ "(" + this.getAnoDeLancamento() + ")";
	}


	@Override
	public int compareTo(Titulo outroTitulo) {
		
		return this.getNome().compareTo(outroTitulo.getNome());
	}
	
	
}
