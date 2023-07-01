package PRACTICA_01;

import java.util.Scanner;

import LIBRERIA_P.Generica_P;

public class Pasajero {
	public String nombre;
	public long cedula;
	Scanner in = new Scanner(System.in);
	
	Generica_P <String, Long> dmenu = new Generica_P <String,Long>();
	
	public Pasajero(String nombre_, long cedula_){
		this.nombre = nombre_;
		this.cedula =cedula_;
	}
	
	public void ingresarPasajero() {
		System.out.print("Nombre del pasajero: ");
		nombre = in.next();
		dmenu.setAtributoT1(nombre);
		dmenu.addElemento(nombre);
		System.out.print("CI del pasajero: ");
		cedula = in.nextLong();
		dmenu.addElemento2(cedula);
		dmenu.setAtributoS1(cedula);
	}
	
	public void buscarP(long buscar) {
		if(dmenu.getAlmacen2().contains(buscar)){
			int pos = dmenu.getAlmacen2().indexOf(buscar);
		    System.out.println("\nEl boleto si existe en la posicion " + (pos+1));
		    System.out.println(dmenu.getAlmacen());
		    for (int i = 0; i < dmenu.getAlmacen().size(); i++) {
				System.out.print(" " + (i+1) + "\t");
			}
		}else{
		    System.out.println("\nEl boleto no existe...\n");
		}
	}
					
	public String getPasajero() {
		return " Nombre: " + dmenu.getAtributoT1() + "\n" +
			   " CI: " + dmenu.getAtributoS1();
	}
}
