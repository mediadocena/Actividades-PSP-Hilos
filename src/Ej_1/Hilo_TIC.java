package Ej_1;
public class Hilo_TIC extends Thread{

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
