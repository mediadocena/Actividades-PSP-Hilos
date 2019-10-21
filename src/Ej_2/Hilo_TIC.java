package Ej_2;

public class Hilo_TIC implements Runnable {

	public void run() {
		while(true) {
			System.out.println("TIC");
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	
}
}
