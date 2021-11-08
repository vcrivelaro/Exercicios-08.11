package Familia38;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		double r, s,d;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Favor informar valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Favor informar valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Favor informar valor de C: ");
		c = ler.nextInt();
		
		r= Math.pow((a+b), 2);                  //(a+b)*2    // (a+b) *(a+b)
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.println("O valor de R é " + r);
		System.out.println("O valor de S é " + s);
		System.out.println("O valor de D é " + d);
	}

}
