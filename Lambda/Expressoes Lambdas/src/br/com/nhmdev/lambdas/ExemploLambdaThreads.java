package br.com.nhmdev.lambdas;

public class ExemploLambdaThreads {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Executando Thread Comum");
			}
		};
		new Thread(r).start();

		Runnable rLambda = () -> System.out.println("Executando Thread com Lambda");
		new Thread(rLambda).start();

		new Thread(() -> System.out.println("Executando Thread com Lambda Simplificada"));
	}
}
