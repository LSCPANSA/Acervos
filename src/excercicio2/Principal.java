package excercicio2;

public class Principal {

	
	void criarlvr1() {
		
		Lvr1 gc = new Lvr1();
		gc.anopub = 2014;
		gc.autor = "José Carlos Marinho";
		gc.edit = "Global Editora";		
		gc.paginas = 144;
		gc.identifAcervo = "O Genio do Crime";
		mostrarlvr1(gc);
		
	}
	
	void mostrarlvr1(Lvr1 gc) {
		System.out.println("Nome do livro: " +gc.identifAcervo);
		System.out.println("Numero de paginas: " +gc.paginas);
		System.out.println("Nome do autor: " +gc.autor);
		System.out.println("Editora: " +gc.edit);
		System.out.println("Ano publicado: " +gc.anopub);
	}
	
	void criarlvr2() {
		
		Lvr2 bd = new Lvr2();
		bd.anopub = 2015;
		bd.autor = "José Carlos Marinho";
		bd.edit = "Global Editora";		
		bd.paginas = 160;
		bd.identifAcervo = "Berenice Detetive";
		mostrarlvr2(bd);
		
	}
	
	void mostrarlvr2(Lvr2 bd) {
		System.out.println("Nome do livro: " +bd.identifAcervo);
		System.out.println("Numero de paginas: " +bd.paginas);
		System.out.println("Nome do autor: " +bd.autor);
		System.out.println("Editora: " +bd.edit);
		System.out.println("Ano publicado: " +bd.anopub);
	}
	
	void criarlvr3() {
		
		Lvr3 lb = new Lvr3();
		lb.anopub = 1984;
		lb.autor = "José Carlos Marinho";
		lb.edit = "E.Parma";		
		lb.paginas = 134;
		lb.identifAcervo = "O Livro da Berenice";
		mostrarlvr3(lb);

	}

	void mostrarlvr3(Lvr3 lb) {
		System.out.println("Nome do livro: " +lb.identifAcervo);
		System.out.println("Numero de paginas: " +lb.paginas);
		System.out.println("Nome do autor: " +lb.autor);
		System.out.println("Editora: " +lb.edit);
		System.out.println("Ano publicado: " +lb.anopub);
		
	}
	
	void mostrarlvrs() {
		criarlvr1();
		System.out.println("____________________________________");
		criarlvr2();
		System.out.println("____________________________________");
		criarlvr3();
		System.out.println("____________________________________");
	}
	
	public static void main(String[] args) {
		Principal l = new Principal();
		l.mostrarlvrs();
	}
	
}
	

















