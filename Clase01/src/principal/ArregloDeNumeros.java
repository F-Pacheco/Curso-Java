package principal;

public class ArregloDeNumeros {
	public static void main(String[] args) {
		//Carga e imprime un arreglo con numeros random entre -100 y 100
		
		int[] arreglo = new int[10];
		for (int i = 0; i<=9;i++) {
			arreglo[i]=(int) Math.round((Math.random() * 200) - 100);
		}
		System.out.print("|");
		for (int j=0;j<=9;j++){
			System.out.print(arreglo[j] + "|");
		}
	}
	
}
