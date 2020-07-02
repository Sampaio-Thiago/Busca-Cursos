import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CursoAplication {
	
	public static void main(String args[]) {
		int codigoCurso = 0;
		Scanner entrada = new Scanner(System.in);
		
		Map<Integer, List<String>>mapCursos = new HashMap<Integer, List<String>>();
		
		List<String> cursos = new ArrayList<String>();
		
		cursos.add("Java Básico");
		cursos.add("Java Intermediário");
		cursos.add("Java Avançado");
		mapCursos.put(1, cursos);
		
		cursos = new ArrayList<String>();
		cursos.add("Inglês Básico");
		cursos.add("Inglês Intermediário");
		cursos.add("Inglês Avançado");
		mapCursos.put(2, cursos);
		
		cursos = new ArrayList<String>();
		cursos.add("Alemão Básico");
		cursos.add("Alemão Intermediário");
		cursos.add("Alemão Avançado");
		mapCursos.put(3, cursos);
		
		cursos = new ArrayList<String>();
		cursos.add("Japonês Básico");
		cursos.add("Japonês Intermediário");
		cursos.add("Japonês Avançado");
		mapCursos.put(4, cursos);
		
		System.out.println("Digite o código do curso(1 Java  | 2 - Inglês | 3 - Alemão | 4 - Japonês): ");
		codigoCurso = entrada.nextInt();
		
		for (String curso : mapCursos.get(codigoCurso)) {
			System.out.println(curso);
	
		}
		
	}

}
