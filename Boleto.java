package PRACTICA_01;

import LIBRERIA_P.Generica_P;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Boleto extends Vuelo{
	
	@SuppressWarnings("unused")
	private Generica_P <Date, Integer> datosB;
	private Pasajero cliente;
	private String fsalida;
	Scanner sc = new Scanner(System.in);
	
	// OBTENER FECHA
	Date fecha = new Date(); // FECHA DEL DIA 
	// 					 aa/mm/dd
	// FECHA PROPIA      (116,5,3)
	// 166: TENER EN CUENTA QUE SOLO FUNCIONA DESDE 1900 ASI QUE SE LE SUMA PARA OBTENER UNA FECHA DESEADA
	// 5: MES (MAYO) TENER EN CUENTA QUE ES UN VECTOR Y EMPIESA DESCE 0
	// 3: DIA
	//					   aa m d  h m s
	// HORA EXACTA       (116,5,3,10,5,6)
	
	public Boleto(String paisOrigen, String paisDestrino, Date fechaSalida, Date hora, int asiento, Pasajero cliente_) {
		super(paisOrigen, paisDestrino);
		datosB = new Generica_P <Date, Integer> (fechaSalida,hora,asiento);
		this.cliente = cliente_;
	}
	
	// GENERAR UNA LETRAR ALEATORIA
	Random random = new Random();
	public char letraAsiento() {
		char randomizedCharacter = (char) (random.nextInt(26) + 'A');
		return randomizedCharacter;
	}
		
	public int numAsineto(){
		int aleatorio = 0;
		aleatorio = (int) (Math.random()*200 + 1);
		return aleatorio;
	}
	
	public void ingresarFecha() {
		System.out.print("Introduzca la fecha [dd/mm/yyyy]: ");
        fsalida = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date testDate = null;
        String date = fsalida;
        
        try{
            testDate = df.parse(date); // OBJ 'DATE' CREADO CON FECHA INGRESADA
        } catch (Exception e){ System.out.println("\nFormato invalido");}
        if (!df.format(testDate).equals(date)){
            System.out.println("\nFecha invalida!!");
        } else {
            System.out.println("\nFecha ingresada");
        }
	}
						
	public void getBoleto() {
		System.out.println("= = = = = = = = = = = = = = =");
		System.out.println(" FECHA DE ELABORACION:\n " + fecha);
		System.out.println("= = = = = = = = = = = = = = =");
		System.out.println(getVuelo());
		System.out.println("= = = = = = = = = = = = = = =");
		System.out.print(" FECHA DE SALIDA: " + fsalida);
		System.out.println("\n= = = = = = = = = = = = = = =");
		System.out.println(cliente.getPasajero());
		System.out.println(" Asiento: " + numAsineto() + " " + letraAsiento());
		System.out.println("= = = = = = = = = = = = = = =\n");
	}
}
