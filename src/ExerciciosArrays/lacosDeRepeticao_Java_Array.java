package ExerciciosArrays;

import java.util.Scanner;

public class lacosDeRepeticao_Java_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int LINHA=3, COLUNA=3;
		int [] [] matriz = new int [LINHA][COLUNA];
		
		int linha, coluna;
		
		System.out.println("MATRIZ");
		
		for(linha=0; linha<LINHA;linha++) {
			
			for(coluna=0; coluna<COLUNA;coluna++) {
				
				System.out.print("\nPosição ["+linha+"] ["+coluna+"]: ");
				
				matriz[linha][coluna] = sc.nextInt();
			}
			System.out.println("\n");
		}
		for(linha=0; linha<LINHA;linha++) {
			
			for(coluna=0; coluna<COLUNA;coluna++) {
				
				System.out.print("\t ["+matriz[linha][coluna]+"]\t");
				
			}
			System.out.println("\n");
		}
		System.out.println("\n Valores maiores que 10: ");
		
	for(linha=0; linha<LINHA;linha++) {
		
		for(coluna=0;coluna<COLUNA;coluna++) {
			
			if(matriz[linha][coluna]>10) {
				System.out.print("\t["+matriz[linha][coluna]+"]");
			}
		}
	}
		
				
		
		
		
		
		sc.close();
	}

}