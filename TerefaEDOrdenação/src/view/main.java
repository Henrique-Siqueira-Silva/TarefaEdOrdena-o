package view;

import controller.ordenar;

public class main {

	public static void main(String[] args) {
		ordenar m = new ordenar();
		int[] vet1 = new int[] { 74, 20, 74, 87, 16, 25, 99, 44, 58 };
		int[] vet2 = new int[] { 44, 43, 42, 41, 40, 39, 38 };
		int[] vet3 = new int[] { 101, 102, 103, 125, 124, 123, 104, 105, 106, 122 };

		vet1 = m.Bublle(vet1);
		vet2 = m.Bublle(vet2);
		vet3 = m.Bublle(vet3);

		System.out.println("Vetor 1 ordenado por Bubblersort:");
		for (int i = 0; i < vet1.length; i++) {
			System.out.print(vet1[i] +" ");
		}
		System.out.println(" ");
		System.out.println("Vetor 2 ordenado por Bubblersort:");
		for (int i = 0; i < vet2.length; i++) {
			System.out.print(vet2[i] +" ");
		}
		System.out.println(" ");
		System.out.println("Vetor 3 ordenado por Bubblersort:");
		for (int i = 0; i < vet3.length; i++) {
			System.out.print(vet3[i]+" ");
		}

		vet1 = new int[] { 74, 20, 74, 87, 16, 25, 99, 44, 58 };
		vet2 = new int[] { 44, 43, 42, 41, 40, 39, 38 };
		vet3 = new int[] { 101, 102, 103, 125, 124, 123, 104, 105, 106, 122 };
		
		vet1 = m.Merge(vet1);
		vet2 = m.Merge(vet2);
		vet3 = m.Merge(vet3);
		System.out.println(" ");
		System.out.println("Vetor 1 ordenado por Mergesort:");
		for (int i = 0; i < vet1.length; i++) {
			System.out.print(vet1[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Vetor 2 ordenado por Mergesort:");
		for (int i = 0; i < vet2.length; i++) {
			System.out.print(vet2[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Vetor 3 ordenado por Mergesort:");
		for (int i = 0; i < vet3.length; i++) {
			System.out.print(vet3[i]+" ");
		}

	}

}
