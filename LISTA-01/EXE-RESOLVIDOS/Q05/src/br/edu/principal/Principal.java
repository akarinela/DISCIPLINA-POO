package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        Double preço,novo_preço,desconto;
		
		System.out.println("Digite o preço do produto: ");
		 preço = sc.nextDouble();
		 
		 desconto = preço * 10/100;
		 System.out.println("Seu desconto será: " + desconto);
		 
		 novo_preço = preço - desconto;
		 
		 System.out.println("O novo preço será: "  + novo_preço);
		
	}

}