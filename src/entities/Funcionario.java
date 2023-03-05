package entities;

import java.util.Random;

public class Funcionario extends Cadastro {
	private int matricula;
	private String setor;
	private double salario;
	
// Metodos
	public String info() {
		return "\nInformações do Funcionario"
				+ "\nMatricula: " + matricula + "\nNome: " + nome + " " 
			+ sobrenome + "\nIdade: " + idade + " Sexo: " + sexo
			+ "\nSetor: " + setor + "\nSalário: R$ " + String.format("%.2f", salario);
	}
	
	public void setSetor(int cod) {
		switch (cod) {
			case 1:
				this.setor = "Recursos Humanos";
				this.salario = 2304;
				break;
			case 2:
				this.setor = "TI";
				this.salario = 2008.50;
				break;
			case 3:
				this.setor = "Compras";
				this.salario = 2150.70;
				break;
			case 4:
				this.setor = "Vendas";
				this.salario = 2500;
				break;
			case 5:
				this.setor = "Almoxarifado";
				this.salario = 1850.90;
				break;
			default:
				break;
		}
	}
	
	

	// Metodos Especiais
	public Funcionario(String nome, String sobrenome, int idade, char sexo) {
		super(nome, sobrenome, idade, sexo);
		Random random = new Random();
		int num = random.nextInt(1000,5000);
		this.matricula = num;
		this.setor = "Sem setor";
		this.salario = 0;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
}
