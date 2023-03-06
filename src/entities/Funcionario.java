package entities;

import java.util.Random;
import java.util.Scanner;

public class Funcionario extends Cadastro {
	private int matricula;
	private String setor;
	private double salario;
	
	Scanner val = new Scanner(System.in);
	
// Metodos
	public String info() {
		return "\nInformações do Funcionario"
				+ "\nMatricula: " + matricula + "\nNome: " + nome + " " 
			+ sobrenome + "\nIdade: " + idade + " Sexo: " + sexo
			+ "\nSetor: " + setor + "\nSalário: R$ " + String.format("%.2f", salario);
	}
	
	
	public void mudarInfo() {
		boolean sair = true;
		while (sair) {
			System.out.println("\nSelecione a opção que deseja mudar"
					+ "\n1 - Nome"
					+ "\n2 - Sobrenome"
					+ "\n3 - Idade"
					+ "\n4 - Sexo"
					+ "\n5 - Matricula"
					+ "\n7 - Ver informações do funcionario"
					+ "\n8 - Sair\n");
			System.out.print("> ");
			int opc = val.nextInt();
			switch (opc) {
			case 1: {
				System.out.print("Digite o novo nome: ");
				String nome = val.next();
				super.setNome(nome);
				System.out.println("Nome alterado com sucesso.");
				break;
			}
			case 2:{
				System.out.print("Digite o novo Sobrenome: ");
				String sobrenome = val.next();
				super.setSobrenome(sobrenome);
				System.out.println("Sobrenome alterado com sucesso.");
				break;
			}
			case 3:{
				System.out.print("Digite a nova idade: ");
				int idade = val.nextInt();
				super.setIdade(idade);
				System.out.println("Idade alterada com sucesso.");
				break;
			}
			case 4:{
				System.out.print("Digite o novo sexo: ");
				char sexo = val.next().toUpperCase().charAt(0);
				super.setSexo(sexo);
				System.out.println("Sexo alterado com sucesso.");
				break;
			}
			case 5:{
				System.out.print("Digite a nova Matricula: ");
				int matricula = val.nextInt();
				this.setMatricula(matricula);
				System.out.println("Matricula alterada com sucesso.");
				break;
			}
			case 7:{
				System.out.print("============================");
				System.out.println(info());
				System.out.printf("============================\n");
				break;
			}
			case 8:{
				sair = false;
				break;
			}
			}
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
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
}
