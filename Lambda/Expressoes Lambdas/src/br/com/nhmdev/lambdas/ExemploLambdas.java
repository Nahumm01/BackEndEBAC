package br.com.nhmdev.lambdas;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class ExemploLambdas {
	public static void main(String[] args) {

		IntBinaryOperator intBinaryOperator = Integer::sum;
		int result = intBinaryOperator.applyAsInt(1,1);

		System.out.println(result);

		//Sem lambda
		IntBinaryOperatorClass ope = new IntBinaryOperatorClass();
		int result2 = ope.applyAsInt(1,1);
		System.out.println(result2);

		BiFunction<Double,Double,String> biFunctions = (Double a, Double b) -> {
			Double re = a + b;
			return String.valueOf(re);
		};
		String resultBi = biFunctions.apply(10d,10d);
		System.out.println(resultBi);

		calcular(1L, 2L,(Long t, Long u) ->{
			return t + u;
		});

		//Simplificando
		calcular(1L,2L,(v1,v2) -> v1+v2);

		//Simplificando ainda mais
		calcular(1L,2L,Long::sum);
	}

	private static Long calcular(Long t, Long u, BiFunction<Long,Long,Long> function){
		return function.apply(t,u);
	}


}
