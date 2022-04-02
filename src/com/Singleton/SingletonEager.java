package com.Singleton;

/**
 * Sigleton "apressado".
 * @author Acer
 *
 */

public class SingletonEager {

	
private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
		
	}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	}
}
