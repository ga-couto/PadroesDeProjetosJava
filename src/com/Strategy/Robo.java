package com.Strategy;

public class Robo {
	
	
	private IComportamento comportamento;

	public void setComportamento(IComportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		System.out.println("Irei tomar uma decis�o!");
		comportamento.mover();
	}
	
}
