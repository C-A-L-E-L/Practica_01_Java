package PRACTICA_01;

import java.util.Scanner;

public class Ejecutable_P1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int opc;
		long buscar;
		Scanner in = new Scanner(System.in);
		
		Pasajero psj = new Pasajero("---", 9999); 
		Boleto blt = new Boleto(null, null, null, null, 0, psj);
		
		do {
			System.out.println("+ + MENU + +\n");
			System.out.println("1. Ingresar Pasajero");
			System.out.println("2. Ingresar Vuelo");
			System.out.println("3. Mostrar Boleto");
			System.out.println("4. Buscar");
			System.out.println("0. Salir");
			System.out.print("Ingrese una opcion: ");
			opc = in.nextInt();
			
			switch (opc) {
				case 1:
					System.out.println("\n- INGRESO DE PASEJO -");
					psj.ingresarPasajero();
					System.out.println();
					break;
					
				case 2:
					System.out.println("\n- INGRESO DE VUELO -");
					blt.ingresarVuelo();
					blt.ingresarFecha();
					System.out.println();
					break;
					
				case 3:
					System.out.println("\n     - MOSTRAR BOLETO -");
					blt.getBoleto();
					break;
					
				case 4:
					System.out.println("\n- BUSCAR -");
					System.out.print("Ingrese CI del pasajero: ");
					buscar = in.nextLong();
					psj.buscarP(buscar);
					System.out.println("\n");
					break;
					
				case 0:
					System.out.println("\nSaliendo....");
					break;
	
				default:
					System.out.println("\n ERROR OPC INCORECTA....");
					break;
			}
		}while(opc !=0);
	}
}
