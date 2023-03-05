package Aplication;

import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Funcionario func = new Funcionario("Sergio", "Melo", 34, 'M');
		
		
		
		System.out.println("Setores"
				+ "\n1 - Recursos Humanos"
				+ "\n2 - TI"
				+ "\n3 - Compras"
				+ "\n4 - Vendas"
				+ "\n5 - Almoxarifado");
		
		func.setSetor(3);
		
		
		
		
// ------------------------------------------------------------------		
		System.out.println(func.info());

		
		
		
	}

}
