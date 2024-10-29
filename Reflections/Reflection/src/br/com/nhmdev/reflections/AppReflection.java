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
			for (Method m : methods){
				Class<?> type = m.getReturnType();
				String nome = m.getName();

				System.out.println(type);
				System.out.println(nome);

				System.out.println("Executando métodos: ");
				if (m.getName().startsWith("get")){
					System.out.println(m.invoke(prod1));
				} else {
					for (Class classTypes : m.getParameterTypes()){
						if (classTypes.equals(String.class)) {
							System.out.println(m.invoke(prod1, "Descricao Produto"));
						} else if (classTypes.equals(Long.class)) {
							System.out.println(m.invoke(prod1, 1L));
						} else {
							System.out.println(m.invoke(prod1, 2d));
						}
					}

				}
			}
		} catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
			throw new RuntimeException(e);
		}
	}
}
