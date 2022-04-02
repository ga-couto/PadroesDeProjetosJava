package com.Strategy;
import java.util.Random;
public class ComportamentoAgressivo implements IComportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se de forma Agressiva");
		int x,a,b;
		a = gerador.nextInt(10)+5;
		b = gerador.nextInt(10)+5;
		System.out.println("A = "+ a);
		System.out.println("B = "+ b);
		x = a *b;
		System.out.println("Velocidade -> X = "+x);
		System.out.println("------------------- MOVIMENTO AGRESSIVO FINALIZADO -------------------");
	}

}
