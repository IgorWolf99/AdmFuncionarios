package entities;

public abstract class Setores {

	private String setor;
	private double salario;
	
	public void defSetor(String setor, double salario) {
       this.setor = setor;
       this.salario = salario;
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
