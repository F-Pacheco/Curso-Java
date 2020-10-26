package principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Desea jugar");
		boolean jugar = teclado.next().equalsIgnoreCase("y");
		if (jugar) {	
			final int magicNum = (int) Math.round(Math.random() * 10);
			int choice = 0, cont = 0;
			String pista;
			do {
				if (cont > 0) {
					pista = (magicNum > choice)?"muy bajo":"muy alto";
					System.out.println("El numero es "+ pista +" vuelva a ingresar un numero: ");
				}else {
					System.out.print("Ingrese un numero: ");
				}
				choice = teclado.nextInt();
				if (magicNum == choice) {
					jugar = false;
				}
				cont++;
			}while (jugar);
			System.out.println("Adivnó el numero en la ronda " + cont);
		}
		System.out.println("Hasta luego");
		
	}
}
