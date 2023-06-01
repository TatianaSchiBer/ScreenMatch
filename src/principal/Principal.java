package principal;

import java.util.ArrayList;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import model.Filme;
import model.Serie;

public class Principal {

	public static void main(String[] args) {
	
		        Filme favorito = new Filme("The Matrix", 1999);

		       // favorito.setNome(); 
		        //  favorito.setAnoDeLancamento(1999); 
		        favorito.setDuracaoEmMinutos(135);
		        favorito.setIncluidoNoPlano(true); 

		        favorito.exibeFichaTecnica();
		        favorito.avalia(9);
		        favorito.avalia(8);
		        favorito.avalia(9);

		        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());
		        System.out.println(favorito.pegaMedia());
		        // meuFilme.somaDasAvaliacoes = 10;
		        // meuFilme.totalDeAvaliacoes = 1;
		        // System.out.println(meuFilme.pegaMedia());
		        
		        
		        Filme meuFilme = new Filme("Poderoso Chefao",1970);

		        //meuFilme.setNome(); 
		        // meuFilme.setAnoDeLancamento(); 
		        meuFilme.setDuracaoEmMinutos(200);
		        meuFilme.setIncluidoNoPlano(true); 

		        meuFilme.exibeFichaTecnica();
		        meuFilme.avalia(10);
		        meuFilme.avalia(7);
		        meuFilme.avalia(3);
		        
		        Serie lost = new Serie("Lost", 2000);
		     //  lost.setNome();
		     //   lost.setAnoDeLancamento(2000);
		        lost.exibeFichaTecnica();
		        lost.setTemporadas(10);
		        lost.setEpisodiosPorTemporada(10);
		        lost.setMinutosPorEpisodio(50);
		        System.out.println("Duraçao para maratonar: " + lost.getDuracaoEmMinutos());
		        
		        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		        calculadora.inclui(favorito);
		        System.out.println(calculadora.getTempoTotal());
		        
		        FiltroRecomendacao filtro = new FiltroRecomendacao();
		        filtro.filtra(favorito);
		        
		        var filmeDoPaulo = new Filme("Dogville", 2003);
		        filmeDoPaulo.setDuracaoEmMinutos(200);
		        //filmeDoPaulo.setNome();
		        // filmeDoPaulo.setAnoDeLancamento(2003);
		        filmeDoPaulo.avalia(10);
		        
		        ArrayList<Filme>listaDeFilmes = new ArrayList<>();
		        listaDeFilmes.add(favorito);
		        listaDeFilmes.add(filmeDoPaulo);
		        listaDeFilmes.add(meuFilme);
		        System.out.println("Tamanho da lista " + listaDeFilmes.size());
		        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
		        System.out.println(listaDeFilmes);
		        
		        
		    }
	
	
	

		}
	


