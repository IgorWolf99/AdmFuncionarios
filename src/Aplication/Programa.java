package Aplication;

import java.util.Scanner;

import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// Cadastro Usuário
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Sobrenome: ");
		String sobrenome = sc.next();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Sexo: ");
		char sexo = sc.next().toUpperCase().charAt(0);
		
		Funcionario func = new Funcionario(nome, sobrenome, idade, sexo);
		
		System.out.println("\nSetores"
				+ "\n1 - Recursos Humanos"
				+ "\n2 - TI"
				+ "\n3 - Compras"
				+ "\n4 - Vendas"
				+ "\n5 - Almoxarifado");
		
		System.out.print("Defina o Setor: ");
		int set = sc.nextInt();
		func.setSetor(set);
		
		
		
		
// ------------------------------------------------------------------		
		System.out.println(func.info());

		
		
		
	}

}
