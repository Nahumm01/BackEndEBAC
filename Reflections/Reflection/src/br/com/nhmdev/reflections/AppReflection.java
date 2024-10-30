package br.com.nhmdev.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflection {
	public static void main(String[] args) {
		Class clazz = Produto.class;
		try {
			Constructor cons = clazz.getConstructor();
			Produto prod1 = (Produto) cons.newInstance();
			System.out.println(cons);
			System.out.println(prod1);

			Field[] fields = prod1.getClass().getDeclaredFields();
			for (Field field : fields){
				Class<?> type = field.getType();
				String nome = field.getName();

				System.out.println(type);
				System.out.println(nome);
			}

			Method[] methods = prod1.getClass().getDeclaredMethods();
			for (Method m : methods) {
				Class<?> type = m.getReturnType();
				String nome = m.getName();
				System.out.println("Método: " + nome);
				System.out.println("Tipo de retorno: " + type.getName());
				System.out.println("Executando método...");

				try {
					if (nome.startsWith("get")) {
						// Ignora `null` para métodos `get` caso retornem vazio
						Object result = m.invoke(prod1);
						if (result != null) {
							System.out.println("Resultado: " + result);
						} else {
							System.out.println("Resultado: null (não definido)");
						}
					} else if (nome.startsWith("set")) {
						for (Class<?> paramType : m.getParameterTypes()) {
							if (paramType.equals(String.class)) {
								m.invoke(prod1, "Descricao Produto");
							} else if (paramType.equals(Long.class)) {
								m.invoke(prod1, 1L);
							} else if (paramType.equals(Double.class)) {
								m.invoke(prod1, 2.0);
							}
						}
						System.out.println("Método `set` executado.");
					}
				} catch (Exception e) {
					System.out.println("Erro ao invocar método: " + e.getMessage());
				}
				System.out.println();
			}

		} catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
			throw new RuntimeException(e);
		}
	}
}
