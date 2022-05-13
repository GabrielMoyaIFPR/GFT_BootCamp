package sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

	public static void main (String [] args) {
		
		System.out.println("Ordem Aleat�ria: ");
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("GOT", "fantasia", 60));
			add(new Serie("Friends", "comedia", 20));
			add(new Serie("TWD", "terror", 45));
		}};
		
		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("\nOrdem Inser��o: ");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("GOT", "fantasia", 60));
			add(new Serie("Friends", "comedia", 20));
			add(new Serie("TWD", "terror", 60));
		}};
		
		for (Serie serie : minhasSeries1) {
			System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("\nOrdem Natural (Tempo Epis�dio): ");
		Set<Serie> minhasSeries2 = new TreeSet(minhasSeries1);
		for (Serie serie : minhasSeries2) {
			System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		}
		System.out.println(minhasSeries2);
		
		
		
		System.out.println("\nOrdem Nome-Genero-TempoEpisodio: ");
		Set<Serie> minhasSeries3 = new TreeSet(new ComparetorNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries);
		
		for (Serie serie : minhasSeries3) {
			System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		}
		
	
	}
	
}

class Serie implements Comparable <Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}


	public String getGenero() {
		return genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if(tempoEpisodio != 0) {
			return tempoEpisodio;
		}
		return this.getGenero().compareTo(serie.getGenero());
	}

	
}

class ComparetorNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) {return nome;}
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) {return genero;}
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	
}