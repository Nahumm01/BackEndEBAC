package map;

import domain.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassRoomExample {
	public static void main(String[] args) {
		Map<Integer, List<Aluno>> listaSala = new HashMap<Integer, List<Aluno>>();
		List<Aluno> alunosSala1 = criarTurma("Sala 1", 10);
		listaSala.put(1, alunosSala1);

		List<Aluno> alunosSala2 = criarTurma("Sala 2", 20);
		listaSala.put(2, alunosSala2);

		imprimirAlunos(listaSala.get(1));

	}

	public static List<Aluno> criarTurma(String sala, int count) {
		List<Aluno> alunos = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Aluno aluno = new Aluno("Nome Aluno " + i,"Curso "+ i, i, sala);
			alunos.add(aluno);
		}
		return alunos;
	};

	private static void imprimirAlunos(List<Aluno> alunos) {
		alunos.forEach(aluno -> System.out.println("Nome: " + aluno.getNome() + "Sala: " + aluno.getSala()));
	}
}
