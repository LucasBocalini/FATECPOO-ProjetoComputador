package com.bocalini.lucas;

public class ComputadorTeste {

    public static void main(String[] args) {
	Computador comp1 = new Computador();
	comp1.setNumeroSerie(1);
	comp1.setModelo("XS");
	comp1.setMarca("IBM");
	comp1.setPreco(3000.00);
	comp1.setCor("Preta");

	comp1.imprimir();


	comp1.calcularValor();


	comp1.imprimir();

	Computador comp2 = new Computador();
	comp2.setNumeroSerie(2);
	comp2.setModelo("XLR8");
	comp2.setCor("Prata");
	comp2.setMarca("HP");
	comp2.setPreco(2500.00);


	comp2.imprimir();

	comp2.calcularValor();

	comp2.imprimir();

	if (comp2.alterarValor(500)==1){
		System.out.println("Preco alterado");
	}else{
		System.out.println("Preco não alterado");
	}

	comp2.getPreco();
		System.out.println(comp2.getPreco());

    }
}
