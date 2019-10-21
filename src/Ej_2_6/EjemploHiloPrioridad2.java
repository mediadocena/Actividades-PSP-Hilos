package Ej_2_6;

public class EjemploHiloPrioridad2 extends Thread{
	EjemploHiloPrioridad2(String nom){
		this.setName(nom);
	}
	public void run() {
		System.out.println("Ejecutando["+getName() +"]");
		for (int i = 0; i <=5; i++) {
			System.out.println("\t("+getName()+":"+i+")");
		}
	}
	public static void main(String [] args) {
		EjemploHiloPrioridad2 h1 = new EjemploHiloPrioridad2("uno");
		EjemploHiloPrioridad2 h2 = new EjemploHiloPrioridad2("dos");
		EjemploHiloPrioridad2 h3 = new EjemploHiloPrioridad2("tres");
		EjemploHiloPrioridad2 h4 = new EjemploHiloPrioridad2("cuatro");
		EjemploHiloPrioridad2 h5 = new EjemploHiloPrioridad2("cinco");
		
		h1.setPriority(3);
		h2.setPriority(Thread.MIN_PRIORITY);
		h3.setPriority(7);
		h4.setPriority(Thread.MAX_PRIORITY);
		h5.setPriority(Thread.NORM_PRIORITY);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
	}
}
