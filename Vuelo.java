package PRACTICA_01;

import java.util.Random;
import java.util.Scanner;

import LIBRERIA_P.Generica_P;

public class Vuelo {
	
	Scanner in = new Scanner(System.in);
	protected Generica_P <String, String> datosV;
		
	public Vuelo(String paisOrigen, String paisDestrino) {
		datosV = new Generica_P <String, String> (paisOrigen, paisDestrino);
	}
	
	public void ingresarVuelo() {
		System.out.print("Pais de Origen: ");
		datosV.setAtributoT1(in.next());
		System.out.print("Destino: ");
		datosV.setAtributoT2(in.next());
	}
	
	public int numVuelo(){
		int aleatorio = 0;
		aleatorio = (int) (Math.random()* 10000 + 1);
		return aleatorio;
	}
		
	// GENERAR UNA LETRAR ALEATORIA
	Random random = new Random();
	public char letraVuelo() {
		char randomizedCharacter = (char) (random.nextInt(26) + 'A');
		return randomizedCharacter;
	}
				
	public String getVuelo() {
		return " Numero de vuelo: " + letraVuelo() + letraVuelo() +numVuelo() + "\n" +
			   " Pais Destino: " + datosV.getAtributoT2() + "\n" +
			   " Pais de Origen: " + datosV.getAtributoT1();
	}
}
