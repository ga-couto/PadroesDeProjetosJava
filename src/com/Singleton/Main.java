package com.Singleton;

public class Main {
	public static void main(String args[]) {
		
		
		System.out.println("Teste relacionado ao Desing Pattern Singleton: ");
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyh = SingletonLazyHolder.getInstancia();
		System.out.println(lazyh);
		lazyh = SingletonLazyHolder.getInstancia();
		System.out.println(lazyh);
		
	}
}
