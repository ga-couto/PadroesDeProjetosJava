package com.Strategy;

public class ComportamentoNormal implements IComportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se de forma normal");
		int x,a,b;
		a = gerador.nextInt(5)+1;
		b = gerador.nextInt(5)+1;
		System.out.println("A = "+ a);
		System.out.println("B = "+ b);
		x = a + b;
		System.out.println("Velocidade -> X = "+x);
		System.out.println("------------------- MOVIMENTO NORMAL FINALIZADO -------------------");
	}

}
