package Familia38;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int anos, dias, meses, totalDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nFavor informe sua idade em dias: ");
		totalDias= ler.nextInt();
		
		
		anos = totalDias/365;
		meses= (totalDias%365)/30;
		dias= (totalDias%365) %30;
		
		System.out.println("\nVoc� viveu um total de: " + anos + " anos, " + meses + " meses e " + dias + "dias.");
	}

}
