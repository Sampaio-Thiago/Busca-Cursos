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
		
		cursos.add("Java B�sico");
		cursos.add("Java Intermedi�rio");
		cursos.add("Java Avan�ado");
		mapCursos.put(1, cursos);
		
		cursos = new ArrayList<String>();
		cursos.add("Ingl�s B�sico");
		cursos.add("Ingl�s Intermedi�rio");
		cursos.add("Ingl�s Avan�ado");
		mapCursos.put(2, cursos);
		
		cursos = new ArrayList<String>();
		cursos.add("Alem�o B�sico");
		cursos.add("Alem�o Intermedi�rio");
		cursos.add("Alem�o Avan�ado");
		mapCursos.put(3, cursos);
		
		cursos = new ArrayList<String>();
		cursos.add("Japon�s B�sico");
		cursos.add("Japon�s Intermedi�rio");
		cursos.add("Japon�s Avan�ado");
		mapCursos.put(4, cursos);
		
		System.out.println("Digite o c�digo do curso(1 Java  | 2 - Ingl�s | 3 - Alem�o | 4 - Japon�s): ");
		codigoCurso = entrada.nextInt();
		
		for (String curso : mapCursos.get(codigoCurso)) {
			System.out.println(curso);
	
		}
		
	}

}
