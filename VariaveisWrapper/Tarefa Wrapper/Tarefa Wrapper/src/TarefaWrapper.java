/**
 * @author nahum
 */
public class TarefaWrapper {
	public static void main(String[] args) {
		//1
		//Declarando tipo primitivo
		int num = 1000000000;
		Integer num2 = num;
		System.out.println("PRIMITIVO convertido em WRAPPER " + num2);
		//Ou
		System.out.println("PRIMITIVO convertido em WRAPPER " + (Integer)num);

		//2
		//Declarando tipo wrapper
		Integer num3 = 1000000000;
		int num4 = num3;
		System.out.println("WRAPPER convertido em PRIMITIVO " + num4);
		//Ou
		System.out.println("WRAPPER convertido em PRIMITIVO " + (int)num3);

		//Casting Explícito
		short num5 = (short)num;
		System.out.println("Se o valor recebido for alterado == casting EXPLÍCITO " + num5);



	}
}
