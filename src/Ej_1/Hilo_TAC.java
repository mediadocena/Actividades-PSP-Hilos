package Ej_1;
public class Hilo_TAC extends Thread{


	public void run() {
		while(true) {
			System.out.println("TAC");
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
}
