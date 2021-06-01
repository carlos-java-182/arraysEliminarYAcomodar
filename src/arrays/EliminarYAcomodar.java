package arrays;

import java.util.Scanner;

public class EliminarYAcomodar {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int posicion=0, j=0;;
		
		
		int arreglo[]= new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.print(i+ ".- Digita un número: ");
			arreglo[i]=entrada.nextInt();
		}
		
		
		do {
		System.out.println("Digita un posición entre 0-9");
		posicion=entrada.nextInt();
		
		}while(posicion >9 || posicion <0 );
		
		
		for(int i=posicion; i<9; i++) {
			
			arreglo[i]=arreglo[(i+1)];
			
			
		}
		

		
	
	for(int i=0; i<9; i++) {
		System.out.println(i+ ".- el número es: "+arreglo[i]);
	}

}}
