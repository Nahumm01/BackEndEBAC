import java.util.Scanner;

/**
 * A simple calculator for final exams media.
 * @author nahum
 */
public class TarefaControleFluxo {

	public static void main(String[] args) {
		finalMediaIf();
	}

	public static int finalMediaIf (){
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a nota do primeiro bimestre: ");
		int notaPrimeiroBimestre = input.nextInt();
		System.out.println("Digite a nota do segundo bimestre: ");
		int notaSegundoBimestre = input.nextInt();
		System.out.println("Digite a nota do terceiro bimestre: ");
		int notaTerceiroBimestre = input.nextInt();
		System.out.println("Digite a nota do quarto bimestre: ");
		int notaQuartoBimestre = input.nextInt();
		int notaMedia = Math.round((notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre) / 4);

		System.out.println("Média: " + notaMedia + "!");

		if (notaMedia >= 7) {
			System.out.println("Aluno Aprovado!");
		} else if(notaMedia >= 5 && notaMedia < 7) {
			System.out.println("Aluno em Recuperação!");
		}else if(notaMedia < 5){
			System.out.println("Aluno Reprovado!");
		}
		return notaMedia;
	}

	
}
