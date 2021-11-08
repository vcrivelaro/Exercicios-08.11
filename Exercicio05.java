package Familia38;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		float n1,n2,n3,media;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1= ler.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		n2= ler.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		n3= ler.nextFloat();
		
		media = (n1*2+n2*3+n3+5)/10;
		
		System.out.println("A média do Aluno foi de: " +media);
		
		System.out.printf("A média do aluno foi de: %2.2f",media);
	}

}
