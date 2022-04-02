package com.Strategy;

public class ComportamentoDefensivo implements IComportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se de forma defensiva");int x,a,b;
		a = gerador.nextInt(1);
		b = gerador.nextInt(1);
		System.out.println("A = "+ a);
		System.out.println("B = "+ b);
		x = a + b;
		System.out.println("Velocidade -> X = "+x);
		System.out.println("------------------- MOVIMENTO DEFENSIVO FINALIZADO -------------------");
	}

}
