package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Filme;
import model.Serie;
import model.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {
	
		  Filme favorito = new Filme("The Matrix", 1999);
		  favorito.avalia(9);
		  Filme meuFilme = new Filme("Poderoso Chefao",1970);
		  meuFilme.avalia(6);
		  Serie lost = new Serie("Lost", 2000);
		  lost.avalia(4);
		  var filmeDoPaulo = new Filme("Dogville", 2003);
		  filmeDoPaulo.avalia(10);
		  
		  ArrayList<Titulo>lista = new ArrayList<>();
	        lista.add(favorito);
	        lista.add(filmeDoPaulo);
	        lista.add(meuFilme);
	        lista.add(lost);
	        
	        for (Titulo item : lista) {
	        //	System.out.println(item);
	        	System.out.println(item.getNome());
	        	if(item instanceof Filme f && f.getClassificacao() >2)
	        	System.out.println("Classificaçao " + f.getClassificacao());
			}
	        
	        ArrayList<String>buscaPorArtista = new ArrayList<>();
	        buscaPorArtista.add("paulo");
	        buscaPorArtista.add("jaqueline");
	        buscaPorArtista.add("Biel");
	        System.out.println(buscaPorArtista);
	        
	        Collections.sort(buscaPorArtista);
	        System.out.println("Odenado " + buscaPorArtista);
	        System.out.println();
	        Collections.sort(lista);
	        System.out.println("Lista ordenada de titulos: " + lista);
	        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
	        System.out.println("Ordenando por ano" + lista);
	        
	        
	        

	}

}
