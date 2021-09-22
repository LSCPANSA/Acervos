package exercicio1;

public class Filme {

	String titulo;
	int ano;
	String genero;
	String clasf;
	String dist;
	
	static void criarflm() {
		
		Filme gi = new Filme();
		gi.ano = 2018;
		gi.genero = "Ação/Ficção científica";
		gi.clasf = "12 anos";
		gi.dist = "Walt Disney Studios Motion Pictures";
		gi.titulo = "Guerra Infinita";
		mostrarflm(gi);
	
	}
	
	static void mostrarflm(Filme gi) {
		System.out.println("Nome do filme: " +gi.titulo);
		System.out.println("Ano de lancamento: " +gi.ano);
		System.out.println("Genero: " +gi.genero);
		System.out.println("Classificacao: " +gi.clasf);
		System.out.println("Distribuidora: " +gi.dist);
	}
	
	public static void main(String[] args) {
		
		criarflm();
		
		
	}
}