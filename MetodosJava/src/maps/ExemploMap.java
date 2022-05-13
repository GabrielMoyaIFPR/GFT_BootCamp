package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
	public static void main(String [] args) {
				//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], fa�a:
		
				System.out.println("Crie um dicionario que relacione os modelos a seus respectivos consumos :");
				Map<String, Double> carrosPopulares = new HashMap<>() {{
					put("gol", 14.4);
					put("uno", 15.6);
					put("mobi", 16.1);
					put("hb20", 14.5);
					put("kwid", 15.6);
					
				}};
				System.out.println(carrosPopulares.toString());

				
				System.out.println("\nSubstitua o consumo do gol por 15.2 km/l: ");
				carrosPopulares.put("gol", 15.2);
				System.out.println(carrosPopulares.toString());
				
				
				System.out.println("\nConfira se o modelo tucson est� no dicion�rio: " + carrosPopulares.containsKey("tucson"));
				
			
				System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));
				
				
				System.out.println("\nExiba os modelos: " + carrosPopulares.keySet());
				
				
				System.out.println("\nExiba os consumos dos carros: " + carrosPopulares.values());
				
				
				Double maisEficiente = Collections.max(carrosPopulares.values());
				Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
				String modeloMaisEficiente = "";
				
				for(Map.Entry<String, Double> entry : entries) {
					if(entry.getValue().equals(maisEficiente)) {
						modeloMaisEficiente = entry.getKey();
						System.out.println("\nExiba o modelo mais eficiente: " + modeloMaisEficiente + " - " + maisEficiente);
					}
				}
				
				
				Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
				String modeloMenosEficiente = "";
				
				for(Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
					if(entry.getValue().equals(consumoMenosEficiente)) {
						modeloMenosEficiente = entry.getKey();
						System.out.println("\nExiba o modelo menos econ�mico e seu consumo: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
					}
				}


				
				Iterator<Double> iterator = carrosPopulares.values().iterator();
				Double soma = 0d;
				while(iterator.hasNext()) {
					soma += iterator.next();
				}
				System.out.println("\nExiba a soma dos consumos: " + soma );
				
				System.out.println("\nExiba a m�dia dos consumos: " + (soma/carrosPopulares.size()));
				
				
				
				System.out.println("\nRemova os modelos com consumo igual a 15,6 km/l:" );
				Iterator<Double> iterator1 = carrosPopulares.values().iterator();
				
				while(iterator1.hasNext()) {
					
					if(iterator1.next().equals(15.6)) {
						iterator1.remove();
					}
				}
				System.out.println(carrosPopulares.toString());
				
				
				System.out.println("\nExiba todos os carros na ordem em que foram informados:" );
				Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
					put("gol", 14.4);
					put("uno", 15.6);
					put("mobi", 16.1);
					put("hb20", 14.5);
					put("kwid", 15.6);
					
				}};
				System.out.println(carrosPopulares1.toString());
				
				System.out.println("\nExiba o dicion�rio ordenado pelo modelo:");
				Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
				System.out.println(carrosPopulares2.toString());
				
				System.out.println("\nApague o dicion�rio de carros:");
				carrosPopulares.clear();
				System.out.println(carrosPopulares.toString());
				
				
				System.out.println("\nConfira se a lista est� vazia: " + carrosPopulares.isEmpty());
				System.out.println("\nConfira se a lista est� vazia: " + carrosPopulares1.isEmpty());
				System.out.println("\nConfira se a lista est� vazia: " + carrosPopulares2.isEmpty());
	}
}
