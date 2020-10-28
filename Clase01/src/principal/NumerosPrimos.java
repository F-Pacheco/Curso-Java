package principal;

import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Ingrese un numero para determinar si es primo o no");
		int valor = keyboard.nextInt();
		int aux, i;
		if (valor > 100003) {
			i = 9593;
			int aux2 = 0, aux3=0;
			while( aux2 < valor ) {
				aux3= i;
				i*=2;
				aux2 = nthPrime(i);
			}
			i=aux3;
		}else {
			i=0;
		}
		for (aux = 0; aux < valor;i++) {
			aux = nthPrime(i);
		}
		String respuesta = (aux == valor)?"Es primo": "No es primo";
		System.out.println(respuesta);
	}
	
	public static int nthPrime(int n) {
	    if (n < 2) return 2;
	    if (n == 2) return 3;
	    int limit, root, count = 1;
	    limit = (int)(n*(Math.log(n) + Math.log(Math.log(n)))) + 3;
	    root = (int)Math.sqrt(limit) + 1;
	    limit = (limit-1)/2;
	    root = root/2 - 1;
	    boolean[] sieve = new boolean[limit];
	    for(int i = 0; i < root; ++i) {
	        if (!sieve[i]) {
	            ++count;
	            for(int j = 2*i*(i+3)+3, p = 2*i+3; j < limit; j += p) {
	                sieve[j] = true;
	            }
	        }
	    }
	    int p;
	    for(p = root; count < n; ++p) {
	        if (!sieve[p]) {
	            ++count;
	        }
	    }
	    return 2*p+1;
	}
	
}
