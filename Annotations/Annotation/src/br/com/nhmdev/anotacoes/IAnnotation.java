package br.com.nhmdev.anotacoes;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
public @interface IAnnotation {

	String value();
	String [] listaBairros ();
	long numeroCasa();
	double valores() default 10d;
}


