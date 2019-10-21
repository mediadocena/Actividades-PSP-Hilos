package Ej_2_4;

import Utiles.Salieri;

public class Main {

	public static void main(String[] args) {
		Salieri ex = new Salieri();
		MyHilo h = new MyHilo();
			String cadena;
			h.start();
			do {
			cadena = ex.controlaStringSt("Introduzca una cadena de texto:");
			if(cadena.equalsIgnoreCase("s")) {
				h.Suspende();
			}else if(cadena.equalsIgnoreCase("r")) {
				h.Reanuda();
			}
			}while(cadena.equalsIgnoreCase("*")==false);
		
			h.Finalizar();
	}

}
