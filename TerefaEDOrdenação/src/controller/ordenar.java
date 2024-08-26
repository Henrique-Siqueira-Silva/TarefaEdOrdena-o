package controller;

import br.edu.fateczl.ordenadores.Ordenadores;

public class ordenar {
	
	public ordenar () {
		super();
	}
	
	public int[] Bublle (int[] vet ) {
		Ordenadores ordena = new Ordenadores ();
		ordena.BubbleSort(vet);
		return vet;
	}
	
	public int[] Merge (int[] vet ) {
		Ordenadores ordena = new Ordenadores ();
		ordena.BubbleSort(vet);
		return vet;
	}
	

}
