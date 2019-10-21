package Ej_2_6;

public class EjemploHiloPrioridad1 {

	public static void main(String[] args) {
		HiloPrioridad1 h1 = new HiloPrioridad1("Hilo1");
		HiloPrioridad1 h2 = new HiloPrioridad1("Hilo2");
		HiloPrioridad1 h3 = new HiloPrioridad1("Hilo3");
		
		h1.setPriority(Thread.MAX_PRIORITY);
		h2.setPriority(Thread.MIN_PRIORITY);
		h3.setPriority(Thread.NORM_PRIORITY);
		
		h1.start();
		h2.start();
		h3.start();
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		h1.pararHilo();
		h2.pararHilo();
		h3.pararHilo();
	}

}
